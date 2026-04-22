package com.otus.dihomework.di

import android.content.Context
import com.otus.dihomework.common.domain_api.ConsumeProductsUseCase
import com.otus.dihomework.common.domain_api.ToggleFavoriteUseCase
import com.otus.dihomework.common.util.PriceFormatter

interface Dependencies
interface DependenciesProvider {
    fun getDependencies(): Dependencies
}

inline fun <reified T : Dependencies> Context.findDependencies(): T {
    return (applicationContext as DependenciesProvider).getDependencies() as T
}

// Зависимости, которые требуются фиче Products
interface ProductsDependencies : Dependencies {
    fun consumeProductsUseCase(): ConsumeProductsUseCase
    fun toggleFavoriteUseCase(): ToggleFavoriteUseCase
    fun priceFormatter(): PriceFormatter
}