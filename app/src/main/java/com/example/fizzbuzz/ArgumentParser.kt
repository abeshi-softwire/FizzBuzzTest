package com.example.fizzbuzz

class ArgumentParser(val args: Array<String>) {
    val helpText = """
        Usage: main [options] [maxVal]
        Options:
            --help              print this help and exit
            --enable [number]   enable the rule for that number
            --disable [number]  disable the rule for that number
    """.trimIndent()
    var helpOption = false
    var errorMsg: String? = null
    var toggleRules = mutableMapOf(
        3 to true,
        5 to true,
        7 to true,
        11 to true,
        13 to true,
        17 to true
    )
    var maxVal = 100
    //var customFunctions = mutableMapOf<Int, Boolean>()
    init {
        // Parse args
        var nextArgEnable: Boolean? = null
        for (arg in args) {
            if (errorMsg != null) break
            when (arg) {
                "--help" -> helpOption = true
                "--enable" -> nextArgEnable = true
                "--disable" -> nextArgEnable = false
                else -> {
                    if (nextArgEnable != null) {
                        arg.toIntOrNull()?.let {
                            toggleRules[it] = nextArgEnable ?: false
                        } ?: let {
                            errorMsg = "Expected int, got $arg"
                        }
                        nextArgEnable = null
                    } else {
                        // MaxVal
                        arg.toIntOrNull()?.let {
                            maxVal = it
                        } ?: let {
                            errorMsg = "Expected int, got $arg"
                        }
                    }
                }
            }
        }
    }
}