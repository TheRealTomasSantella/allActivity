package com.example_dao;

import com.example.util.DbUtil;
import com.example_model.userBean;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.HttpServlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrsunnybunny
 */
public class usesDao extends HttpServlet{
    public static boolean isValid(userBean user) throws IOException{
        boolean result = false;
        DbUtil db = new DbUtil();
        Connection connection = db.getConnection();
        
        try{
            PreparedStatement stmt = connection.prepareStatement(""+"select * from users where username=? and password=?");
            stmt.setString(1, user.getUname());
            stmt.setString(2, user.getPass());
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                result = true;
            }
            rs.close();
            stmt.close();
            db.disconnect();
        }catch(SQLException se){
            System.out.println("Connection error!");
            se.printStackTrace();
        }
        return result;
    }
    public static void main(String []args) throws IOException{
        userBean user = new userBean();
        user.setPass("tomas");
        user.setUname("Tomas");
        
        System.out.println(usesDao.isValid(user));
    }
}
