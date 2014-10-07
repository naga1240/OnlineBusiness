
package com.onlinebusiness.dataaccess;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityExistsException;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.persistence.TransactionRequiredException;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



/**
 *
 * @author naga
 * @version 0.0.1
 */

/**
 *
 * @author naga
 * @version 0.0.1
 * @param <T>
 */

public class CRUDFacade<T> implements EntityFacade<T> {
    
    //Autowired
    private SessionFactory sessionFactory;

    @Override
    public T create(T entity) throws EntityExistsException, IllegalStateException, IllegalArgumentException, TransactionRequiredException {
      
        sessionFactory.getCurrentSession().save(entity);
        System.out.println("Here i save the entity");
      return entity;
    }

    

    @Override
    public T read(Serializable primaryKey, Class c) throws IllegalStateException, IllegalArgumentException {
        return (T) sessionFactory.getCurrentSession().get(c, primaryKey);
       
    }

    @Override
    public boolean update(T entity) throws IllegalStateException, IllegalArgumentException, TransactionRequiredException {
        sessionFactory.getCurrentSession().merge(entity);
        return true;
    }

    @Override
    public T merge(T entity) throws IllegalStateException, IllegalArgumentException, TransactionRequiredException {
        entity= (T) sessionFactory.getCurrentSession().merge(entity);
        return entity;
    }

    @Override
    public void delete(T entity) throws IllegalStateException, IllegalArgumentException, TransactionRequiredException, PersistenceException {

            sessionFactory.getCurrentSession().delete(entity);
    }

    @Override
    public T createAuthority(T entity) throws EntityExistsException, IllegalStateException, IllegalArgumentException, TransactionRequiredException {
//         User user=(User) entity;
//        //System.out.println(user.getId());
//        String sql="insert into authority(user_id,username,authority) values(?,?,?)";
//        SQLQuery createSQLQuery = sessionFactory.getCurrentSession().createSQLQuery(sql);
//        createSQLQuery.setParameter(0, user.getId());
//        createSQLQuery.setParameter(1, user.getUsername());
//        createSQLQuery.setParameter(2, "ROLE_USER");
//         createSQLQuery.executeUpdate();
         
        return entity;
    }

    @Override
    public List findWithNamedQuery(String queryName) {
        return sessionFactory.getCurrentSession().getNamedQuery(queryName).list();
    }

    @Override
    public List findWithNamedQuery(String queryName, int resultLimit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List findWithNamedQuery(String namedQueryName, Map<String, String> parameters) {
        Query query = (Query) sessionFactory.openSession().getNamedQuery(namedQueryName);

        for (Map.Entry<String, String> entry : parameters.entrySet()) {
            query.setParameter(entry.getKey(), entry.getValue());
        }
        
        return query.getResultList();
    }

   

    @Override
    public Object findWithNativeQuery(String queryName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    @Override
    public List getAll(T entity) {
         return sessionFactory.getCurrentSession().createCriteria(entity.getClass()).list();
    }

    @Override
    public List findBySqlQuery(String query) {
         SQLQuery sqlqry =  sessionFactory.openSession().createSQLQuery(query);
       return sqlqry.list();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    

    

}
