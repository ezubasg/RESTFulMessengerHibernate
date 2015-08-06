/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.UserDetailService;

import com.mycompany.model.UserDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author iqra
 */
public class UserDetailDAO {
    
    private static final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    private static  Session session;
    
    public static void startHibernate(){
         session = sessionFactory.openSession();
    }
    
    public static int startSaveCommit(UserDetail userDetail){
            session.beginTransaction();
              session.save(userDetail);
             session.getTransaction().commit();
             return 1;
   
    }
    
    
}
