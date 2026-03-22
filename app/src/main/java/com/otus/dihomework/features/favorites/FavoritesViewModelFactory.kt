package com.otus.dihomework.features.favorites

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.otus.dihomework.common.di.FeatureScope
import javax.inject.Inject
import javax.inject.Provider

@FeatureScope
class FavoritesViewModelFactory @Inject constructor(
    private val viewModelProvider: Provider<FavoritesViewModel>
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        require(modelClass == FavoritesViewModel::class.java)
        return viewModelProvider.get() as T
    }
}
