/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mycurrency_convertor;

import javax.swing.JOptionPane;

/**
 *
 * @author welcome
 */
public class myCurrencyconvertor extends javax.swing.JFrame {
    String[] currencyUnits = {
"Units",
"INR",
"USD",
"Pound",
"Euro",
"Yen",
"Dinar",
"Ruble",
"Won",
"Afghani",
"LKR",
};
    
double INR=11.52;
double USD=0.14;
double Pound=0.11;
double Euro=0.13;
double Yen=20.00;
double Dinar=0.04;
double Ruble=12.66;
double Won=183.00;
double Afghani=10.00;
double LKR=47.74;

    
    public myCurrencyconvertor() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
   
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SecondCurrency = new javax.swing.JComboBox<>();
        FirstCurrency = new javax.swing.JComboBox<>();
        t2 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FirstCurrencyunit = new javax.swing.JLabel();
        SecondCurrencyunit = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Currency Convertor");

        SecondCurrency.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SecondCurrency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose....", "INR", "USD", "Pound", "Euro", "Yen", "Kuwatti_dinar", "Ruble", "Won", "Afghani", "Sri_lankan_rupee" }));
        SecondCurrency.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SecondCurrencyItemStateChanged(evt);
            }
        });
        SecondCurrency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecondCurrencyActionPerformed(evt);
            }
        });

        FirstCurrency.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        FirstCurrency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose....", "INR", "USD", "Pound", "Euro", "Yen", "Kuwatti_dinar", "Ruble", "Won", "Afghani", "Sri_lankan_rupee" }));
        FirstCurrency.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FirstCurrencyItemStateChanged(evt);
            }
        });
        FirstCurrency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstCurrencyActionPerformed(evt);
            }
        });

        t2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        t1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("From");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("To");

        FirstCurrencyunit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        FirstCurrencyunit.setText("Units");

        SecondCurrencyunit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SecondCurrencyunit.setText("Units");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("Convert");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FirstCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FirstCurrencyunit)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SecondCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SecondCurrencyunit)))
                        .addGap(64, 64, 64))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(256, 256, 256))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jButton1)
                .addGap(125, 125, 125)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(85, 85, 85))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SecondCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FirstCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FirstCurrencyunit)
                    .addComponent(SecondCurrencyunit))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }

    private void SecondCurrencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecondCurrencyActionPerformed
        // TODO add your handling code here:
    }

    private void FirstCurrencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstCurrencyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstCurrencyActionPerformed

    private void FirstCurrencyItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FirstCurrencyItemStateChanged
        int position=FirstCurrency.getSelectedIndex();
        FirstCurrencyunit.setText(currencyUnits[position]);
        
    }//GEN-LAST:event_FirstCurrencyItemStateChanged

    private void SecondCurrencyItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_SecondCurrencyItemStateChanged
       int position=SecondCurrency.getSelectedIndex();
        SecondCurrencyunit.setText(currencyUnits[position]);
    }//GEN-LAST:event_SecondCurrencyItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 if(FirstCurrency.getSelectedIndex()==0 || SecondCurrency.getSelectedIndex()==0 || t1.getText().equals("")){
 JOptionPane.showMessageDialog(null,"You must select both currency and must input some values.","Error Message",JOptionPane.INFORMATION_MESSAGE);
 return;
 }
        double amounttochange=Double.parseDouble(t1.getText());
        double amountinyuan=0.0;
        switch(FirstCurrency.getSelectedItem().toString()){
            case "INR":amountinyuan=amounttochange/INR;break;
            case "USD":amountinyuan=amounttochange/USD;break;
            case "Pound":amountinyuan=amounttochange/Pound;break;
            case "Euro":amountinyuan=amounttochange/Euro;break;
            case "Yen":amountinyuan=amounttochange/Yen;break;
            case "Kuwatti_dinar":amountinyuan=amounttochange/Dinar;break;
            case "Ruble":amountinyuan=amounttochange/Ruble;break;
            case "Won":amountinyuan=amounttochange/Won;break;
            case "Afghani":amountinyuan=amounttochange/Afghani;break;
            case "Sri_lankan_rupee":amountinyuan=amounttochange/LKR;break;
        }
        double amountchanged=0.0;
        switch(SecondCurrency.getSelectedItem().toString()){
            case "USD":amountchanged=amountinyuan*USD;break;
            case "INR":amountchanged=amountinyuan*INR;break;
            case "Pound":amountchanged=amountinyuan*Pound;break;
            case "Euro":amountchanged=amountinyuan*Euro;break;
            case "Yen":amountchanged=amountinyuan*Yen;break;
            case "Kuwatti_dinar":amountchanged=amountinyuan*Dinar;break;
            case "Ruble":amountchanged=amountinyuan*Ruble;break;
            case "Won":amountchanged=amountinyuan*Won;break;
            case "Afghani":amountchanged=amountinyuan*Afghani;break;
            case "Sri_lankan_rupee":amountchanged=amountinyuan*LKR;break;
            
            
    }//GEN-LAST:event_jButton2ActionPerformed
    String value=String.format("%.2f",amountchanged);
    t2.setText(value);
    }
    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FirstCurrency.setSelectedIndex(0);
        SecondCurrency.setSelectedIndex(0);
        t1.setText(null);
        t2.setText(null);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(myCurrencyconvertor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(myCurrencyconvertor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(myCurrencyconvertor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(myCurrencyconvertor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new myCurrencyconvertor().setVisible(true);
            }
        });
    }

    
    private javax.swing.JComboBox<String> FirstCurrency;
    private javax.swing.JLabel FirstCurrencyunit;
    private javax.swing.JComboBox<String> SecondCurrency;
    private javax.swing.JLabel SecondCurrencyunit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;

}
