/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mrsunnybunny
 */
public class ProcessAdminServlet extends HttpServlet{
    public void init() throws ServletException{
        
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String name = request.getParameter("name");
        String course = request.getParameter("course");
        String[] pLang = request.getParameterValues("progLang");
        String boxer = request.getParameter("box");
        
        PrintWriter out = response.getWriter();
        out.println("<h1>"+"Hello "+name+"! You are an admin!"+"</h1>");
        out.println("<h2>Are you sure you are a/an "+course+"?");
        for(int i = 0; i < pLang.length; i++){
            out.println("<h3>You have learned "+pLang[i]+"</h3>");
        }
        if(boxer.equals("Manny"))
            out.println("<h4>You are the champ!</h4>");
        else
            out.println("<h4>You are a loser");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        doGet(request, response);
    }
    public void destroy(){
        
    }
}
