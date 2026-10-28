package com.otus.dihomework.features.favorites

import com.otus.dihomework.common.di.FeatureScope
import dagger.Subcomponent

@FeatureScope
@Subcomponent
interface FavoritesComponent {
    fun viewModelFactory(): FavoritesViewModelFactory

    @Subcomponent.Factory
    interface Factory {
        fun create(): FavoritesComponent
    }
}
