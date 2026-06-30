package com.otus.dihomework.di

import android.content.Context
import com.otus.dihomework.features.favorites.FavoritesComponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

/**
 * Основной компонент приложения.
 * Управляет жизненным циклом зависимостей, которые должны существовать в единственном экземпляре.
 */
@Singleton
@Component(
    modules = [
        NetworkModule::class,
        DataModule::class,
        DomainModule::class,
        SubcomponentsModule::class
    ]
)
interface AppComponent : ProductsDependencies {

    /**
     * Предоставляет фабрику для создания сабкомпонента избранного.
     */
    fun favoritesComponent(): FavoritesComponent.Factory

    /**
     * Фабрика для создания экземпляра AppComponent.
     */
    @Component.Factory
    interface Factory {
        /**
         * Создает экземпляр AppComponent, передавая контекст приложения.
         */
        fun create(@BindsInstance context: Context): AppComponent
    }
}
