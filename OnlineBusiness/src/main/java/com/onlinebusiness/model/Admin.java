/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlinebusiness.model;

import javax.persistence.Entity;

/**
 *
 * @author Naga
 */
@Entity
//@DiscriminatorValue(value="ROLE_ADMIN")
public class Admin extends User {

    private String name;
    private String contact;
    private String email;

//
//    @OneToMany
//    private List<Vendor> vendorList = new ArrayList<Vendor>();
//
//    public List<Vendor> getVendorList() {
//        return vendorList;
//    }
//
//    public void setVendorList(List<Vendor> vendorList) {
//        this.vendorList = vendorList;
//    }
    public Admin(String name, String contact, String email, String username, String password, String userrole, boolean enabled) {
        super(username, password, userrole, enabled);
        this.name = name;
        this.contact = contact;
        this.email = email;
    }

    public Admin() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

   
    
}
