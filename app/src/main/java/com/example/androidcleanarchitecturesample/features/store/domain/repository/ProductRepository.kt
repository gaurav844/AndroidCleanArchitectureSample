package com.example.androidcleanarchitecturesample.features.store.domain.repository

import arrow.core.Either
import com.example.androidcleanarchitecturesample.features.store.domain.model.NetworkError
import com.example.androidcleanarchitecturesample.features.store.domain.model.Product

interface ProductsRepository {

    suspend fun getProducts(): Either<NetworkError, List<Product>>

}