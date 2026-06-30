package com.otus.dihomework.di

import com.otus.dihomework.common.di.Dependencies
import com.otus.dihomework.common.domain_api.ConsumeProductsUseCase
import com.otus.dihomework.common.domain_api.ToggleFavoriteUseCase
import com.otus.dihomework.features.products.ProductsStateFactory

/**
 * Зависимости, необходимые для работы фичи Products.
 */
interface ProductsDependencies : Dependencies {
    /**
     * Сценарий получения продуктов.
     */
    fun consumeProductsUseCase(): ConsumeProductsUseCase

    /**
     * Сценарий переключения избранного.
     */
    fun toggleFavoriteUseCase(): ToggleFavoriteUseCase

    /**
     * Фабрика состояния для экрана продуктов.
     */
    fun productsStateFactory(): ProductsStateFactory
}
