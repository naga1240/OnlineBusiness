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
//@DiscriminatorValue(value="ROLE_VENDOR")
public class Vendor extends User {
    
    private String companyName;
    private String branchAddress;
    private String contact;
    private String email;
    
//    @OneToMany(mappedBy = "vendor")
//    private List<Product> productList = new ArrayList<Product>();
//
//    public List<Product> getProductList() {
//        return productList;
//    }
//
//    public void setProductList(List<Product> productList) {
//        this.productList = productList;
//    }
    public Vendor(String companyName, String branchAddress, String contact, String email, String username, String password, String userrole, boolean enabled) {
        super(username, password, userrole, enabled);
        this.companyName = companyName;
        this.branchAddress = branchAddress;
        this.contact = contact;
        this.email = email;
    }

    public Vendor() {
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
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
