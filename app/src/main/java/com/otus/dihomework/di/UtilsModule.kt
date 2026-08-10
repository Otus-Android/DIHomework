package com.otus.dihomework.di

import com.otus.dihomework.common.util.PriceFormatter
import dagger.Module
import dagger.Provides

@Module
class UtilsModule {

    @Provides
    fun getPriceFormatter(): PriceFormatter = PriceFormatter()
}