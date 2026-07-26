package com.otus.dihomework.di

import com.otus.dihomework.common.domain_api.ConsumeProductsUseCase
import com.otus.dihomework.common.domain_api.ToggleFavoriteUseCase
import com.otus.dihomework.common.util.PriceFormatter
import com.otus.dihomework.features.products.ProductsStateFactory

interface ProductDependencies: Dependencies {
    fun consumeProductsUseCase(): ConsumeProductsUseCase
    fun toggleFavoriteUseCase(): ToggleFavoriteUseCase
    fun priceFormatter(): PriceFormatter
    fun productsStateFactory(): ProductsStateFactory
}