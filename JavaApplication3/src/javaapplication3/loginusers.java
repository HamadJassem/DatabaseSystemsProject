/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author Ali
 */
public class loginusers {
    //store user's information (userid, type, officerid)
    String userid;
    int type;
  
    
    //constructor of loginusers
    loginusers(String userid, int type)
    {
        this.userid = userid;
        this.type = type;
        
    }

    
    
    //getters to assign the type in the form.java (1 for admin, 2 for head, 3 for officer, 4 for normal user)
    int getType(){return type;}
    
    String getUserID(){return userid;}

    
}
