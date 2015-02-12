package hello

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, ResponseBody}

@Controller
@EnableAutoConfiguration
class HelloController {

    @RequestMapping(value=Array("/"),method=Array(RequestMethod.GET))
    @ResponseBody
    def home() : String = {
    	"Hello World!"
    }    
}