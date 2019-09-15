package micronaut.howdy.generator

import java.util.*
import javax.inject.Singleton
import javax.validation.constraints.NotBlank

const val TRANSLATION_UNKNOWN = "Unknown Greeting Translation"

@Singleton
class GreetingGenerator : LanguageGreeting {

    private val messages = mapOf(
            Locale.ENGLISH to "Howdy",
            Locale.FRENCH to "Salut",
            Locale.GERMAN to "Hallo")

    override fun sayHowdyIn(@NotBlank language:Locale):String {
        return messages.getOrDefault(language, TRANSLATION_UNKNOWN)
    }

}