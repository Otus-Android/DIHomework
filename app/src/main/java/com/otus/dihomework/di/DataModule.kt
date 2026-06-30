package com.otus.dihomework.di

import com.otus.dihomework.common.data.FavoritesRepositoryImpl
import com.otus.dihomework.common.data.ProductRepositoryImpl
import com.otus.dihomework.common.domain_impl.FavoritesRepository
import com.otus.dihomework.common.domain_impl.ProductRepository
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

/**
 * Модуль для предоставления зависимостей уровня данных.
 */
@Module
interface DataModule {

    /**
     * Связывает реализацию репозитория продуктов с его интерфейсом.
     */
    @Binds
    @Singleton
    fun bindProductRepository(impl: ProductRepositoryImpl): ProductRepository

    /**
     * Связывает реализацию репозитория избранного с его интерфейсом.
     */
    @Binds
    @Singleton
    fun bindFavoritesRepository(impl: FavoritesRepositoryImpl): FavoritesRepository
}
