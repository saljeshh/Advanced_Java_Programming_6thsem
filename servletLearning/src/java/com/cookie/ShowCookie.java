package com.cookie;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ShowCookie extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        
        int k = 0;
        Cookie cookies[] = req.getCookies();
        
        for(Cookie c : cookies){
            if(c.getName().equals("multiplication"))
                k = Integer.parseInt(c.getValue());
        }
        
        PrintWriter out = res.getWriter();
        out.println("The Multiplication between two values using cookies is : ");
        out.println("Result = " + k);
                
        
    }
    
}
