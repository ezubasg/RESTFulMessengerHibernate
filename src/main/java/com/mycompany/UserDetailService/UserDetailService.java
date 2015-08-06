/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.UserDetailService;

import com.mycompany.model.UserDetail;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author iqra
 */
public class UserDetailService {
    
    private UserDetail userDetail = new UserDetail();
    
    
    public String getAllUserDetailFromDB(){
    
       return "Helloooooo";
    }
    
    public UserDetail getUserDetailFromDB(String userName){
    
       UserDetail user = new UserDetail("Zubair","LIbakkveien",31);
       return user;
    }

    public UserDetail addUserDetailToDB(UserDetail userDetail){
            UserDetailDAO.startHibernate();
           int result =  UserDetailDAO.startSaveCommit(userDetail);
            return new UserDetail();
    }
    
    public UserDetail updateUserDetailInDB(String userName){
    
            return new UserDetail();
    }


    public void deleteUserDetailInDB(String userName){
    
    
        
        
        
    }
    
    
    
}
