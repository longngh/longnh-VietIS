package edu.poly.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/home")
public class InformatonController {
    @RequestMapping(value = "/{name}",params = "lnkEdit")
    public String information(ModelMap model, @PathVariable("name")String name){
        if(name!=null)
        model.addAttribute("name",name);
        return "Information";
    }
}
