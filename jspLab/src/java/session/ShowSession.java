/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;
public class ShowSession extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        HttpSession session = req.getSession();
        
        int k = (int) session.getAttribute("addedData");
        
        PrintWriter out = res.getWriter();
        out.println("The value is " + k);
        
    }
}
