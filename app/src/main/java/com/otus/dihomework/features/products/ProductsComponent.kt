package com.otus.dihomework.features.products

import com.otus.dihomework.common.di.FeatureScope
import com.otus.dihomework.di.ProductsDependencies
import dagger.Component

/**
 * Компонент для фичи Products.
 * Использует Component Dependencies для получения необходимых зависимостей.
 */
@FeatureScope
@Component(dependencies = [ProductsDependencies::class])
interface ProductsComponent {

    /**
     * Предоставляет фабрику для создания ProductsViewModel.
     */
    fun viewModelFactory(): ProductsViewModelFactory

    /**
     * Фабрика для создания экземпляра ProductsComponent.
     */
    @Component.Factory
    interface Factory {
        /**
         * Создает экземпляр ProductsComponent на основе переданных зависимостей.
         */
        fun create(dependencies: ProductsDependencies): ProductsComponent
    }
}
