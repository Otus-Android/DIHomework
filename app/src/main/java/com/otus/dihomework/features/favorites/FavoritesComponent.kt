package com.otus.dihomework.features.favorites

import com.otus.dihomework.common.di.FeatureScope
import dagger.Subcomponent

/**
 * Сабкомпонент для фичи Favorites.
 */
@FeatureScope
@Subcomponent
interface FavoritesComponent {

    /**
     * Предоставляет фабрику для создания FavoritesViewModel.
     */
    fun viewModelFactory(): FavoritesViewModelFactory

    /**
     * Фабрика для создания экземпляра FavoritesComponent.
     */
    @Subcomponent.Factory
    interface Factory {
        /**
         * Создает экземпляр FavoritesComponent.
         */
        fun create(): FavoritesComponent
    }
}
