package clientserverfinalproject;

import Classes.Bill;
import Classes.ProductOnBill;
import Classes.Products;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server 
{
    static List<Products> products = new ArrayList<Products>();
    static List<Bill> bill = new ArrayList<Bill>();
    public static void main(String[] args) {
        
        products.add(new Products(1000, "vegetables", "potato",new Date(2021,8,0)));
        products.add(new Products(1001, "vegetables", "tomato",new Date(2021,8,0)));
        products.add(new Products(1002, "vegetables", "zucchini",new Date(2021,8,0)));
        products.add(new Products(1003, "vegetables", "eggplant",new Date(2021,8,0)));
        products.add(new Products(1004, "fruits", "banana",new Date(2021,8,0)));
        products.add(new Products(1005, "fruits", "apple",new Date(2021,8,0)));
        products.add(new Products(1006, "fruits", "orange",new Date(2021,8,0))); 
        products.add(new Products(1007, "supplies", "tuna",new Date(2021,8,0)));
        products.add(new Products(1009, "drink", "milk",new Date(2021,8,0)));
        products.add(new Products(1010, "drink", "pepsi",new Date(2021,8,0)));
        products.add(new Products(1011, "drink", "ice tea",new Date(2021,8,0)));
        products.add(new Products(1008, "drink", "ice coffee",new Date(2021,8,0)));
        products.add(new Products(1012, "drink", "juices",new Date(2021,8,0)));
        products.add(new Products(1013, "supplies", "bread",new Date(2021,8,0)));
        products.add(new Products(1014, "supplies", "potato chips",new Date(2021,8,0)));
        products.add(new Products(1015, "supplies", "biscuits",new Date(2021,8,0)));
        products.add(new Products(1016, "supplies", "chocolate",new Date(2021,8,0)));
        products.add(new Products(1017, "supplies", "candy",new Date(2021,8,0)));
        products.add(new Products(1018, "supplies", "pringles",new Date(2021,8,0)));
        products.add(new Products(1019, "supplies", "shampoo",new Date(2021,8,0)));
        products.add(new Products(1020, "supplies", "hand soup",new Date(2021,8,0)));
        products.add(new Products(1022, "supplies", "ice cream",new Date(2021,8,0)));
        products.add(new Products(1023, "supplies", "ice ",new Date(2021,8,0)));
        products.add(new Products(1024, "supplies", "sugar",new Date(2021,8,0)));
        products.add(new Products(1025, "supplies", "salt",new Date(2021,8,0)));
        products.add(new Products(1026, "supplies", "lamp",new Date(2021,8,0)));
        products.add(new Products(1027, "supplies", "toothbrush",new Date(2021,8,0)));
        products.add(new Products(1028, "supplies", "toothpaste",new Date(2021,8,0)));
        products.add(new Products(1029, "supplies", "sausage",new Date(2021,8,0)));
        products.add(new Products(1030, "supplies", "corn flakes",new Date(2021,8,0)));
        products.add(new Products(1031, "supplies", "lighter",new Date(2021,8,0)));
        products.add(new Products(1032, "drink", "red bull",new Date(2021,8,0)));
        products.add(new Products(1033, "drink", "rany",new Date(2021,8,0)));
        products.add(new Products(1034, "drink", "horse power",new Date(2021,8,0)));
        products.add(new Products(1035, "drink", "code red",new Date(2021,8,0)));
        products.add(new Products(1036, "drink", "B M",new Date(2021,8,0)));
        products.add(new Products(1037, "drink", "Fanta",new Date(2021,8,0)));
        products.add(new Products(1038, "drink", "Al marai shanenah",new Date(2021,8,0)));
        products.add(new Products(1021, "drink", "water bottle",new Date(2021,8,0)));        
        try 
        {
            ServerSocket Serversock = new ServerSocket(3342);
            System.out.println("Loading ...");
            Socket CL1 = Serversock.accept();
            DataInputStream in = new DataInputStream(CL1.getInputStream());
            DataOutputStream out = new DataOutputStream(CL1.getOutputStream());
            int i=0;
            while(true)
            {
                i = in.readInt();
                if(i == 1)
                {
                    ViewProducts(CL1);
                }
                else if(i == 2)
                {
                    AddBill(CL1);                
                }
                else if(i == 3)
                {
                    AddItem(CL1);                
                }
                else if(i == 4)
                {
                    getTotalPrice(CL1);                
                }
                else if(i == 5)
                {
                    refreshCurrentBill(CL1);       
                }
                else if(i == 6)
                {
                    EditItem(CL1);
                }
                else if(i == 7)
                {
                    ViewBills(CL1);     
                }
                else if(i == 8)
                {
                    SetPrice(CL1);     
                }
                else if(i == 9)
                {
                    break;   
                }
                else if(i==10)
                {
                    RemoveBill(CL1);
                }
                else if(i == 11)
                {
                    ViewBill1(CL1);     
                }
            }
        }
        catch (IOException ex) 
        {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
    public static void ViewProducts(Socket CL1){
        try 
        {
            DataInputStream in = new DataInputStream(CL1.getInputStream());
            DataOutputStream out = new DataOutputStream(CL1.getOutputStream());
            out.writeInt(products.size());
            for(int i=0;i<products.size();i++)
            {
                out.writeInt(products.get(i).ProductNumber);
                out.writeUTF(products.get(i).Kind);
                out.writeUTF(products.get(i).Name);
                out.writeInt(products.get(i).ExpirationDate.getYear());
                out.writeInt(products.get(i).ExpirationDate.getMonth());
                out.writeInt(products.get(i).ExpirationDate.getDate());
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
    
    public static void ViewBills(Socket CL1){
        try 
        {
            DataInputStream in = new DataInputStream(CL1.getInputStream());
            DataOutputStream out = new DataOutputStream(CL1.getOutputStream());
            out.writeInt(bill.size());
            for(int i=0;i<bill.size();i++)
            {
                out.writeUTF(bill.get(i).Print());
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
    
    public static void AddBill(Socket CL1){
        try 
        {
            DataInputStream in = new DataInputStream(CL1.getInputStream());
            DataOutputStream out = new DataOutputStream(CL1.getOutputStream());
            bill.add(new Bill());
            out.writeInt(bill.size()-1);
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void RemoveBill(Socket CL1){
        try 
        {
            DataInputStream in = new DataInputStream(CL1.getInputStream());
            DataOutputStream out = new DataOutputStream(CL1.getOutputStream());
            bill.remove(bill.size()-1);
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public static void ViewBill1(Socket CL1){
        try 
        {
            DataInputStream in = new DataInputStream(CL1.getInputStream());
            DataOutputStream out = new DataOutputStream(CL1.getOutputStream());
            out.writeUTF(bill.get(bill.size()-1).PrintAll());
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
    
    public static void AddItem(Socket CL1){
        try 
        {
            DataInputStream in = new DataInputStream(CL1.getInputStream());
            DataOutputStream out = new DataOutputStream(CL1.getOutputStream());
            int Index = in.readInt();
            int    PN = in.readInt();
            String K  = in.readUTF();
            String N  = in.readUTF();
            Date   D  = new Date(in.readInt(), in.readInt(), in.readInt());
            double W= in.readDouble();
            int Q= in.readInt();
            bill.get(Index).Items.add(new ProductOnBill(PN, K, N, D,W,Q)); 
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
    
    public static void EditItem(Socket CL1){
        try 
        {
            DataInputStream in = new DataInputStream(CL1.getInputStream());
            DataOutputStream out = new DataOutputStream(CL1.getOutputStream());
            //Order :
            int Index = in.readInt();
            int    PN = in.readInt();
            String K  = in.readUTF();
            String N  = in.readUTF();
            Date   D  = new Date(in.readInt(), in.readInt(), in.readInt());
            double W = in.readDouble();
            int Q = in.readInt();
            System.out.println("Edit");
            System.out.println("Index  "+Index);            
            if(W ==0 && Q==0)
            {
                bill.get(bill.size()-1).Items.remove(Index);
            }
            else
            {
                bill.get(bill.size()-1).Items.set(Index, new ProductOnBill(PN, K, N, D,W,Q));
            }
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void getTotalPrice(Socket CL1){
        try 
        {
            double TP=0;
            int size = bill.get(bill.size()-1).Items.size();
            DataInputStream in = new DataInputStream(CL1.getInputStream());
            DataOutputStream out = new DataOutputStream(CL1.getOutputStream());
            for(int i=0 ; i < size ; i++)
            {
                TP += bill.get(bill.size()-1).Items.get(i).getprice();
            }
            out.writeDouble(TP);
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void refreshCurrentBill(Socket CL1){
        try 
        {
            DataInputStream in = new DataInputStream(CL1.getInputStream());
            DataOutputStream out = new DataOutputStream(CL1.getOutputStream());
            int index = in.readInt();  
            System.out.println("index "+index);
            int size = bill.get(index).Items.size();
            System.out.println("size "+size);
            out.writeInt(size);
            System.out.println("size "+size);
            for(int i=0;i<size;i++)
            {
                out.writeInt(bill.get(index).Items.get(i).ProductNumber);               
                out.writeUTF(bill.get(index).Items.get(i).Kind);
                out.writeUTF(bill.get(index).Items.get(i).Name);
                out.writeInt(bill.get(index).Items.get(i).ExpirationDate.getYear());
                out.writeInt(bill.get(index).Items.get(i).ExpirationDate.getMonth());
                out.writeInt(bill.get(index).Items.get(i).ExpirationDate.getDate());
                out.writeDouble(bill.get(index).Items.get(i).weight);
                out.writeInt(bill.get(index).Items.get(i).Quantity);
            }
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void SetPrice(Socket CL1){
         try 
        {
            DataInputStream in = new DataInputStream(CL1.getInputStream());
            DataOutputStream out = new DataOutputStream(CL1.getOutputStream());
            int Index = in.readInt();
            bill.get(Index).ID = in.readInt(); 
            bill.get(Index).TotalBillAmount = in.readDouble(); 
            bill.get(Index).CustomerTotalMoney = in.readDouble(); 
            bill.get(Index).CustomerChange = in.readDouble(); 
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}

