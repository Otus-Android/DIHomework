package com.otus.dihomework.common.util

import javax.inject.Inject

/**
 * Утилита для форматирования цены продукта.
 */
class PriceFormatter @Inject constructor() {

    fun format(price: Double): String {
        return "${price.toInt()} ₽"
    }
}
