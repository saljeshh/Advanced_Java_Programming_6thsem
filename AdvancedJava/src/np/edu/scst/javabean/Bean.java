package np.edu.scst.javabean;

import java.io.Serializable;

public class Bean implements Serializable{
    private String firstName;
    private String lastName;
    private int startYear;
    private double payRate;
    
    public Bean(){
        
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public int getStartYear(){
        return startYear;
    }
    
    public void setStartYear(int year){
        this.startYear = year;
    }
    
    public double getPayRate(){
        return payRate;
    }
    
    public void setPayRate(double payrate){
        this.payRate = payrate;
    }
    
}
