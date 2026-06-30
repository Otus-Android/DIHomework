package com.otus.dihomework.common.data

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

/**
 * Удаленный источник данных для получения продуктов из API.
 */
class ProductRemoteDataSource @Inject constructor(
    private val apiService: ProductApiService
) {

    fun consumeProducts(): Flow<List<ProductDto>> = flow {
        emit(apiService.getProducts())
    }
}
