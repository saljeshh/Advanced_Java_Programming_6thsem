
package javaapplication3;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PriceCalculatorImpl extends UnicastRemoteObject implements PriceCalculator {
    public PriceCalculatorImpl() throws RemoteException {
        // Constructor needs to declare RemoteException
    }

    @Override
    public double calculateSellingPrice(double costPrice, double discount) throws RemoteException {
        return costPrice - discount;
    }

    @Override
    public double product(double p1, double p2) throws RemoteException {
       return p1 * p2;
    }
    
    
}