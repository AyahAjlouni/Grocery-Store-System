package Classes;
import java.util.Date;
import java.util.List;

public class Products 
{
    public int ProductNumber;
    public String Kind;
    public String Name;
    public Date ExpirationDate;
    public float Price;
    public Products(int ProductNumber ,String kind ,String name ,Date expirationDate)
    {
        this.ProductNumber = ProductNumber;
        Kind = kind;
        Name = name;
        ExpirationDate = expirationDate;
        Price = 10;
    }
    
    /*public void print(List<Products> Products)
    {
        String A="";
        for(int i=0 ;i<Products.size() ;i++)
    }*/
}
