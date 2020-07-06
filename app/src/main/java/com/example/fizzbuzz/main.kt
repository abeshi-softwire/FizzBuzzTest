package com.example.fizzbuzz

import kotlin.collections.ArrayList

fun fizzbuzz(num : Int) : String {
    var tokens = ArrayList<String>();
    val functionMap = mapOf(
        3 to {tok: ArrayList<String> -> tok.add("fizz");},
        5 to {tok: ArrayList<String> -> tok.add("buzz");},
        7 to {tok: ArrayList<String> -> tok.add("bang");},
        11 to {tok: ArrayList<String> -> tok.clear(); tok.add("bong");},
        13 to {tok: ArrayList<String> -> run {
            val itemWithB = tok.indexOfFirst { s -> s.startsWith("b") }
            if (itemWithB == -1) tok.add("fezz")
            else tok.add(itemWithB, "fezz")
        }; true},
        17 to {tok: ArrayList<String> -> tok.reverse(); true;}
    )
    for ((multiple, modifyFunc) in functionMap) {
        if (num % multiple == 0)
            // Could potentially check output of "modifyfunc" to see if modification was successful.
            modifyFunc(tokens)
    }
    if (tokens.size == 0)
        return "$num"
    return tokens.joinToString(separator = "")
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