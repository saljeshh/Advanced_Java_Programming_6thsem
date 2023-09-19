/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import java.io.IOException;
import javax.servlet.http.*;
public class AddSession extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));
        
        int k = i + j;
        
        HttpSession session = req.getSession();
        session.setAttribute("addedData", k);
        
        res.sendRedirect("showsessio");
    }
}
