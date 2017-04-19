package com.natpryce.hamkrest

import com.natpryce.hamkrest.assertion.assert
import org.junit.Test

class Utilities {
    @Test
    fun splits_identifier_into_words() {
        val cases = listOf(
                "identifier" to listOf("identifier"),
                "an_identifier" to listOf("an", "identifier"),
                "anIdentifier" to listOf("an", "identifier"),
                "farenheit451" to listOf("farenheit", "451"),
                "i_got_99_problems" to listOf("i", "got", "99", "problems")
        )
        
        for ((identifier, words) in cases) {
            assert.that(identifierToWords(identifier), equalTo(words)) {
                "${describe(identifier)} to words"
            }
        }
    }
}