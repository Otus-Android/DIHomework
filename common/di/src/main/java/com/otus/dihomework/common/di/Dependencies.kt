package com.otus.dihomework.common.di

import android.content.Context

/**
 * Базовый интерфейс для зависимостей компонентов.
 * Используется как маркерный интерфейс для передачи зависимостей между компонентами.
 */
interface Dependencies

/**
 * Интерфейс, который должен реализовать класс Application для предоставления зависимостей.
 */
interface DependenciesProvider {
    /**
     * Возвращает зависимости для указанного типа.
     */
    fun getDependencies(): Dependencies
}

/**
 * Расширение для Context для поиска зависимостей в приложении.
 * Используется для получения зависимостей в UI слое (Activity/Fragment/Compose).
 */
inline fun <reified T : Dependencies> Context.findDependencies(): T {
    return (applicationContext as DependenciesProvider).getDependencies() as T
}
