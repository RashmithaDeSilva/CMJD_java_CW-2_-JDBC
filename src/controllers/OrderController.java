/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import databaseConnection.DBConnection;
import java.util.ArrayList;
import models.Order;


/**
 *
 * @author lahiru (PK)
 */
public class OrderController {
    
    public String getLastOrderId() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT id FROM orders ORDER BY id DESC LIMIT 1");
        return rst.next() ? rst.getString("id") : null;
    }

    public String[] getCustomerID() throws ClassNotFoundException, SQLException {
        
        ArrayList<String> idArrayList = new ArrayList<String>();
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT id FROM customer");
        while(rst.next()) {
            idArrayList.add(rst.getString(1));
        }
        String[] customerID = new String[idArrayList.size()];
        customerID = idArrayList.toArray(customerID);
        
        return customerID;
    }

    public String getCustomerName(String ID) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet name = stm.executeQuery("SELECT name FROM customer WHERE id = '"+ID+"'");
        while(name.next()) {
            return name.getString(1);
        }
        return null;
    }

    public String[] getItemCode() throws ClassNotFoundException, SQLException {
        
        ArrayList<String> codeArrayList = new ArrayList<String>();
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT code FROM item");
        while(rst.next()) {
            codeArrayList.add(rst.getString(1));
        }
        String[] itemCode = new String[codeArrayList.size()];
        itemCode = codeArrayList.toArray(itemCode);
        
        return itemCode;
    }

    public String[] getItemDetails(String code) throws ClassNotFoundException, SQLException {
        
        String[] detailsArray = new String[3];
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet details = stm.executeQuery("SELECT description, unitPrice, qtyOnHand FROM item WHERE code = '"+code+"'");
        if (details.next()) {
            detailsArray[0] = details.getString(1);
            detailsArray[1] = details.getString(2);
            detailsArray[2] = details.getString(3);
        }
        
        return detailsArray;
    }

    public String getQT(String code) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT qtyOnHand FROM item WHERE code='"+code+"'");
        rst.next();
        return rst.getString(1);
    }

    public boolean addNewOrder(Order order) throws ClassNotFoundException, SQLException {
        
        try {
            DBConnection.getInstance().getConnection().setAutoCommit(false);
        
            Connection connection = DBConnection.getInstance().getConnection();
            Statement stm =  connection.createStatement();
            String SQL = "INSERT INTO orders VALUES ('"+order.getID()+"','"+order.getDate()+"','"+order.getCustomerID()+"')";

            boolean isAddedOrder = stm.executeUpdate(SQL) > 0;
            if(!order.getOrderDetailsList().isEmpty() && isAddedOrder) {

                boolean isAddedOrderDetails = new OrderDetailsController().addOrderDetails(order.getOrderDetailsList());
                if(isAddedOrderDetails) {

                    boolean updateItems = new ItemController().updateItemStok(order.getOrderDetailsList());
                    if(updateItems) {

                        DBConnection.getInstance().getConnection().commit();
                        return true;
                    }
                }
            } 

            DBConnection.getInstance().getConnection().rollback();
            return false;
        
        } finally {
            DBConnection.getInstance().getConnection().setAutoCommit(true);
        }
    }
  
}

