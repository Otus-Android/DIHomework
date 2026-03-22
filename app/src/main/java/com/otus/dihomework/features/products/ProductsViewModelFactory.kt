package com.otus.dihomework.features.products

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.otus.dihomework.common.di.FeatureScope
import javax.inject.Inject
import javax.inject.Provider

@FeatureScope
class ProductsViewModelFactory @Inject constructor(
    private val viewModelProvider: Provider<ProductsViewModel>
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        require(modelClass == ProductsViewModel::class.java)
        return viewModelProvider.get() as T
    }
}
