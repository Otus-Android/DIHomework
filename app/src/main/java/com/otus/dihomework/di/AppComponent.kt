package com.otus.dihomework.di

import android.content.Context
import com.otus.dihomework.common.domain_api.ConsumeProductsUseCase
import com.otus.dihomework.common.domain_api.ToggleFavoriteUseCase
import com.otus.dihomework.features.products.ProductsStateFactory
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class, AppModule::class, SubcomponentsModule::class])
interface AppComponent : ProductsDependencies {

    fun favoritesComponent(): FavoritesComponent.Factory

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    override fun consumeProductsUseCase(): ConsumeProductsUseCase
    override fun toggleFavoriteUseCase(): ToggleFavoriteUseCase
    override fun productsStateFactory(): ProductsStateFactory
}

@dagger.Module(subcomponents = [FavoritesComponent::class])
interface SubcomponentsModule
