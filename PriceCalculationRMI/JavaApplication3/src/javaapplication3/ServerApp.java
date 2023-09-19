/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServerApp {
    public static void main(String[] args) {
        try {
            // priceCalculatorImpl implents price calculator ani balla yesko object banako
            PriceCalculatorImpl calculator = new PriceCalculatorImpl();
            LocateRegistry.createRegistry(1099); // Start the RMI registry on port 1099
            Naming.rebind("PriceCalculator", calculator);
            System.out.println("Server is ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
