package edu.poly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.http.HttpServletRequest;

@Controller
public class Demo {
    @GetMapping(value = "/")
    public String index(HttpServletRequest request){
        request.setAttribute("mss","Hello World Spring boot");
        return "home";
    }
}
