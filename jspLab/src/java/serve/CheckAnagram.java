package serve;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckAnagram extends HttpServlet{
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
        String word1 = req.getParameter("word1");
        String word2 = req.getParameter("word2");
        
        PrintWriter out = (PrintWriter) res.getWriter();
        
        if(word1.length() == word2.length()){
            char[] arr1 = word1.toCharArray();
            char[] arr2 = word2.toCharArray();
            
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            
            boolean result = Arrays.equals(arr1,arr2);
            
            if(result){
                out.println("Anagram");
            }else{
                out.println("Not Anagram");
            }
        }
        
        
    }
}
