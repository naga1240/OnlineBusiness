package com.onlinebusiness.controller;
import com.onlinebusiness.dao.UserDaoImpl;
import com.onlinebusiness.model.Customer;
import com.onlinebusiness.model.User;
import org.springframework.beans.factory.annotation.Autowired;
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
    
    @Autowired
    UserDaoImpl userDaoImpl;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String index() {

//        Customer u=new Customer("a", "a", "a", "a", "a", "a", "customer", true);
//        userDaoImpl.register(u);
        return "login";
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
    @RequestMapping(value = "/header")
    public String header() {
        //System.out.println("In loginfailed");
        return "header";
    }
    @RequestMapping(value = "/loginframes")
    public String loginframes() {
        //System.out.println("In loginfailed");
        return "loginframes";
    }
    @RequestMapping(value = "/contact")
    public String contact() {
        //System.out.println("In loginfailed");
        return "contact";
    }
    @RequestMapping(value = "/aboutus")
    public String aboutus() {
        //System.out.println("In loginfailed");
        return "aboutus";
    }
}
