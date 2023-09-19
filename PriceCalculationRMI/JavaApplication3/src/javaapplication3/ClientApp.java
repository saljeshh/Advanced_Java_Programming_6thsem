/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.rmi.Naming;

public class ClientApp {
    public static void main(String[] args) {
        try {
            PriceCalculator calculator = (PriceCalculator) Naming.lookup("rmi://localhost/PriceCalculator");
            double sellingPrice = calculator.calculateSellingPrice(5000, 50);
            double product = calculator.product(12.8, 56.4);
            System.out.println("Selling Price: Rs. " + sellingPrice);
            System.out.println("Product Price: Rs. " + product);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}