package micronaut.howdy.controller

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/howdy")
open class GreetingController1 {

    @Get(processes = [MediaType.TEXT_PLAIN])
    internal fun howdy(): String {
        return "Howdy from Micronaut!!"
    }
}
