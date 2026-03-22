package com.otus.dihomework

import android.app.Application
import com.otus.dihomework.common.di.Dependencies
import com.otus.dihomework.common.di.DependenciesProvider
import com.otus.dihomework.di.AppComponent
import com.otus.dihomework.di.DaggerAppComponent

class ProductsApplication : Application(), DependenciesProvider {

    lateinit var appComponent: AppComponent
        private set

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.factory().create(applicationContext)
    }

    override fun getDependencies(): Dependencies {
        return appComponent
    }
}
