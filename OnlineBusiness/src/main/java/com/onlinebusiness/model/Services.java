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
public class Services extends Product{
    
    private float servicePeriod;

    public Services() {
    }

    public Services(float servicePeriod, String name, String category, String description) {
        super(name, category, description);
        this.servicePeriod = servicePeriod;
    }

    public float getServicePeriod() {
        return servicePeriod;
    }

    public void setServicePeriod(float servicePeriod) {
        this.servicePeriod = servicePeriod;
    }
    
    
}
