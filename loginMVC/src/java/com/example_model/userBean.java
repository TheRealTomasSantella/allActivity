/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example_model;

/**
 *
 * @author mrsunnybunny
 */
public class userBean {
    String uname = "Tomas";
    String pass = "tomas";
    
    public boolean isUserValid(String username, String password){
        boolean result = false;
        if(uname.equals(username) && pass.equals(password))
            result = true;
        return result;
    }
}
