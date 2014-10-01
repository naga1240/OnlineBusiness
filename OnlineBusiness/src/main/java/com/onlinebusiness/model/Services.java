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
public class Services extends Product {
    
    private float servicePeriod;
    //@OneToOne
////    private ServiceMaster serviceMaster;
//
//    public ServiceMaster getServiceMaster() {
//        return serviceMaster;
//    }
//
//    public void setServiceMaster(ServiceMaster serviceMaster) {
//        this.serviceMaster = serviceMaster;
//    }

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
