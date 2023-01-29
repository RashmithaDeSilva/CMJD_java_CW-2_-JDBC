/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import databaseConnection.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import models.Item;
import models.OrderDetails;

/**
 *
 * @author lahiru (PK) 
 */
public class ItemController {
    
    public boolean addItem(Item item) throws ClassNotFoundException, SQLException {
        
        DBConnection DBC = DBConnection.getInstance();
        Statement stm = DBC.getConnection().createStatement();
        String SQL = "INSERT INTO item VALUES ('"+item.getCode()+"','"+item.getDescription()+"','"+item.getUnitPrice()+"','"+item.getQtyOnHand()+"');";
        
        return stm.executeUpdate(SQL)>0;
    }
    
    public boolean searchItem(Item item) throws ClassNotFoundException, SQLException {
        
        boolean retunValue = false;
        
        DBConnection DBC = DBConnection.getInstance();
        Statement stm = DBC.getConnection().createStatement();
        String SQL = "SELECT * FROM item WHERE code = '"+item.getCode()+"'";
        ResultSet rst = stm.executeQuery(SQL);
        
        if(rst.next()) {
            item.setDescription(rst.getString("description"));
            item.setUnitPric(rst.getDouble("unitPrice"));
            item.setQtyOnHand(rst.getInt("qtyOnHand"));
            retunValue = true;
        }
        
        return retunValue;
    }
    
    public boolean deleteItem(Item item) throws ClassNotFoundException, SQLException {
        
        DBConnection DBC = DBConnection.getInstance();
        Statement stm = DBC.getConnection().createStatement();
        String SQL = "DELETE FROM item WHERE code = '"+item.getCode()+"'";
        
        return stm.executeUpdate(SQL)>0;
    }
    
    public boolean updateItem(Item item) throws ClassNotFoundException, SQLException {
        
        DBConnection DBC = DBConnection.getInstance();
        Statement stm = DBC.getConnection().createStatement();
        String SQL = "UPDATE item SET  description='"+item.getDescription()+"', unitPrice='"+item.getUnitPrice()+"', qtyOnHand='"+item.getQtyOnHand()+"' WHERE code = '"+item.getCode()+"';"; 
    
        return stm.executeUpdate(SQL)>0;
    }
    
    public DefaultTableModel viewItems(DefaultTableModel dtm) throws ClassNotFoundException, SQLException {
        
        DBConnection DBC = DBConnection.getInstance();
        Statement stm = DBC.getConnection().createStatement();
        String SQL = "SELECT * FROM item;";
        ResultSet rst = stm.executeQuery(SQL);
        while (rst.next()) {
            Object[] rowData = {
                rst.getString("code"),
                rst.getString("description"),
                rst.getDouble("unitPrice"),
                rst.getInt("qtyOnHand")
            };
            dtm.addRow(rowData);
        }
        
        return dtm;
    }
    
    public static boolean updateItemStok(ArrayList<OrderDetails> orderDetailsList) throws ClassNotFoundException, SQLException {
        for(OrderDetails od : orderDetailsList) {
            if(!updateItem(od)) {
                return false;
            }
        }
        return  true;
    }
    
    private static boolean updateItem(OrderDetails od) throws ClassNotFoundException, SQLException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement(
                "UPDATE item SET qtyOnHand = qtyOnHand - ? WHERE code = ?"
        );
        stm.setObject(1, od.getQtyOnHand());
        stm.setObject(2, od.getItemCode());
        return stm.executeUpdate()>0;
    }
    
}
