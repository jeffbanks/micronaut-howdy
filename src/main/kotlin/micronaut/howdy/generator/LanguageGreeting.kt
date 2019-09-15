package micronaut.howdy.generator

import java.util.*

/**
 * Interface for greeting based on locale input.
 */
interface LanguageGreeting {
    fun sayHowdyIn(language: Locale):String
}