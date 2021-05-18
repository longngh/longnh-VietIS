package edu.poly.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Demo {
    @RequestMapping("/")
    public String index(){
        return "home";
    }
}
