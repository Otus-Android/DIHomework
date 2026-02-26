package com.otus.dihomework.di

import com.otus.dihomework.common.di.Dependencies
import com.otus.dihomework.common.domain_api.ConsumeFavoritesUseCase
import com.otus.dihomework.common.domain_api.ToggleFavoriteUseCase
import com.otus.dihomework.features.favorites.FavoritesStateFactory

interface FavoritesDependencies : Dependencies {
    fun consumeFavoritesUseCase(): ConsumeFavoritesUseCase
    fun toggleFavoriteUseCase(): ToggleFavoriteUseCase
    fun favoritesStateFactory(): FavoritesStateFactory
}
