
package com.serve;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class CheckAnagram extends HttpServlet{
   
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
        String word1 = req.getParameter("word1").toLowerCase();
        String word2 = req.getParameter("word2").toLowerCase();
         PrintWriter out = (PrintWriter) res.getWriter();
        
        if(word1.length() == word2.length()){
            //convert string to char array
            char[] arr1 = word1.toCharArray();
            char[] arr2 = word2.toCharArray();
            
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            
            boolean result = Arrays.equals(arr1,arr2);
            
           
            
            if(result){
                out.println(word1 + " and " + word2 + " are anagram");
            }else{
                out.println(word1 + " and " + word2 + " are not anagram");
            }
        }else{
            out.println("They are not anagram, same length required of both words");
        }
        
    }
    
}


