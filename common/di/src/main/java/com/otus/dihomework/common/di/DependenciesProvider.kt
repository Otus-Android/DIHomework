package com.otus.dihomework.common.di

import android.content.Context

interface DependenciesProvider {
    fun getDependencies(): Dependencies
}

inline fun <reified T : Dependencies> Context.findDependencies(): T {
    return (applicationContext as DependenciesProvider).getDependencies() as T
}
