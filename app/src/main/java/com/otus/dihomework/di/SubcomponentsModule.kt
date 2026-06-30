package com.otus.dihomework.di

import com.otus.dihomework.features.favorites.FavoritesComponent
import dagger.Module

/**
 * Модуль для подключения сабкомпонентов к основному графу AppComponent.
 */
@Module(subcomponents = [FavoritesComponent::class])
class SubcomponentsModule
