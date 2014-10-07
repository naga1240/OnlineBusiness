/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlinebusiness.controller;

import com.onlinebusiness.model.Vendor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author akBheemaiah
 */
@Controller
public class adminController {
     @RequestMapping(value = "addVendor", method = RequestMethod.POST)
    public String register(Vendor vendor){
        System.out.println(vendor.getName());
        return "registerSuccess";
    }
     @RequestMapping(value = "adminAddVendor")
    public String adminAddVendor(Vendor vendor, Model model){
        System.out.println(vendor.getName());
        model.addAttribute("vendor", new Vendor());
        return "adminAddVendor";
    }
}
