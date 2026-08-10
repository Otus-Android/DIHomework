package com.otus.dihomework.di

import com.otus.dihomework.MainActivity
import com.otus.dihomework.di.scopes.ActivityScope
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule(private val activity: MainActivity) {

    @ActivityScope
    @Provides
    fun provideMainActivity(): MainActivity = activity
}