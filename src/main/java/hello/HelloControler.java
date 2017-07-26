package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lumba on 26.07.17..
 */
public class HelloControler {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
