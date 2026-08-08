package com.otus.dihomework.di

import com.otus.dihomework.common.domain_api.ConsumeFavoritesUseCase
import com.otus.dihomework.common.domain_api.ConsumeProductsUseCase
import com.otus.dihomework.common.domain_api.ToggleFavoriteUseCase
import com.otus.dihomework.common.domain_impl.ConsumeFavoritesUseCaseImpl
import com.otus.dihomework.common.domain_impl.ConsumeProductsUseCaseImpl
import com.otus.dihomework.common.domain_impl.ToggleFavoriteUseCaseImpl
import dagger.Binds
import dagger.Module

@Module
abstract class DomainModule {

    @Binds
    abstract fun getConsumeFavoritesUseCase(impl: ConsumeFavoritesUseCaseImpl): ConsumeFavoritesUseCase

    @Binds
    abstract fun getConsumeProductsUseCase(impl: ConsumeProductsUseCaseImpl): ConsumeProductsUseCase

    @Binds
    abstract fun getToggleFavoriteUseCase(impl: ToggleFavoriteUseCaseImpl): ToggleFavoriteUseCase
}