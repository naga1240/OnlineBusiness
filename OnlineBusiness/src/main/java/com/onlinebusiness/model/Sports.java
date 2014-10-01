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
public class Sports extends Product {

    private long price;

    public Sports() {
    }

    public Sports(long price, String name, String category, String description) {
        super(name, category, description);
        this.price = price;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

}
