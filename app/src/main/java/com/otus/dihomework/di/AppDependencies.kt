package com.otus.dihomework.di

import com.otus.dihomework.common.di.Dependencies
import com.otus.dihomework.common.domain_api.ConsumeFavoritesUseCase
import com.otus.dihomework.common.domain_api.ConsumeProductsUseCase
import com.otus.dihomework.common.domain_api.ToggleFavoriteUseCase
import com.otus.dihomework.common.util.PriceFormatter

interface AppDependencies : Dependencies {
    fun consumeProductsUseCase(): ConsumeProductsUseCase
    fun consumeFavoritesUseCase(): ConsumeFavoritesUseCase
    fun toggleFavoriteUseCase(): ToggleFavoriteUseCase
    fun priceFormatter(): PriceFormatter
}
