package com.example.androidcleanarchitecturesample.features.store.data.remote

import com.example.androidcleanarchitecturesample.features.store.domain.model.Product
import retrofit2.http.GET

interface ProductsApi {

    @GET("products")
    suspend fun getProducts(): List<Product>

}