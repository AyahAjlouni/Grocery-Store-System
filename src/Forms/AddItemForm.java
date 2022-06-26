package Forms;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class AddItemForm extends javax.swing.JFrame 
{
    List<String> Kinds ;
    public AddItemForm(){
        initComponents();
        Kinds = new ArrayList<>();       
        KindComboBox.setVisible(false);
        ProductComboBox.setVisible(false);
        KindLabel.setVisible(false);
        ProductLabel.setVisible(false);
        BillNumLabel.setText("Bill Num :  "+(HomePageForm.CurrentBillindex+1)+" .");
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ExpirationDateLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        KindLabel = new javax.swing.JLabel();
        manuallyadioButton = new javax.swing.JRadioButton();
        ScaleRadioButton = new javax.swing.JRadioButton();
        ScannerRadioButton = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        KindComboBox = new javax.swing.JComboBox<>();
        ProductLabel = new javax.swing.JLabel();
        ProductComboBox = new javax.swing.JComboBox<>();
        ProductNumberTextBox = new javax.swing.JTextField();
        QuantityLabel = new javax.swing.JLabel();
        QuantityTextbox = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        FinishButton = new javax.swing.JButton();
        List = new java.awt.TextArea();
        BillNumLabel = new javax.swing.JLabel();
        EditingComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        SavaButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 40));

        jPanel2.setBackground(new java.awt.Color(78, 73, 73));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ExpirationDateLabel.setBackground(new java.awt.Color(255, 255, 255));
        ExpirationDateLabel.setFont(new java.awt.Font("Lemon", 1, 14)); // NOI18N
        ExpirationDateLabel.setForeground(new java.awt.Color(255, 255, 255));
        ExpirationDateLabel.setText("Expiration Date: ");
        jPanel2.add(ExpirationDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 340, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Lemon", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Item Numbers        :             1");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 310, 30));

        KindLabel.setBackground(new java.awt.Color(255, 255, 255));
        KindLabel.setFont(new java.awt.Font("Lemon", 1, 14)); // NOI18N
        KindLabel.setForeground(new java.awt.Color(255, 255, 255));
        KindLabel.setText("Kind :");
        jPanel2.add(KindLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 100, 30));

        manuallyadioButton.setBackground(new java.awt.Color(78, 73, 73));
        buttonGroup1.add(manuallyadioButton);
        manuallyadioButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        manuallyadioButton.setForeground(new java.awt.Color(255, 255, 255));
        manuallyadioButton.setText("manually");
        manuallyadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manuallyadioButtonActionPerformed(evt);
            }
        });
        jPanel2.add(manuallyadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        ScaleRadioButton.setBackground(new java.awt.Color(78, 73, 73));
        buttonGroup1.add(ScaleRadioButton);
        ScaleRadioButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ScaleRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        ScaleRadioButton.setText("Scale");
        ScaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScaleRadioButtonActionPerformed(evt);
            }
        });
        jPanel2.add(ScaleRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        ScannerRadioButton.setBackground(new java.awt.Color(78, 73, 73));
        buttonGroup1.add(ScannerRadioButton);
        ScannerRadioButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ScannerRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        ScannerRadioButton.setSelected(true);
        ScannerRadioButton.setText("Scanner");
        ScannerRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScannerRadioButtonActionPerformed(evt);
            }
        });
        jPanel2.add(ScannerRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Lemon", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Product Number  :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 170, 30));

        KindComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                KindComboBoxItemStateChanged(evt);
            }
        });
        jPanel2.add(KindComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 120, 30));

        ProductLabel.setBackground(new java.awt.Color(255, 255, 255));
        ProductLabel.setFont(new java.awt.Font("Lemon", 1, 14)); // NOI18N
        ProductLabel.setForeground(new java.awt.Color(255, 255, 255));
        ProductLabel.setText("Product :");
        jPanel2.add(ProductLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 100, 30));

        ProductComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ProductComboBoxItemStateChanged(evt);
            }
        });
        ProductComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductComboBoxActionPerformed(evt);
            }
        });
        jPanel2.add(ProductComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 120, 30));
        jPanel2.add(ProductNumberTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 120, 30));

        QuantityLabel.setBackground(new java.awt.Color(255, 255, 255));
        QuantityLabel.setFont(new java.awt.Font("Lemon", 1, 14)); // NOI18N
        QuantityLabel.setForeground(new java.awt.Color(255, 255, 255));
        QuantityLabel.setText("Quantity  :");
        jPanel2.add(QuantityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 100, 30));

        QuantityTextbox.setText("1");
        jPanel2.add(QuantityTextbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 120, 30));

        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        jPanel2.add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, 120, 30));

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        jPanel2.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 120, 30));

        FinishButton.setText("Finalizing");
        FinishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinishButtonActionPerformed(evt);
            }
        });
        jPanel2.add(FinishButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, 120, 30));

        List.setEditable(false);
        List.setFont(new java.awt.Font("Lemon", 1, 12)); // NOI18N
        jPanel2.add(List, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 370, 500));

        BillNumLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BillNumLabel.setForeground(new java.awt.Color(255, 255, 255));
        BillNumLabel.setText("Bill Num :");
        jPanel2.add(BillNumLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 20));

        EditingComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                EditingComboBoxItemStateChanged(evt);
            }
        });
        jPanel2.add(EditingComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 160, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Edit an item");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 100, 30));

        SavaButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SavaButton.setText("Sava");
        SavaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavaButtonActionPerformed(evt);
            }
        });
        jPanel2.add(SavaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 90, 30));

        EditButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EditButton.setText("Edit");
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });
        jPanel2.add(EditButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 90, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 850, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ScaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScaleRadioButtonActionPerformed

        KindComboBox.setVisible(true);
        ProductComboBox.setVisible(true);
        KindLabel.setVisible(true);
        ProductLabel.setVisible(true);
        QuantityLabel.setText("Weight");
        ProductNumberTextBox.setEditable(false);
        KindComboBox.removeAllItems();
        Kinds = new ArrayList<>();
        for(int i=0 ;i<HomePageForm.products.size() ;i++)
        {
            boolean done=true;
            for(int k=0;k<Kinds.size();k++)
            {
                if(Kinds.get(k).equals(HomePageForm.products.get(i).Kind))
                {
                    done=false;
                    break;
                }                
            }
            if(done && (HomePageForm.products.get(i).Kind.equals("vegetables")  || HomePageForm.products.get(i).Kind.equals("fruits")))
            {
                Kinds.add(HomePageForm.products.get(i).Kind);
                KindComboBox.addItem(HomePageForm.products.get(i).Kind);
            }            
        }
        
    }//GEN-LAST:event_ScaleRadioButtonActionPerformed

    private void ScannerRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScannerRadioButtonActionPerformed
        KindComboBox.setVisible(false);
        ProductComboBox.setVisible(false);
        KindLabel.setVisible(false);
        ProductLabel.setVisible(false);
        QuantityLabel.setText("Quantity");
        ProductNumberTextBox.setEditable(true);
    }//GEN-LAST:event_ScannerRadioButtonActionPerformed

    private void manuallyadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manuallyadioButtonActionPerformed
        KindComboBox.setVisible(true);
        ProductComboBox.setVisible(true);
        KindLabel.setVisible(true);
        ProductLabel.setVisible(true);
        QuantityLabel.setText("Quantity");
        ProductNumberTextBox.setEditable(false);
        KindComboBox.removeAllItems();
        Kinds = new ArrayList<>();
        for(int i=0 ;i<HomePageForm.products.size() ;i++)
        {
            boolean done=true;
            for(int k=0;k<Kinds.size();k++)
            {
                if(Kinds.get(k).equals(HomePageForm.products.get(i).Kind))
                {
                    done=false;
                    break;
                }                
            }
            if(done && (HomePageForm.products.get(i).Kind.equals("supplies")  || HomePageForm.products.get(i).Kind.equals("drink")))
            {
                Kinds.add(HomePageForm.products.get(i).Kind);
                KindComboBox.addItem(HomePageForm.products.get(i).Kind);
            }            
        }
    }//GEN-LAST:event_manuallyadioButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        HomePageForm.refreshCurrentBill(HomePageForm.Client);
        if(HomePageForm.CurrentProducts.size() == 0)
        {
            HomePageForm.RemoveBill(HomePageForm.Client);
            this.setVisible(false);
            HomePageForm Is= new  HomePageForm();
            Is.setVisible(true);      
        }
        else
        {
             JOptionPane.showMessageDialog(null,"you cant back !!");
        } 
    }//GEN-LAST:event_BackButtonActionPerformed

    private void FinishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinishButtonActionPerformed
       HomePageForm.refreshCurrentBill(HomePageForm.Client);
        if(HomePageForm.CurrentProducts.size() == 0)
        {
            HomePageForm.RemoveBill(HomePageForm.Client);
            this.setVisible(false);
            HomePageForm Is= new  HomePageForm();
            Is.setVisible(true);      
        }
        else
        {
            this.setVisible(false);
            FinalizingForm Is= new  FinalizingForm();
            Is.setVisible(true);   
        } 
       //CurrentBill = new Bill("JUST", LocalDateTime.now(), HomePageForm.CurrentProducts, TOP_ALIGNMENT, CENTER_ALIGNMENT);
   
    }//GEN-LAST:event_FinishButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        if(ScannerRadioButton.isSelected())
        {     
            try
            {
                if(Integer.parseInt(ProductNumberTextBox.getText()) <1000 || Integer.parseInt(ProductNumberTextBox.getText())>1038)
                {
                    JOptionPane.showMessageDialog(null,"enter a valid Number !!");
                }
                else if(Integer.parseInt(ProductNumberTextBox.getText()) <=1006 )
                {
                    JOptionPane.showMessageDialog(null,"Vegetables & fruits need scale !!");
                }
                else
                for(int i=0 ;i<HomePageForm.products.size() ;i++)
                {                   
                    if(HomePageForm.products.get(i).ProductNumber == Integer.parseInt(ProductNumberTextBox.getText()))
                    {
                    try
                    {
                        int    PN = HomePageForm.products.get(i).ProductNumber;
                        String K  = HomePageForm.products.get(i).Kind;
                        String N  = HomePageForm.products.get(i).Name;
                        Date   D  = HomePageForm.products.get(i).ExpirationDate;
                        double W =  0;
                        int Q = Integer.parseInt(QuantityTextbox.getText());
                        double P = HomePageForm.products.get(i).Price*Q;
                        HomePageForm.AddItem(HomePageForm.Client , PN, K , N , D,W,Q);
                        PrintItems();                                 
                        QuantityTextbox.setText("1");
                    }
                    catch(NumberFormatException e)
                    {
                         JOptionPane.showMessageDialog(null," Please enter a number");
                    }                     
                    }
                } 
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"Scan again !!");
            }
            
        }
        else if(manuallyadioButton.isSelected())
        {
           
            if("".equals(QuantityTextbox.getText()))
            {
                JOptionPane.showMessageDialog(null,"Tru Again !!");
            }
            else
            for(int i=0 ; i<HomePageForm.products.size() ;i++)
            {
                if(HomePageForm.products.get(i).ProductNumber == Integer.parseInt(ProductNumberTextBox.getText()))
                {
                    try
                    {
                        int    PN = HomePageForm.products.get(i).ProductNumber;
                        String K  = HomePageForm.products.get(i).Kind;
                        String N  = HomePageForm.products.get(i).Name;
                        Date   D  = HomePageForm.products.get(i).ExpirationDate;
                        double W =  0;
                        int Q = Integer.parseInt(QuantityTextbox.getText());
                        double P = HomePageForm.products.get(i).Price*Q;
                        HomePageForm.AddItem(HomePageForm.Client , PN, K , N , D,W,Q);
                        PrintItems();      
                        QuantityTextbox.setText("1");
                    }
                    catch(NumberFormatException e)
                    {
                         JOptionPane.showMessageDialog(null," Please enter a number");
                    }                                  
                }
           
            }
        }
        else
        {
          
            if("".equals(QuantityTextbox.getText()))
            {
                JOptionPane.showMessageDialog(null,"Tru Again !!");
            }
            else
            for(int i=0 ;i<HomePageForm.products.size() ;i++)
            {
                if(HomePageForm.products.get(i).ProductNumber == Integer.parseInt(ProductNumberTextBox.getText()))
                {                                                                            
                    try
                    {
                        int    PN = HomePageForm.products.get(i).ProductNumber;
                        String K  = HomePageForm.products.get(i).Kind;
                        String N  = HomePageForm.products.get(i).Name;
                        Date   D  = HomePageForm.products.get(i).ExpirationDate;
                        double W =  Integer.parseInt(QuantityTextbox.getText());
                        int Q = 0;
                        double P = HomePageForm.products.get(i).Price*W;
                        HomePageForm.AddItem(HomePageForm.Client , PN, K , N , D,W,Q);
                        PrintItems();
                        QuantityTextbox.setText("1");
                    }
                    catch(NumberFormatException e)
                    {
                         JOptionPane.showMessageDialog(null," Please enter a number");
                    }                                  
                }
            }
            
        }
        
    }//GEN-LAST:event_AddButtonActionPerformed

    private void ProductComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductComboBoxActionPerformed
        for(int i=0 ;i<HomePageForm.products.size() ;i++)
        {
            if(HomePageForm.products.get(i).Name == ProductComboBox.getSelectedItem().toString())
            {
                ProductNumberTextBox.setText(HomePageForm.products.get(i).ProductNumber+"");
                
            }
        }
    }//GEN-LAST:event_ProductComboBoxActionPerformed

    private void KindComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_KindComboBoxItemStateChanged
        try 
        {
            ProductComboBox.removeAllItems();
            for(int i=0;i<Kinds.size();i++)
            {
                if (this.KindComboBox.getSelectedItem().equals(Kinds.get(i)))
                {
                    for(int k=0 ;k<HomePageForm.products.size() ;k++)
                    {
                        if(HomePageForm.products.get(k).Kind.equals(Kinds.get(i)))
                            ProductComboBox.addItem(HomePageForm.products.get(k).Name);
                    }
                }                  
            }         
        }
        catch (Exception e)
        {
            return;
        }
    }//GEN-LAST:event_KindComboBoxItemStateChanged

    private void ProductComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ProductComboBoxItemStateChanged
         for(int i=0 ;i<HomePageForm.products.size() ;i++)
        {
            if(HomePageForm.products.get(i).Name.equals(ProductComboBox.getSelectedItem().toString()))
            {
                ProductNumberTextBox.setText(HomePageForm.products.get(i).ProductNumber+"");
                ExpirationDateLabel.setText("Expiration Date: "+HomePageForm.products.get(i).ExpirationDate.getYear()
                                                           +"/"+HomePageForm.products.get(i).ExpirationDate.getMonth()
                                                           +"/"+HomePageForm.products.get(i).ExpirationDate.getDate());            
            }
        }
    }//GEN-LAST:event_ProductComboBoxItemStateChanged

    private void SavaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavaButtonActionPerformed

        if(EditingComboBox.getSelectedIndex() == -1)
        {
            JOptionPane.showMessageDialog(null,"Wrong !! ");
        }
        else
        {
            int index = EditingComboBox.getSelectedIndex();
            System.out.println("index "+index);
            if(HomePageForm.CurrentProducts.get(index).Quantity != 0)
            {
                System.out.println("Q");
                    try
                    {
                        for(int i=0 ;i<HomePageForm.products.size() ;i++)
                        {            
                            if(HomePageForm.products.get(i).ProductNumber == Integer.parseInt(ProductNumberTextBox.getText()))
                            {
                                int    PN = HomePageForm.products.get(i).ProductNumber;
                                String K  = HomePageForm.products.get(i).Kind;
                                String N  = HomePageForm.products.get(i).Name;
                                Date   D  = HomePageForm.products.get(i).ExpirationDate;
                                double W =  0;
                                int Q = Integer.parseInt(QuantityTextbox.getText());
                                double P = HomePageForm.products.get(i).Price*Q;
                                HomePageForm.EditItem(HomePageForm.Client ,index, PN, K , N , D,W,Q);
                                PrintItems(); 
                                QuantityTextbox.setText("1");
                                break;
                            }
                        }
                    }
                    catch(NumberFormatException e)
                    {
                         JOptionPane.showMessageDialog(null," Please enter a number");
                    }              
            }
            else
            {
                System.out.println("W");
                    try
                    {
                        for(int i=0 ;i<HomePageForm.products.size() ;i++)
                        {                   
                            if(HomePageForm.products.get(i).ProductNumber == Integer.parseInt(ProductNumberTextBox.getText()))
                            {
                                int    PN = HomePageForm.products.get(i).ProductNumber;
                                String K  = HomePageForm.products.get(i).Kind;
                                String N  = HomePageForm.products.get(i).Name;
                                Date   D  = HomePageForm.products.get(i).ExpirationDate;
                                double W =  Integer.parseInt(QuantityTextbox.getText());
                                int Q = 0;
                                double P = HomePageForm.products.get(i).Price*W;
                                HomePageForm.EditItem(HomePageForm.Client ,index, PN, K , N , D,W,Q);
                                PrintItems();
                                QuantityTextbox.setText("1");
                                break;
                            }
                        }
                    }
                    catch(NumberFormatException e)
                    {
                         JOptionPane.showMessageDialog(null," Please enter a number");
                    }              
            }
            
        }
        
    }//GEN-LAST:event_SavaButtonActionPerformed

    private void EditingComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_EditingComboBoxItemStateChanged
       
        
    }//GEN-LAST:event_EditingComboBoxItemStateChanged

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed

         HomePageForm.refreshCurrentBill(HomePageForm.Client);
        if(EditingComboBox.getSelectedIndex() == -1)
        {
            JOptionPane.showMessageDialog(null,"Wrong !! ");
        }
        else
        {
        int index = EditingComboBox.getSelectedIndex();
        if( "vegetables".equals(HomePageForm.CurrentProducts.get(index).Kind) 
                 || "fruits".equals(HomePageForm.CurrentProducts.get(index).Kind))
        {
            ScaleRadioButton.setSelected(true);           
            ScaleRadioButtonActionPerformed(evt); 
            for(int i=0;i<KindComboBox.getItemCount();i++)
            {
                if(KindComboBox.getItemAt(i).equals(HomePageForm.CurrentProducts.get(index).Kind))
                    KindComboBox.setSelectedIndex(i);              
            }
            for(int i=0;i<ProductComboBox.getItemCount();i++)
            {
                if(ProductComboBox.getItemAt(i).equals(HomePageForm.CurrentProducts.get(index).Name))
                    ProductComboBox.setSelectedIndex(i);                     
                ProductComboBoxActionPerformed(evt);             
            }
            QuantityTextbox.setText(HomePageForm.CurrentProducts.get(index).weight+"");
            
        }
        else
        {
            manuallyadioButton.setSelected(true);           
            manuallyadioButtonActionPerformed(evt); 
            for(int i=0;i<KindComboBox.getItemCount();i++)
            {
                if(KindComboBox.getItemAt(i).equals(HomePageForm.CurrentProducts.get(index).Kind))
                    KindComboBox.setSelectedIndex(i);              
            }
            for(int i=0;i<ProductComboBox.getItemCount();i++)
            {
                if(ProductComboBox.getItemAt(i).equals(HomePageForm.CurrentProducts.get(index).Name))
                    ProductComboBox.setSelectedIndex(i);     
                ProductComboBoxActionPerformed(evt);             
            }
            QuantityTextbox.setText(HomePageForm.CurrentProducts.get(index).Quantity+"");
            
        }
        }
    }//GEN-LAST:event_EditButtonActionPerformed

    public static void main(String args[]){
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() {
                new AddItemForm().setVisible(true);
            }
        });
    }
    public void PrintItems(){
        EditingComboBox.removeAllItems();
        List.setText("");       
        HomePageForm.refreshCurrentBill(HomePageForm.Client);
        for(int i=0 ;i<HomePageForm.CurrentProducts.size() ;i++)
        {
            int    PN = HomePageForm.CurrentProducts.get(i).ProductNumber;
            String K  = HomePageForm.CurrentProducts.get(i).Kind;
            String N  = HomePageForm.CurrentProducts.get(i).Name;
            Date   D  = HomePageForm.CurrentProducts.get(i).ExpirationDate;
            double W =  HomePageForm.CurrentProducts.get(i).weight;
            int Q = HomePageForm.CurrentProducts.get(i).Quantity;
            double P = HomePageForm.CurrentProducts.get(i).getprice();    
            String a = List.getText();
            String b;
            if(W != 0)
                b="Num : "+(i+1)+"  |  "+"Name  : "+N+" | Weight : "+W+"Kg | Price : "+P+"$\n";
            else
                b="Num : "+(i+1)+"  |  "+"Name  : "+N+" | Quantity : "+Q+" | Price : "+P+"$\n";
            List.setText(a + b);  
            EditingComboBox.addItem((i+1)+"");            
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel BillNumLabel;
    private javax.swing.JButton EditButton;
    private javax.swing.JComboBox<String> EditingComboBox;
    private javax.swing.JLabel ExpirationDateLabel;
    private javax.swing.JButton FinishButton;
    private javax.swing.JComboBox<String> KindComboBox;
    private javax.swing.JLabel KindLabel;
    private java.awt.TextArea List;
    private javax.swing.JComboBox<String> ProductComboBox;
    private javax.swing.JLabel ProductLabel;
    private javax.swing.JTextField ProductNumberTextBox;
    private javax.swing.JLabel QuantityLabel;
    private javax.swing.JTextField QuantityTextbox;
    private javax.swing.JButton SavaButton;
    private javax.swing.JRadioButton ScaleRadioButton;
    private javax.swing.JRadioButton ScannerRadioButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton manuallyadioButton;
    // End of variables declaration//GEN-END:variables

    private void ScaleRadioButtonActionPerformed(ItemEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void ProductComboBoxActionPerformed(ItemEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void manuallyadioButtonActionPerformed(ItemEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
