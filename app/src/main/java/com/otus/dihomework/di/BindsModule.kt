package com.otus.dihomework.di

import com.otus.dihomework.common.data.FavoritesRepositoryImpl
import com.otus.dihomework.common.data.ProductRepositoryImpl
import com.otus.dihomework.common.domain_api.ConsumeFavoritesUseCase
import com.otus.dihomework.common.domain_api.ConsumeProductsUseCase
import com.otus.dihomework.common.domain_api.ToggleFavoriteUseCase
import com.otus.dihomework.common.domain_impl.ConsumeFavoritesUseCaseImpl
import com.otus.dihomework.common.domain_impl.ConsumeProductsUseCaseImpl
import com.otus.dihomework.common.domain_impl.FavoritesRepository
import com.otus.dihomework.common.domain_impl.ProductRepository
import com.otus.dihomework.common.domain_impl.ToggleFavoriteUseCaseImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
interface BindsModule {
    @Binds
    @Singleton
    fun bindFavoritesRepository(impl: FavoritesRepositoryImpl): FavoritesRepository

    @Binds
    @Singleton
    fun bindProductRepository(impl: ProductRepositoryImpl): ProductRepository

    @Binds
    fun bindConsumeProductsUseCase(impl: ConsumeProductsUseCaseImpl): ConsumeProductsUseCase

    @Binds
    fun bindConsumeFavoritesUseCase(impl: ConsumeFavoritesUseCaseImpl): ConsumeFavoritesUseCase

    @Binds
    fun bindToggleFavoriteUseCase(impl: ToggleFavoriteUseCaseImpl): ToggleFavoriteUseCase
}