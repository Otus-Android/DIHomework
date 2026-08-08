package com.otus.dihomework.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        NetModule::class,
        RepositoryModule::class,
        DomainModule::class,
        UtilsModule::class,
        SubcomponentsModule::class,
    ]
)
interface AppComponent : ProductDependencies {

    fun favoritesComponent(): FavoritesComponent.Factory

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance context: Context
        ): AppComponent
    }
}