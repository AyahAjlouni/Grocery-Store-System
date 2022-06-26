/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Date;

/**
 *
 * @author user
 */
public class ProductOnBill extends Products{
    public double weight;
    public int Quantity;
    public double TotalPrice ;
    public ProductOnBill(int ProductNumber, String kind, String name, Date expirationDate,double weight,int Quantity) {
        super(ProductNumber, kind, name, expirationDate);
        TotalPrice = 0;
        this.weight = weight ;
        this.Quantity = Quantity ;
    }
    public double getprice()
    {
        if("vegetables".equals(Kind) || "fruits".equals(Kind))
        {
            TotalPrice =  Price * weight;
        }
        else
        {
            TotalPrice =  Price * Quantity;
        }
        return TotalPrice;
    }
    
}
