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

Ideas about user-implemented rules:

It should be relatively easy to allow the user to switch on/off the current rules,
or even add some more of their own that follow the same pattern as 3, 5 and 7 
(appending names). However, arbitrary rules may be a fair bit more complex, depending on
what the user wants. We can implement simple rules, such as appending or reversing, but 
it seems almost impossible to create a rule like the current "13" rule which involves 
complicated logic and relies on previous tokens.

