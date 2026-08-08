package com.otus.dihomework.di

import android.content.Context
import com.otus.dihomework.common.data.FavoritesRepositoryImpl
import com.otus.dihomework.common.data.ProductApiService
import com.otus.dihomework.common.data.ProductDomainMapper
import com.otus.dihomework.common.data.ProductRemoteDataSource
import com.otus.dihomework.common.data.ProductRepositoryImpl
import com.otus.dihomework.common.domain_impl.FavoritesRepository
import com.otus.dihomework.common.domain_impl.ProductRepository
import dagger.Module
import dagger.Provides

@Module
class RepositoryModule {

    @Provides
    fun getProductRepository(
        remoteDataSource: ProductRemoteDataSource,
        mapper: ProductDomainMapper
    ): ProductRepository = ProductRepositoryImpl(remoteDataSource, mapper)

    @Provides
    fun getFavoritesRepository(context: Context): FavoritesRepository =
        FavoritesRepositoryImpl(context)

    @Provides
    fun productRemoteDataSource(
        apiService: ProductApiService,
    ): ProductRemoteDataSource = ProductRemoteDataSource(apiService)
}