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
@DiscriminatorValue(value="ROLE_VENDOR")
public class Vendor extends User {

    

    @OneToMany(mappedBy = "vendor")
    private List<Product> productList = new ArrayList<Product>();

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Vendor() {
    }

    public Vendor(String username, String password, String name, String address, String contact, String email) {
        super(username, password, name, address, contact, email);
    }

    

}
