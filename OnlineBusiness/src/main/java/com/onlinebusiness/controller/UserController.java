/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.onlinebusiness.controller;

import com.onlinebusiness.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Naga
 */
@Controller
public class UserController {
    
    @RequestMapping(value = "addCustomer", method = RequestMethod.POST)
    public String register(Customer cust){
        System.out.println(cust.getName());
        return "registerSuccess";
    }
}
