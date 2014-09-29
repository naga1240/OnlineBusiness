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
public class Electronics extends Product {
    private long price;
    private float warranty;

    public Electronics() {
      
    }
    
    public Electronics(long price, float warranty, String name, String category, String description) {
        super(name, category, description);
        this.price = price;
        this.warranty = warranty;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public float getWarranty() {
        return warranty;
    }

    public void setWarranty(float warranty) {
        this.warranty = warranty;
    }
    
    
    
    
}
