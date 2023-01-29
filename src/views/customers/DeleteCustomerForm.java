package views.customers;

import controllers.CustomerController;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.Customer;

/**
 *
 * @author lahiru(PK)
 */
public class DeleteCustomerForm extends javax.swing.JFrame {

   
    public DeleteCustomerForm() {
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
        deleteBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        addressTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Cusromer");
        setLocation(new java.awt.Point(550, 150));
        setResizable(false);

        mainLbl.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        mainLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainLbl.setText("Delete Customer ");
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

        deleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
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

        searchBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLbl)
                            .addComponent(IDLbl))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(IDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchBtn)))
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salaryLbl)
                            .addComponent(addressLbl))
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salaryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressTxt))))
                .addContainerGap(7, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ClearBtn)
                        .addGap(18, 18, 18)
                        .addComponent(deleteBtn)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(mainLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(mainLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDLbl)
                    .addComponent(IDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBtn)
                    .addComponent(ClearBtn))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        //deleteCustomerSqlConector(IDTxt.getText());
        int result = JOptionPane.showConfirmDialog(
                this, 
                "Are You Sure?",
                "CONFORM",
                JOptionPane.YES_NO_OPTION
                    );
        
        if (result == JOptionPane.YES_OPTION) {
            deleteCustomerSqlConector(IDTxt.getText());
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        clearTxts();
    }//GEN-LAST:event_ClearBtnActionPerformed

    private void IDTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDTxtActionPerformed
        if(!IDTxt.getText().equals("")) {
            searchCustomerSqlConector(IDTxt.getText());
        } else {
            warningMessege("Enter ID !");
        }
    }//GEN-LAST:event_IDTxtActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        IDTxtActionPerformed(evt);
    }//GEN-LAST:event_searchBtnActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearBtn;
    private javax.swing.JLabel IDLbl;
    private javax.swing.JTextField IDTxt;
    private javax.swing.JLabel addressLbl;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel mainLbl;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JLabel salaryLbl;
    private javax.swing.JTextField salaryTxt;
    private javax.swing.JButton searchBtn;
    // End of variables declaration//GEN-END:variables
    
    private Customer customer;
    private CustomerController CC = new CustomerController();
    
    // Search Customer Into Database
    private void searchCustomerSqlConector(String ID) {
        
        try{
            customer = new Customer(ID);
            System.out.println(customer.getID());
        
            if (CC.searchCustomer(customer)) {
                IDTxt.setEditable(false);
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
    
    // Update Customer Into Database
    private void deleteCustomerSqlConector(String ID) {
        
        try {
            
            if (CC.deleteCustomer(customer)) {
                JOptionPane.showMessageDialog(this,
                                                    "Successfully Deleted Customer",
                                                    "SUCCESSFULL",
                                                    JOptionPane.INFORMATION_MESSAGE
                );
                clearTxts();
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
        IDTxt.setEditable(true);
    }
    
}
