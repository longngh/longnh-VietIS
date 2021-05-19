package edu.poly.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.http.HttpServletRequest;

@Controller
public class Demo {
    @GetMapping(value = "/show")
    public String index(HttpServletRequest request){
        request.setAttribute("mss","Hello World Spring boot");
        return "Show";
    }
}
