/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.onlinebusiness.model;

import java.util.Date;

/**
 *
 * @author Naga
 */
public class Order {
    private int id;
    private Date orderDate;
    private float amount;

    public Order() {
    }

    public Order(Date orderDate, float amount) {
        this.orderDate = orderDate;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
    
    
    
    
}
