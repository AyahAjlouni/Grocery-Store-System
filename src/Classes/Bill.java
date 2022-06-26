package Classes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Bill 
{
    public int ID;
    public String NameOfStore;
    public Date date;
    public List<ProductOnBill> Items;
    public double  TotalBillAmount;
    public double CustomerTotalMoney;
    public double CustomerChange;
    
    public Bill(List<ProductOnBill> Items){
        this.ID = 0;
        this.NameOfStore = "JUST Store";
        this.date = date;
        this.Items = Items;
        this.TotalBillAmount = 0;
        this.CustomerTotalMoney = 0;
        this.CustomerChange = 0;
    }    
    public Bill(){
        this.ID = 0;
        this.NameOfStore = "JUST Store";
        this.date = new Date(LocalDateTime.now().getYear(),LocalDateTime.now().getMonthValue(),LocalDateTime.now().getDayOfMonth());
        this.Items = new ArrayList<ProductOnBill>();
        this.TotalBillAmount = 0;
        this.CustomerTotalMoney = 0;
        this.CustomerChange = 0;
    }
    public String Print(){
        return((ID)+"\t"+NameOfStore + "\t\t" + date.getYear()+"/" 
               +date.getMonth()+"/"+date.getDate()+"\t"
               +Items.size()+"\t"+TotalBillAmount+"\t"+CustomerTotalMoney+"\t\t"+CustomerChange+"\n");
    }
     public String PrintAll(){
         String A="";
         A = "\tName :\t"+NameOfStore+"\t\n"+"\tID :\t"+ID+"\t\n"+"\tDate :\t"+ date.getYear()+"/" 
               +date.getMonth()+"/"+date.getDate()+"\t\n"+"\tTotalBillAmount :\t"+TotalBillAmount+"\t\n"
                 +"\tCustomerTotalMoney :\t"+CustomerTotalMoney+"\t\n"+"\tCustomerChange :\t"+CustomerChange+"\t\n";
         for(int i=0;i<Items.size();i++)
         {
             if(Items.get(i).weight != 0)
                A +="Num : "+(i+1)+"  |  "+"Name  : "+Items.get(i).Name+" | Weight : "+Items.get(i).weight+"Kg | Price : "+Items.get(i).Price+"$\n";
            else
                A +="Num : "+(i+1)+"  |  "+"Name  : "+Items.get(i).Name+" | Quantity : "+Items.get(i).Quantity+" | Price : "+Items.get(i).Price+"$\n";
         }
        return(A);
    }
    
    
}
