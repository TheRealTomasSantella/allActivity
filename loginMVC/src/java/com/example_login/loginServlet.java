package com.example_login;

import com.example_model.userBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrsunnybunny
 */
public class loginServlet extends HttpServlet{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        
        userBean userbean = new userBean();
        boolean isUserValid = userbean.isUserValid(username,password);
        
        HttpSession session = request.getSession();
        session.setAttribute("username",username);
        if(isUserValid){
            RequestDispatcher view = request.getRequestDispatcher("home.jsp");
            view.forward(request, response);
        }
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
  
        
        processRequest(request,response);
    }
}
