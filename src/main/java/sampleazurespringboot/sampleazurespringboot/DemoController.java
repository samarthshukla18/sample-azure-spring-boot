package sampleazurespringboot.sampleazurespringboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
@GetMapping(path = "/")
    public String demo(){
        return "index";
    }
}
