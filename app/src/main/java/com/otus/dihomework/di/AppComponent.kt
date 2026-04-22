package com.otus.dihomework.di

import android.content.Context
import com.otus.dihomework.features.favorites.di.FavoritesComponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
    NetworkModule::class,
    BindsModule::class,
    SubcomponentsModule::class
])
interface AppComponent : ProductsDependencies {

    // Для Component Dependencies (Products) методы уже объявлены в ProductsDependencies

    // Для Subcomponent (Favorites)
    fun favoritesComponent(): FavoritesComponent.Factory

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }
}