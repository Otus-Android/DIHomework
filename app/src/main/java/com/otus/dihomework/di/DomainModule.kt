package com.otus.dihomework.di

import com.otus.dihomework.common.domain_api.ConsumeFavoritesUseCase
import com.otus.dihomework.common.domain_api.ConsumeProductsUseCase
import com.otus.dihomework.common.domain_api.ToggleFavoriteUseCase
import com.otus.dihomework.common.domain_impl.ConsumeFavoritesUseCaseImpl
import com.otus.dihomework.common.domain_impl.ConsumeProductsUseCaseImpl
import com.otus.dihomework.common.domain_impl.ToggleFavoriteUseCaseImpl
import dagger.Binds
import dagger.Module

/**
 * Модуль для предоставления зависимостей уровня домена (бизнес-логики).
 */
@Module
interface DomainModule {

    /**
     * Связывает реализацию сценария получения продуктов с его интерфейсом.
     */
    @Binds
    fun bindConsumeProductsUseCase(impl: ConsumeProductsUseCaseImpl): ConsumeProductsUseCase

    /**
     * Связывает реализацию сценария получения избранного с его интерфейсом.
     */
    @Binds
    fun bindConsumeFavoritesUseCase(impl: ConsumeFavoritesUseCaseImpl): ConsumeFavoritesUseCase

    /**
     * Связывает реализацию сценария переключения избранного с его интерфейсом.
     */
    @Binds
    fun bindToggleFavoriteUseCase(impl: ToggleFavoriteUseCaseImpl): ToggleFavoriteUseCase
}
