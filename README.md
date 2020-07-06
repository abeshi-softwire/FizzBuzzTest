# FizzBuzz

A simple kotlin program to help familiarize myself with the language
Current rules:
- Multiple of 3, 5: fizzbuzz as normal
- Multiple of 7: append "bang"
- Multiple of 11: print "bong", and nothing else
- Multiple of 13: print "fezz" immediately before the first b-word, or at the end otherwise.
- Multiple of 17: reverse the tokens.

There is some ambiguity in these instructions, due to order of evaluation. For example,
if we have `3 * 7 * 17 = 357`, the output could be "bangfizz" (evaluated in the order 3, 7, 17)
or the output could be "fizzbang" (evaluated in the order 17, 3, 7).
For the sake of avoiding undefined behaviour, this implementation chooses to evaluate them in
numerical order, lowest first.
