package com.otus.dihomework.di

import com.otus.dihomework.features.favorites.FavoritesComponent
import dagger.Module

@Module(subcomponents = [FavoritesComponent::class])
class SubcomponentsModule
