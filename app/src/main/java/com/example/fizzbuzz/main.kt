package com.example.fizzbuzz

import kotlin.text.StringBuilder

fun fizzbuzz(num : Int) : String {
    val builder = StringBuilder()
    if (num % 3 == 0)
        builder.append("fizz")
    if (num % 5 == 0)
        builder.append("buzz")
    if (num % 7 == 0)
        builder.append("bang")
    if (num % 11 == 0) {
        builder.clear()
        builder.append("bong")
    }
    if (builder.length != 0)
        return builder.toString()
    return "$num"
}

fun main() {
    println("Hello world!")

    val maxVal = 100
    for (index in 1..maxVal) {
        // Can be extended...

        val fbString = fizzbuzz(index)
        println(fbString)
    }
}