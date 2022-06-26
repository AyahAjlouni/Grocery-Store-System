package Forms;

import Classes.Bill;
import Classes.ProductOnBill;
import Classes.Products;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class HomePageForm extends javax.swing.JFrame 
{
    static List<Products> products ;
    static List<ProductOnBill> CurrentProducts = new ArrayList<ProductOnBill>();
    static List<Bill> CurrentBill = new ArrayList<Bill>();
    static int CurrentBillindex ;
    static Socket Client;
    static DataInputStream in;
    static DataOutputStream out;
    public HomePageForm() 
    {
        initComponents();  
        products = ViewProducts(Client);
        PrintBills(Client);
        try 
        {
            
          FileWriter Productsinfo = new FileWriter("Productsinfo.txt" ); 
             for(int p=0;p<products.size();p++){  
                 
                 Productsinfo.write(products.get(p).ProductNumber+"  "+products.get(p).Kind+"  "+products.get(p).Name+"  "
                 +products.get(p).ExpirationDate+"  "+products.get(p).Price+"\n \n ");    }  
             
             Productsinfo.close(); 
        }catch (Exception r){return;}
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddBillButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        List = new javax.swing.JTextArea();
        SaveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddBillButton.setFont(new java.awt.Font("Lemon", 1, 14)); // NOI18N
        AddBillButton.setText("Add bill ");
        AddBillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBillButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddBillButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 40));

        ExitButton.setFont(new java.awt.Font("Lemon", 1, 14)); // NOI18N
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 120, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Welcome To JUST Store");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 240, 40));

        List.setEditable(false);
        List.setColumns(20);
        List.setFont(new java.awt.Font("Lucida Fax", 1, 10)); // NOI18N
        List.setRows(5);
        jScrollPane2.setViewportView(List);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 860, 530));

        SaveButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SaveButton.setText("Save ");
        SaveButton.setToolTipText("");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 90, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddBillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBillButtonActionPerformed
        AddBill(Client);
        this.setVisible(false);
        AddItemForm Is= new  AddItemForm();
        Is.setVisible(true);   
    }//GEN-LAST:event_AddBillButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        try {
            HomePageForm.out.writeInt(9);
            this.hide();
            System.exit(0);
        } catch (IOException ex) {
            Logger.getLogger(HomePageForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        try 
        {
            FileWriter Productsinfo = new FileWriter("Desktop//Productsinfo.txt" ); 
            for(int p=0;p<products.size();p++)
            {  
                Productsinfo.write(products.get(p).ProductNumber+"  "+products.get(p).Kind
                                   +"  "+products.get(p).Name+"  "+products.get(p).ExpirationDate
                                   +"  "+products.get(p).Price+"\n \n ");   
            }  
            Productsinfo.close(); 
        }
        catch(IOException r)
        {
            JOptionPane.showMessageDialog(null,"Wrong !! ");
            return;
        }
    }//GEN-LAST:event_SaveButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() 
            {
                new HomePageForm().setVisible(true);
            }
        });
        
        try 
        {
            Client = new Socket("localhost", 3342);
            in = new DataInputStream(Client.getInputStream());
            out = new DataOutputStream(Client.getOutputStream());
        } catch (IOException ex) {
            Logger.getLogger(HomePageForm.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        
    } 
    
    ///////////////////Functions For Client-Server Programming :
    /////////////
    public static List<Products> ViewProducts(Socket Client){
        List<Products> products = null;
        try 
        {
            DataInputStream in = new DataInputStream(Client.getInputStream());
            DataOutputStream out = new DataOutputStream(Client.getOutputStream());
            products = new ArrayList<Products>();
            out.writeInt(1);           
            int size = in.readInt();
            for(int i=0;i<size;i++)
            {
                products.add(new Products(in.readInt(),in.readUTF(), in.readUTF(),new Date(in.readInt(),in.readInt(),in.readInt())));
            }
            
        } catch (IOException ex) {
            Logger.getLogger(HomePageForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return products;
    }
    ////////////Add bill to the list on the Server.
    public static void AddBill(Socket CL1){
        try 
        {
            DataInputStream in = new DataInputStream(CL1.getInputStream());
            DataOutputStream out = new DataOutputStream(CL1.getOutputStream());
            out.writeInt(2); 
            CurrentBillindex = in.readInt();
            
        } catch (IOException ex) {
            Logger.getLogger(HomePageForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     ///////////
    public static void RemoveBill(Socket CL1){
        try 
        {
            DataInputStream in = new DataInputStream(CL1.getInputStream());
            DataOutputStream out = new DataOutputStream(CL1.getOutputStream());
            out.writeInt(10);
        } catch (IOException ex) {
            Logger.getLogger(HomePageForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //////////////////
    public static void refreshCurrentBill(Socket CL1){
        try 
        {
            DataInputStream in = new DataInputStream(CL1.getInputStream());
            DataOutputStream out = new DataOutputStream(CL1.getOutputStream());
            //Order :
            out.writeInt(5); 
            //////////////////////////////////
            CurrentProducts = new ArrayList<>(); 
            out.writeInt(CurrentBillindex);     
            int size = in.readInt();
            for(int i=0;i<size;i++)
            {
                CurrentProducts.add(new ProductOnBill(in.readInt(),in.readUTF(), in.readUTF(),new Date(in.readInt(),in.readInt(),in.readInt()),in.readDouble(),in.readInt()));
            }
        } catch (IOException ex) {
            Logger.getLogger(HomePageForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    ////////////Add Item to the current Bill on the list on the Server.
    public static void AddItem(Socket CL1 , int PN , String K , String N, Date D ,double W,int  Q){
        try 
        {
            DataInputStream in = new DataInputStream(CL1.getInputStream());
            DataOutputStream out = new DataOutputStream(CL1.getOutputStream());
            //Order :
            out.writeInt(3); 
            //Index of the Bill :
            out.writeInt(CurrentBillindex);
            out.writeInt(PN);//Product Number
            out.writeUTF(K);//Kinnd 
            out.writeUTF(N);//Name
            out.writeInt(D.getYear()); //Year
            out.writeInt(D.getMonth()); //Month
            out.writeInt(D.getDate()); //Day
            out.writeDouble(W);
            out.writeInt(Q);
        } catch (IOException ex) {
            Logger.getLogger(HomePageForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /////////////
    public static void EditItem(Socket CL1,int Index,int PN , String K , String N, Date D ,double W,int Q){
        try 
        {
            DataInputStream in = new DataInputStream(CL1.getInputStream());
            DataOutputStream out = new DataOutputStream(CL1.getOutputStream());
            //Order :
            out.writeInt(6); 
            //Index of the Bill :
            out.writeInt(Index); 
            out.writeInt(PN);//Product Number
            out.writeUTF(K);//Kinnd 
            out.writeUTF(N);//Name
            out.writeInt(D.getYear()); //Year
            out.writeInt(D.getMonth()); //Month
            out.writeInt(D.getDate()); //Day
            out.writeDouble(W);
            out.writeInt(Q);
        } catch (IOException ex) {
            Logger.getLogger(HomePageForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    ///////////get total price for one item
    public static double GetTotalPrice(Socket CL1){
        try 
        {
            double TP=0;
            DataInputStream in = new DataInputStream(CL1.getInputStream());
            DataOutputStream out = new DataOutputStream(CL1.getOutputStream());
            //Order :
            out.writeInt(4); 
            TP = in.readDouble();
            return TP;
        } catch (IOException ex) {
            Logger.getLogger(HomePageForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
   
    //////////////
    public void PrintBills(Socket Client){
        try 
        {
            DataInputStream in = new DataInputStream(Client.getInputStream());
            DataOutputStream out = new DataOutputStream(Client.getOutputStream());
            CurrentBill = new ArrayList<Bill>();
            out.writeInt(7);           
            int size = in.readInt();
            List.setText("ID\tNameOfStore\t\tdate\tItems\tAmount\tCustomerTotalMoney\tCustomerChange\n");
            String T = List.getText();
            for(int i=0;i<size;i++)
            {
                T = List.getText();
                List.setText(T+in.readUTF());
            }
            
        } catch (IOException ex) {
            Logger.getLogger(HomePageForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /////////////
    public static String PrintBill1(Socket Client){
        try 
        {
            DataInputStream in = new DataInputStream(Client.getInputStream());
            DataOutputStream out = new DataOutputStream(Client.getOutputStream());
            out.writeInt(11);           
            return in.readUTF();
        }
        catch (IOException ex) {
            Logger.getLogger(HomePageForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
    public static void SetPrice(Socket Client,int Index,int id,double a1,double a2,double a3){
        try 
        {
            DataInputStream in = new DataInputStream(Client.getInputStream());
            DataOutputStream out = new DataOutputStream(Client.getOutputStream());
            out.writeInt(8); 
            out.writeInt(Index);
            out.writeInt(id);
            out.writeDouble(a1);
            out.writeDouble(a2);
            out.writeDouble(a3);
            
        } catch (IOException ex) {
            Logger.getLogger(HomePageForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBillButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JTextArea List;
    private javax.swing.JButton SaveButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
