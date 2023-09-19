
package javaapplication3;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PriceCalculator extends Remote {
    double calculateSellingPrice(double costPrice, double discount) throws RemoteException;
    double product(double p1, double p2) throws RemoteException;
}