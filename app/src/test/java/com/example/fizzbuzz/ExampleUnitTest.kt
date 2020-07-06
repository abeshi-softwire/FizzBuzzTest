package com.example.fizzbuzz

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class FizzBuzzTest {
    @Test
    fun fizzbuzz_1() {
        // Just to test that the function is producing some output.
        assertEquals("1", fizzbuzz(1))
    }
}