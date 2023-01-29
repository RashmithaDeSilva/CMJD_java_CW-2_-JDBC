/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import databaseConnection.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import models.Customer;

/**
 *
 * @author lahiru (PK) 
 */
public class CustomerController {
    
    public boolean addCustomer(Customer customer) throws ClassNotFoundException, SQLException {
        
        DBConnection DBC = DBConnection.getInstance();
        Statement stm = DBC.getConnection().createStatement();
        String SQL = "INSERT INTO customer VALUES ('"+customer.getID()+"','"+customer.getName()+"','"+customer.getAddress()+"','"+customer.getSalary()+"');";
        
        return stm.executeUpdate(SQL)>0;
    }
    
    public boolean searchCustomer(Customer customer) throws ClassNotFoundException, SQLException {
        
        boolean retunValue = false;
        
        DBConnection DBC = DBConnection.getInstance();
        Statement stm = DBC.getConnection().createStatement();
        String SQL = "SELECT * FROM customer WHERE id = '"+customer.getID()+"'";
        ResultSet rst = stm.executeQuery(SQL);
        
        if(rst.next()) {
            customer.setName(rst.getString("name"));
            customer.setAddress(rst.getString("address"));
            customer.setSalary(rst.getDouble("salary"));
            retunValue = true;
        }
        
        return retunValue;
    }
    
    public boolean deleteCustomer(Customer customer) throws ClassNotFoundException, SQLException {
        
        DBConnection DBC = DBConnection.getInstance();
        Statement stm = DBC.getConnection().createStatement();
        String SQL = "DELETE FROM customer WHERE id = '"+customer.getID()+"'";
        
        return stm.executeUpdate(SQL)>0;
    }
    
    public boolean updateCustomer(Customer customer) throws ClassNotFoundException, SQLException {
        
        DBConnection DBC = DBConnection.getInstance();
        Statement stm = DBC.getConnection().createStatement();
        String SQL = "UPDATE customer SET  name='"+customer.getName()+"', address='"+customer.getAddress()+"', salary='"+customer.getSalary()+"' WHERE id='"+customer.getID()+"';"; 
    
        return stm.executeUpdate(SQL)>0;
    }
    
    public DefaultTableModel viewCustomers(DefaultTableModel dtm) throws ClassNotFoundException, SQLException {
        
        DBConnection DBC = DBConnection.getInstance();
        Statement stm = DBC.getConnection().createStatement();
        String SQL = "SELECT * FROM customer;";
        ResultSet rst = stm.executeQuery(SQL);
        while (rst.next()) {
            Object[] rowData = {
                rst.getString("id"),
                rst.getString("name"),
                rst.getString("address"),
                rst.getDouble("salary")
            };
            dtm.addRow(rowData);
        }
        
        return dtm;
    }
}
