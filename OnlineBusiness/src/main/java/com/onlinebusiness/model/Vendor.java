/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.onlinebusiness.model;

/**
 *
 * @author Naga
 */
public class Vendor extends User {
   
    private String name;
    private String details;
    

    public Vendor() {
    }

    public Vendor(String name, String details, String username, String password) {
        super(username, password);
        this.name = name;
        this.details = details;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    
    
    
}
