
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Palindrome</title>
    </head>
    <body>
        <h1>Output: </h1>
        <% 
            int r,sum=0,temp;    
            int n=  Integer.parseInt(request.getParameter("input"));

            temp=n;    
            while(n>0){    
             r=n%10;  //getting remainder  
             sum=(sum*10)+r;    
             n=n/10;    
            }    
            if(temp==sum)    
             out.println("Entered value is palindrome number! ");    
            else    
             out.println("Entered value  is not palindrome number!");    
          
            
         %>
    </body>
</html>
