package com.otus.dihomework.di

import com.otus.dihomework.common.di.FeatureScope
import com.otus.dihomework.features.products.ProductsViewModelFactory
import dagger.Component

@FeatureScope
@Component(dependencies = [ProductDependencies::class])
interface ProductsComponent {
    fun viewModelFactory(): ProductsViewModelFactory

    @Component.Factory
    interface Factory {
        fun create(dependencies: ProductDependencies): ProductsComponent
    }
}