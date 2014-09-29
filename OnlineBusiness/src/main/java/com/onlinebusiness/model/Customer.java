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
public class Customer extends User{

    private String name;
    private String address;
    private String email;
    

    public Customer() {
    }

    public Customer(String name, String address, String email, String username, String password) {
        super(username, password);
        this.name = name;
        this.address = address;
        this.email = email;
    }

    

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
