package micronaut.howdy

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("micronaut.howdy")
                .mainClass(Application.javaClass)
                .start()
    }
}