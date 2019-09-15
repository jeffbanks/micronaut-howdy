package micronaut.howdy.controller

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

import micronaut.howdy.generator.GreetingGenerator
import sun.util.locale.LanguageTag
import java.util.*

@Controller("/howdy")
open class GreetingController internal constructor(private var generator: GreetingGenerator) {

    @Get(uri = "/translate/{locale}", processes = [MediaType.TEXT_PLAIN])
    internal fun translate(locale: String): String {
        val tag: LanguageTag = LanguageTag.parse(locale, null)
        return generator.sayHowdyIn(Locale.forLanguageTag(tag.language))
    }
}