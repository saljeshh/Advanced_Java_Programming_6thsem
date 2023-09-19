package cookie;

import java.io.IOException;
import javax.servlet.http.*;
public class SaveCookie extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));
        
        int k = i + j;
        
        Cookie cookie = new Cookie("addition", k + "");
        res.addCookie(cookie);
        res.sendRedirect("showcookie");
    }
}
