package views.customers;

import controllers.CustomerController;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.Customer;

/**
 *
 * @author lahiru(PK)
 */
public class SearchCustomerForm extends javax.swing.JFrame {

   
    public SearchCustomerForm() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLbl = new javax.swing.JLabel();
        IDLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        addressLbl = new javax.swing.JLabel();
        salaryLbl = new javax.swing.JLabel();
        IDTxt = new javax.swing.JTextField();
        nameTxt = new javax.swing.JTextField();
        salaryTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        addressTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Cusromer");
        setLocation(new java.awt.Point(550, 150));
        setResizable(false);

        mainLbl.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        mainLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainLbl.setText("Search Customer ");
        mainLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        IDLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        IDLbl.setText("Customer ID");

        nameLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nameLbl.setText("Name");

        addressLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addressLbl.setText("Address");

        salaryLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        salaryLbl.setText("Salary");

        IDTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        IDTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDTxtActionPerformed(evt);
            }
        });

        nameTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        salaryTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        searchBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        ClearBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ClearBtn.setText("Clear");
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });

        addressTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mainLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(ClearBtn)
                            .addGap(18, 18, 18)
                            .addComponent(searchBtn))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nameLbl)
                                .addComponent(IDLbl))
                            .addGap(56, 56, 56)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(IDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(40, 40, 40))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(salaryLbl)
                                .addComponent(addressLbl))
                            .addGap(93, 93, 93)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(salaryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addressTxt)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(mainLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDLbl)
                    .addComponent(IDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLbl)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLbl)
                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salaryLbl)
                    .addComponent(salaryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBtn)
                    .addComponent(ClearBtn))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        IDTxtActionPerformed(evt);
    }//GEN-LAST:event_searchBtnActionPerformed

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        clearTxts();
    }//GEN-LAST:event_ClearBtnActionPerformed

    private void IDTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDTxtActionPerformed
        // Check ID
        if (!IDTxt.getText().equals("")) {
            
            searchCustomerSqlConector(IDTxt.getText());
           
        } else {
            warningMessege("Enter ID !");
        }
    }//GEN-LAST:event_IDTxtActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearBtn;
    private javax.swing.JLabel IDLbl;
    private javax.swing.JTextField IDTxt;
    private javax.swing.JLabel addressLbl;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JLabel mainLbl;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JLabel salaryLbl;
    private javax.swing.JTextField salaryTxt;
    private javax.swing.JButton searchBtn;
    // End of variables declaration//GEN-END:variables
    
    // Search Customer Into Database
    private void searchCustomerSqlConector(String ID) {
        
        try{
        
            Customer customer = new Customer(ID);
            CustomerController CC = new CustomerController();
        
            if (CC.searchCustomer(customer)) {
                nameTxt.setText(customer.getName());
                addressTxt.setText(customer.getAddress());
                salaryTxt.setText(String.valueOf(customer.getSalary()));
                
            } else {
                warningMessege("Invalide ID !");
            }   
            
        } catch (ClassNotFoundException ex) {
            warningMessege("Class Not Found !");
        } catch (SQLException ex) {
            warningMessege(ex.getMessage());
        }
    }
    
    // Warning Messege
    private void warningMessege (String messege) {
        JOptionPane.showMessageDialog(
                this,
                messege,
                "WARNING",
                JOptionPane.WARNING_MESSAGE
        );
    }
    
    // Clear All Texts
    private void clearTxts () {
        String text = "";
        IDTxt.setText(text);
        nameTxt.setText(text);
        addressTxt.setText(text);
        salaryTxt.setText(text);
    }
    
}
