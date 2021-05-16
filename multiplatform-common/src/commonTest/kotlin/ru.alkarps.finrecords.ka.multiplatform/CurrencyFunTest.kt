package ru.alkarps.finrecords.ka.multiplatform

import kotlin.test.Test
import kotlin.test.assertTrue

class CurrencyFunTest {
    @Test
    fun isRubleTest() {
        assertTrue { isRuble(Currency.RUB) }
    }
}