package com.example.androidcleanarchitecturesample.features.store.data.repository

import arrow.core.Either
import com.example.androidcleanarchitecturesample.features.store.data.maper.toGeneralError
import com.example.androidcleanarchitecturesample.features.store.data.remote.ProductsApi
import com.example.androidcleanarchitecturesample.features.store.domain.model.NetworkError
import com.example.androidcleanarchitecturesample.features.store.domain.model.Product
import com.example.androidcleanarchitecturesample.features.store.domain.repository.ProductsRepository
import javax.inject.Inject

class ProductsRepositoryImpl @Inject constructor(
    private val productsApi: ProductsApi
) : ProductsRepository {
    override suspend fun getProducts(): Either<NetworkError, List<Product>> {
        return Either.catch {
            productsApi.getProducts()
        }.mapLeft { it.toGeneralError() }
    }
}