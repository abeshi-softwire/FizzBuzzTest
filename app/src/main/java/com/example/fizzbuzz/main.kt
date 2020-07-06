package com.example.fizzbuzz

import kotlin.text.StringBuilder

fun main() {
    println("Hello world!")

    val maxVal = 100
    for (index in 1..maxVal) {
        val builder = StringBuilder()
        if (index % 3 == 0)
            builder.append("fizz")
        if (index % 5 == 0)
            builder.append("buzz")
        // Can be extended...

        val fbString = builder.toString()
        if (fbString.length != 0)
            println(fbString)
        else
            println(index)
    }
}