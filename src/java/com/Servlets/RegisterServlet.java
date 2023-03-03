/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author spjis
 */
public class RegisterServlet extends HttpServlet{
    
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        
        response.setContentType("text/html");
        PrintWriter  out=response.getWriter();
        
        out.println("<h2>Welcome to Register Servlet</h2>");
        
        String name=request.getParameter("user_name");
        String password=request.getParameter("user_password");
        String email=request.getParameter("user_email");
        String gender=request.getParameter("user_gender");
        String course=request.getParameter("user_course");
        String con=request.getParameter("condition");
        
        if(con.equals("checked"))
        {
            out.println("<h2> Name : "+name+"</h2>");
            out.println("<h2> Password : "+password+"</h2>");
            out.println("<h2> Email : "+email+"</h2>");
            out.println("<h2> Gender : "+gender+"</h2>");
            out.println("<h2> Course : "+course+"</h2>");
            
        }
        else {
               out.println("<h2> You have not accepcted terms and conditions </h2>");
        }
        
        
        
    }
   
   
}
