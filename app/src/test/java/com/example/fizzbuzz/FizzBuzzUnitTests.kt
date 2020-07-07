package com.example.fizzbuzz

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class FizzBuzzTest {
    // All of these tests assume the operations are in increasing order: i.e.
    // 3 * 5 * 7 = 105 is evaluated 3 -> 5 -> 7 and not any other order.

    @Test
    fun fizzbuzz_1() {
        // Just to test that the function is producing some output.
        assertEquals("1", fizzbuzz(1))
    }

    @Test
    fun fizzbuzz_basic_mul35() {
        // Default fizzbuzz behaviour.
        assertEquals("fizz", fizzbuzz(3))
        assertEquals("buzz", fizzbuzz(5))
        assertEquals("fizzbuzz", fizzbuzz(3*5))
    }

    @Test
    fun fizzbuzz_extended_mul7() {
        // Each multiple of 7 should append "bang"
        assertEquals("fizzbang", fizzbuzz(3 * 7))
        assertEquals("buzzbang", fizzbuzz(5 * 7))
        assertEquals("fizzbuzzbang", fizzbuzz(3 * 5 * 7))
    }

    @Test
    fun fizzbuzz_extended_mul11() {
        // Each multiple of 11 should return just "bong"
        assertEquals("bong", fizzbuzz(11))
        assertEquals("bong", fizzbuzz(5 * 11))
    }

    @Test
    fun fizzbuzz_extended_mul13() {
        // Each multiple of 13, put Fezz before last "b-word" -- even if 11 is present.
        assertEquals("fezz", fizzbuzz(13))
        assertEquals("fezzbuzz", fizzbuzz(65))
        assertEquals("fizzfezzbuzz", fizzbuzz(3 * 5 * 13))
        assertEquals("fezzbong", fizzbuzz(11 * 13))
    }

    @Test
    fun fizzbuzz_extended_mul17() {
        // Reverse the order of the output
        assertEquals("buzzfizz", fizzbuzz(3 * 5 * 17))
        assertEquals("buzzfezzfizz", fizzbuzz(3 * 5 * 13 * 17))
    }
}