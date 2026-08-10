package com.otus.dihomework.di

import com.otus.dihomework.MainActivity
import com.otus.dihomework.di.scopes.ActivityScope
import dagger.Subcomponent

@ActivityScope
@Subcomponent(
    modules = [MainActivityModule::class]
)
interface MainActivityComponent {

    fun inject(activity: MainActivity)

    @Subcomponent.Factory
    interface Factory {
        fun create(
            mainActivityModule: MainActivityModule
        ): MainActivityComponent
    }
}