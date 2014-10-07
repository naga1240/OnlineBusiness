/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.onlinebusiness.controller;

import com.onlinebusiness.dataaccess.CRUDFacade;
import com.onlinebusiness.dataaccess.DataFacadeFactory;
import com.onlinebusiness.model.Customer;
import javax.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    
    @RequestMapping(value = "addCustomer", method = RequestMethod.POST)
    public String register(Customer cust){
        System.out.println(cust.getName());
        DataFacadeFactory factory=new DataFacadeFactory();
        
        Customer newCust=(Customer) factory.getDataFacadeInstance(ctx).create(cust);
        System.out.println("customer name: " + newCust.getName());
        return "registerSuccess";
    }
}
