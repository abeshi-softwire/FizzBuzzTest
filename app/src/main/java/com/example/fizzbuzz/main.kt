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
    val values = functionMap.keys.sorted() // Checking in order 3, 5, 7...
    for (checkMultiple in values)
        if (num % checkMultiple == 0)
            // Could potentially check output to see if modification was successful.
            functionMap[checkMultiple]?.invoke(tokens)
    if (tokens.isEmpty())
        return "$num"
    return tokens.joinToString(separator = "")
}

fun main(args: Array<String>) {
    var maxVal = 100

    // If first argument is a number, set maxVal = args[0]
    // Else: tell user we're using default size.
    args.firstOrNull()?.toInt()?.let {
        maxVal = it
        println("Using specified size $maxVal")
    } ?: println("Using default size $maxVal")

    // We create a StringBuilder to build the output
    // since println() can be slow, we can create the string and only output once.
    val outputBuilder = StringBuilder()
    for (index in 1..maxVal) {
        val fbString = fizzbuzz(index)
        outputBuilder.append(fbString)
        outputBuilder.append('\n')
    }
    print(outputBuilder.toString())
}