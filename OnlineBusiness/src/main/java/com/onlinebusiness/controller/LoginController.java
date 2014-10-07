package com.onlinebusiness.controller;
import com.onlinebusiness.model.Customer;
import com.onlinebusiness.model.Vendor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



/**
 *
 * @author nirali_bheda
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String index() {
        return "login";
    }
    
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(Model model) {        
        model.addAttribute("customer", new Customer());
        return "register";
    }
    
    
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout() {
        System.out.println("In logout");
        return "logout";
    }
    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String welcome() {
        System.out.println("In welcome");
        return "welcome";
    }
    @RequestMapping(value = "/loginfailed")
    public String loginfailed() {
        System.out.println("In loginfailed");
        return "loginfailed";
    }
    @RequestMapping(value = "/loginsidebar")
    public String loginsidebar() {
        //System.out.println("In loginfailed");
        return "loginsidebar";
    }
    @RequestMapping(value = "/loginframes")
    public String loginframes() {
        //System.out.println("In loginfailed");
        return "loginframes";
    }
}
