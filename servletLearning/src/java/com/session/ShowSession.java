package com.session;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShowSession extends HttpServlet{
    
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
       
        HttpSession session = req.getSession();
        //fetching from session
       int k =(int) session.getAttribute("addedData"); // by default object auxa so type cast to int
       
       PrintWriter out = (PrintWriter) res.getWriter();
       out.println("The added value is " + k  +" and it is fetched from session");
    }
}
