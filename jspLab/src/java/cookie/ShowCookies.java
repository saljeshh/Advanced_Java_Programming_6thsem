/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cookie;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;

public class ShowCookies extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        int k = 0;
        
        Cookie cookies[] = req.getCookies();
        
        for(Cookie c: cookies){
            if(c.getName().equals("addition")){
                k = Integer.parseInt(c.getValue());
            }
        }
        
        PrintWriter out = (PrintWriter) res.getWriter();
        out.println("The result is " + k);
    }
}
