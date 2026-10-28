package com.otus.dihomework.di

import com.otus.dihomework.common.di.ActivityScope
import com.otus.dihomework.features.favorites.FavoritesComponent
import com.otus.dihomework.features.products.ProductsDependencies
import dagger.Component

@ActivityScope
@Component(
    dependencies = [AppDependencies::class],
    modules = [SubcomponentsModule::class]
)
interface MainActivityComponent : ProductsDependencies {
    fun favoritesComponent(): FavoritesComponent.Factory

    @Component.Factory
    interface Factory {
        fun create(appDependencies: AppDependencies): MainActivityComponent
    }
}
