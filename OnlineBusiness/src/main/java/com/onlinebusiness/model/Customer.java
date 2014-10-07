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
@DiscriminatorValue(value="ROLE_USER")
public class Customer extends User {

    @OneToMany(mappedBy = "customer")
    private List<Order> orderList = new ArrayList<Order>();

    @OneToMany
    private List<Product> productList = new ArrayList<Product>();

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Customer() {
    }

    
    public Customer(String username, String password, String name, String address, String contact, String email,boolean enabled) {
        super(username, password, name, address, contact, email,enabled);
    }

    
}
