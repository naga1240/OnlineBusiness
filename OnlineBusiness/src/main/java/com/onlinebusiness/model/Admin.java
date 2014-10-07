/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlinebusiness.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author Naga
 */
@Entity
@DiscriminatorValue(value="ROLE_ADMIN")
public class Admin extends User {

     
    
    @OneToMany
    private List<Vendor> vendorList = new ArrayList<Vendor>();

    public List<Vendor> getVendorList() {
        return vendorList;
    }

    public void setVendorList(List<Vendor> vendorList) {
        this.vendorList = vendorList;
    }

    public Admin(String username, String password, String name, String address, String contact, String email) {
        super(username, password, name, address, contact, email);
    }

    public Admin() {
    }
    
}
