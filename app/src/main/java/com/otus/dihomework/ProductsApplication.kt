package com.otus.dihomework

import android.app.Application
import com.otus.dihomework.di.AppComponent
import com.otus.dihomework.di.DaggerAppComponent
import com.otus.dihomework.di.DependenciesProvider

class ProductsApplication : Application(), DependenciesProvider {

    val component: AppComponent = DaggerAppComponent.factory().create(this)

    override fun getDependencies() = component
}
