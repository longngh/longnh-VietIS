package edu.poly.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/home/")
public class LoginController {
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(ModelMap model, @RequestParam("user") String user, @RequestParam("pass") String pass) {
        if (user.equals("long") && pass.equals("123")) {
            model.addAttribute("mssg", "Thông tin đăng nhập đúng");
            model.addAttribute("name", "user");
        } else {
            model.addAttribute("mssg", "Thông tin đăng nhập sai");
        }
        return "index";
    }
}
