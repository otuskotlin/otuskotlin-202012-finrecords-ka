package ru.alkarps.finrecords.ka.backend

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class HelloWorldKtTest {

    @Test
    fun `test helloWorld`() {
        assertEquals("Hello World!", helloWorld())
    }
}