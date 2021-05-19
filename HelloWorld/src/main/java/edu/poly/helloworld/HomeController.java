package edu.poly.helloworld;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/home/")
public class HomeController {
    @RequestMapping(value = "form")
    public String form(ModelMap model){
        return "Login";
    }
}
