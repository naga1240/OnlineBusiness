/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.onlinebusiness.dao;

import com.onlinebusiness.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Naga
 */
@Repository
public class UserDaoImpl implements IUserDao{
    @Autowired(required = true)
    SessionFactory sessionFactory;

    @Override
    public void register(Customer c) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(c);
        session.flush();
    }
    
    
}
