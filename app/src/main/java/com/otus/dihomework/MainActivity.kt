package com.otus.dihomework

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.otus.dihomework.common.di.findDependencies
import com.otus.dihomework.di.AppComponent
import com.otus.dihomework.di.DaggerMainActivityComponent
import com.otus.dihomework.features.favorites.FavoritesViewModelFactory
import com.otus.dihomework.features.products.DaggerProductsComponent
import com.otus.dihomework.features.products.ProductsViewModelFactory
import com.otus.dihomework.ui.theme.DIHomeworkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val appComponent = applicationContext.findDependencies<AppComponent>()
        val activityComponent = DaggerMainActivityComponent.factory().create(appComponent)
        val productsViewModelFactory = DaggerProductsComponent.factory()
            .create(activityComponent)
            .viewModelFactory()
        val favoritesViewModelFactory = activityComponent
            .favoritesComponent()
            .create()
            .viewModelFactory()

        setContent {
            DIHomeworkTheme {
                MainNavigation(
                    productsViewModelFactory = productsViewModelFactory,
                    favoritesViewModelFactory = favoritesViewModelFactory
                )
            }
        }
    }
}
