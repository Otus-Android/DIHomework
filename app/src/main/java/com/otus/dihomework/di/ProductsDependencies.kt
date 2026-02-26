package com.otus.dihomework.di

import com.otus.dihomework.common.di.Dependencies
import com.otus.dihomework.common.domain_api.ConsumeProductsUseCase
import com.otus.dihomework.common.domain_api.ToggleFavoriteUseCase
import com.otus.dihomework.features.products.ProductsStateFactory

interface ProductsDependencies : Dependencies {
    fun consumeProductsUseCase(): ConsumeProductsUseCase
    fun toggleFavoriteUseCase(): ToggleFavoriteUseCase
    fun productsStateFactory(): ProductsStateFactory
}
