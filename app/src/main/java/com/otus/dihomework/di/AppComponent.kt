package com.otus.dihomework.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        NetworkModule::class,
        DataModule::class,
        DomainModule::class,
        SubcomponentsModule::class,
    ]
)
interface AppComponent : ProductsDependencies {

    fun favoritesComponent(): FavoritesComponent.Factory

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }
}
