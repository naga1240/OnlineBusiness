/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.onlinebusiness.dataaccess;

import com.onlinebusiness.model.User;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityExistsException;
import javax.persistence.PersistenceException;
import javax.persistence.TransactionRequiredException;

/**
 *
 * @author Naga
 */
public interface EntityFacade<T> {

    public T create(T entity) throws EntityExistsException, IllegalStateException,
            IllegalArgumentException, TransactionRequiredException;
    
   
    public T read(Serializable primaryKey, Class c) throws IllegalStateException,
            IllegalArgumentException;

    public boolean update(T entity) throws IllegalStateException,
            IllegalArgumentException, TransactionRequiredException;

    public T merge(final T entity) throws IllegalStateException,
            IllegalArgumentException, TransactionRequiredException;

    public void delete(T entity) throws IllegalStateException,
            IllegalArgumentException, TransactionRequiredException,
            PersistenceException;
    public T  createAuthority (T entity) throws EntityExistsException, IllegalStateException,
            IllegalArgumentException, TransactionRequiredException;
    public List findWithNamedQuery(String queryName);

    public List findWithNamedQuery(String queryName, int resultLimit);

    public List findWithNamedQuery(String namedQueryName, Map<String, String> parameters);

    public List findWithNamedQuery(String namedQueryName, Map<String, String> parameters, int resultLimit);

    public Object findWithNativeQuery(String queryName);
    
    public List findWithNamedQuery(String namedQueryName, Map<String, String> parameters,Map<String, Long> parameters2);
   
    public List getAll(T entity);
     
    public List findBySqlQuery(String query); 
}
