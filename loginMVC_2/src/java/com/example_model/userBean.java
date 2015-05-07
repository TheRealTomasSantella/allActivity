/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example_model;

import java.util.Objects;

/**
 *
 * @author mrsunnybunny
 */
public class userBean {
    String uname = "Tomas";
    String pass = "tomas";

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    @Override
    public String toString() {
        return "userBean{" + "uname=" + uname + ", pass=" + pass + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final userBean other = (userBean) obj;
        if (!Objects.equals(this.uname, other.uname)) {
            return false;
        }
        if (!Objects.equals(this.pass, other.pass)) {
            return false;
        }
        return true;
    }
    
    public boolean isUserValid(String username, String password){
        boolean result = false;
        if(uname.equals(username) && pass.equals(password))
            result = true;
        return result;
    }
}
