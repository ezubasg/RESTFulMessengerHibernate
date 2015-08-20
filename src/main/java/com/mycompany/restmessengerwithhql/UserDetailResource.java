/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.restmessengerwithhql;

import com.mycompany.UserDetailService.UserDetailService;
import com.mycompany.model.UserDetail;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 *
 * @author iqra
 */


@Path("/message")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserDetailResource {
    
    private UserDetailService userService = new UserDetailService();
    
    
    @GET
    public String getallUserDetail(){
 
        System.out.println(" System out psfsdfdsrint ln ");
        return userService.getAllUserDetailFromDB();
       
    }
    
    /////////////////////////////////////////////////////////////////////////////

    
    @GET
    @Path("/{username}/")
    public UserDetail getUserDetail(@PathParam("username") String userName){

       
        return  userService.getUserDetailFromDB(userName);
    
    }
    
    
    /////////////////////////////////////////////////////////////////////////////
    @POST
    public UserDetail updateUserDetail(UserDetail userDetail){
           
        userDetail.setName(" ezubasg set by NEWEST POST ");
        userService.addUserDetailToDB(userDetail); 
        return userDetail;
    
    }
    
    
    ////////////////////////////////////////////////////////////////////////////////////////
    
    
    @PUT
    public String addUserDetail(UserDetail userDetail){
    
        userDetail.setName("ezubasg set by PUT");
        return userDetail.getName();
        
    
    }
    
    
    
    ///////////////////////////////////////////
    
    
    @DELETE
    @Path("/{username}/")
    public String deleteUserDetail(@PathParam("username") String userName){
    
                return "DELETE ";
    }
    
    
    
    
    
    
    
    
    
    
}
