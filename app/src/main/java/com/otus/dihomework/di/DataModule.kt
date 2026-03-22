package com.otus.dihomework.di

import com.otus.dihomework.common.data.FavoritesRepositoryImpl
import com.otus.dihomework.common.data.ProductRepositoryImpl
import com.otus.dihomework.common.domain_impl.FavoritesRepository
import com.otus.dihomework.common.domain_impl.ProductRepository
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class DataModule {

    @Binds
    @Singleton
    abstract fun bindProductRepository(impl: ProductRepositoryImpl): ProductRepository

    @Binds
    @Singleton
    abstract fun bindFavoritesRepository(impl: FavoritesRepositoryImpl): FavoritesRepository
}
