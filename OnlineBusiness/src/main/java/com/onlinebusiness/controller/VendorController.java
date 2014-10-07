/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.onlinebusiness.controller;

import com.onlinebusiness.model.Customer;
import com.onlinebusiness.model.Vendor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Naga
 */
@Controller
public class VendorController {
    
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String addVendor(Model model) {        
        model.addAttribute("Vendor", new Vendor());
        return "admin";
    }
    
}
