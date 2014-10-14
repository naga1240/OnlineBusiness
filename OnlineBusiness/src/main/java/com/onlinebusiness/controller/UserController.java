/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.onlinebusiness.controller;

import com.onlinebusiness.dao.UserDaoImpl;
import com.onlinebusiness.dataaccess.CRUDFacade;
import com.onlinebusiness.dataaccess.DataFacadeFactory;
import com.onlinebusiness.model.Customer;
import javax.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Naga
 */
@Controller
public class UserController {
    
    @Autowired
    private ServletContext ctx;
    
    @Autowired(required = true)
    UserDaoImpl userDaoImpl;
    
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(Model model) {        
        model.addAttribute("customer", new Customer());
        return "register";
    }
    
    @RequestMapping(value = "registerNew", method = RequestMethod.POST)
    public String register(Customer cust){
        cust.setUserrole("ROLE_CUSTOMER");
        cust.setEnabled(true);        
        userDaoImpl.register(cust);
        return "registerSuccess";
    }
}
