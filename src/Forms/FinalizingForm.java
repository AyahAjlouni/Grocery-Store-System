package Forms;

import static Forms.HomePageForm.products;
import java.io.FileWriter;
import java.util.Date;
import javax.swing.JOptionPane;

public class FinalizingForm extends javax.swing.JFrame 
{
    double totalPrice;
    double CTM;
    double  K;
    public FinalizingForm() {
        initComponents();
        PriceLabel.setText("total bill amount : "+HomePageForm.GetTotalPrice(HomePageForm.Client)+ "$ ");    
        PrintItems();
        totalPrice=0;
        CTM=0;
        K=0;
    }
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        FinishButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        List = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        TheRestLabel = new javax.swing.JLabel();
        CustomerTotalMoneyTextBox = new javax.swing.JTextField();
        PriceLabel = new javax.swing.JLabel();
        OpenDrawerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 40));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FinishButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FinishButton.setText("Finish");
        FinishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinishButtonActionPerformed(evt);
            }
        });
        jPanel2.add(FinishButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, 90, 40));

        BackButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        jPanel2.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 90, 40));

        List.setEditable(false);
        List.setColumns(20);
        List.setRows(5);
        List.setToolTipText("");
        jScrollPane1.setViewportView(List);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 16, 480, 530));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Customer Total Money : ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 180, 40));

        TheRestLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TheRestLabel.setText("customer change :");
        jPanel2.add(TheRestLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 330, 40));

        CustomerTotalMoneyTextBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CustomerTotalMoneyTextBox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CustomerTotalMoneyTextBox.setText("0 $");
        jPanel2.add(CustomerTotalMoneyTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 150, 40));

        PriceLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PriceLabel.setText("total bill amount :");
        jPanel2.add(PriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 330, 40));

        OpenDrawerButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        OpenDrawerButton.setText("Open drawer");
        OpenDrawerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenDrawerButtonActionPerformed(evt);
            }
        });
        jPanel2.add(OpenDrawerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 130, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 850, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FinishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinishButtonActionPerformed
        if(totalPrice == 0 ||CTM == 0 )
        {
            JOptionPane.showMessageDialog(null,"Wrong !! ");
        }
        else
        {
             HomePageForm.SetPrice(HomePageForm.Client, HomePageForm.CurrentBillindex,HomePageForm.CurrentBillindex+1, totalPrice, CTM, K);
             try 
             {
                 FileWriter Productsinfo = new FileWriter("Bill "+(HomePageForm.CurrentBillindex+1)+".txt");       
                 Productsinfo.write(HomePageForm.PrintBill1(HomePageForm.Client));      
                 Productsinfo.close(); 
             }catch (Exception r){return;}
             this.hide();
             HomePageForm Is= new  HomePageForm();
             Is.setVisible(true);       
        }      
    }//GEN-LAST:event_FinishButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        this.setVisible(false);
        AddItemForm Is= new  AddItemForm();
        Is.setVisible(true);      
    }//GEN-LAST:event_BackButtonActionPerformed

    private void OpenDrawerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenDrawerButtonActionPerformed
       
        try
        {
            totalPrice = HomePageForm.GetTotalPrice(HomePageForm.Client);
            CTM = Integer.parseInt(CustomerTotalMoneyTextBox.getText());
            if(totalPrice> CTM)
            {
                JOptionPane.showMessageDialog(null,"Please enter a number > "+totalPrice);
            }
             else
            {
                K = Integer.parseInt(CustomerTotalMoneyTextBox.getText()) - totalPrice;
                TheRestLabel.setText("customer change : " + K + "$ ");
            }
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null," Please enter a number");
        }
    }//GEN-LAST:event_OpenDrawerButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinalizingForm().setVisible(true);
            }
        });
    }
    
    public void PrintItems(){
        List.setText("");       
        HomePageForm.refreshCurrentBill(HomePageForm.Client);
        for(int i=0 ;i<HomePageForm.CurrentProducts.size() ;i++)
        {
            int    PN = HomePageForm.CurrentProducts.get(i).ProductNumber;
            String K  = HomePageForm.CurrentProducts.get(i).Kind;
            String N  = HomePageForm.CurrentProducts.get(i).Name;
            Date   D  = HomePageForm.CurrentProducts.get(i).ExpirationDate;
            double W =  HomePageForm.CurrentProducts.get(i).weight;
            double Q = HomePageForm.CurrentProducts.get(i).Quantity;
            double P = HomePageForm.CurrentProducts.get(i).getprice();    
            String a = List.getText();
            String b;
            if(W != 0)
                b="Num : "+(i+1)+"  |  "+"Name  : "+N+" | Weight : "+W+"Kg | Price : "+P+"$\n";
            else
                b="Num : "+(i+1)+"  |  "+"Name  : "+N+" | Quantity : "+Q+" | Price : "+P+"$\n";
            List.setText(a + b);              
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField CustomerTotalMoneyTextBox;
    private javax.swing.JButton FinishButton;
    private javax.swing.JTextArea List;
    private javax.swing.JButton OpenDrawerButton;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JLabel TheRestLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
