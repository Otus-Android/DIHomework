package com.otus.dihomework.features.products

import com.otus.dihomework.common.di.FeatureScope
import dagger.Component

@FeatureScope
@Component(dependencies = [ProductsDependencies::class])
interface ProductsComponent {
    fun viewModelFactory(): ProductsViewModelFactory

    @Component.Factory
    interface Factory {
        fun create(dependencies: ProductsDependencies): ProductsComponent
    }
}
