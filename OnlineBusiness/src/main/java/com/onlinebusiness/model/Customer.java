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
//@DiscriminatorValue(value="ROLE_USER")
public class Customer extends User {
    
    private String name;
    private String address;
    private String contact;
    private String email;

//    @OneToMany(mappedBy = "customer")
//    private List<Order> orderList = new ArrayList<Order>();
//
//    @OneToMany
//    private List<Product> productList = new ArrayList<Product>();
//
//    public List<Order> getOrderList() {
//        return orderList;
//    }
//
//    public void setOrderList(List<Order> orderList) {
//        this.orderList = orderList;
//    }
//
//    public List<Product> getProductList() {
//        return productList;
//    }
//
//    public void setProductList(List<Product> productList) {
//        this.productList = productList;
//    }
    public Customer(String name, String address, String contact, String email, String username, String password, String userrole, boolean enabled) {
        super(username, password, userrole, enabled);
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.email = email;
    }

    public Customer() {
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
