/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.sql.PreparedStatement;
import databaseConnection.DBConnection;
import java.sql.SQLException;
import java.util.ArrayList;
import models.OrderDetails;

/**
 *
 * @author lahiru (PK)
 */
public class OrderDetailsController {
    
    public boolean addOrderDetails(ArrayList<OrderDetails> orderDetailsList) throws ClassNotFoundException, SQLException {
        for(OrderDetails od : orderDetailsList) {
            if(!addOrderDetails(od)) {
                return false;
            }
        }
        
        return true;
    }
    
    private boolean addOrderDetails(OrderDetails orderDetail) throws ClassNotFoundException, SQLException {
        PreparedStatement stm = DBConnection.getInstance().getConnection()
                .prepareStatement("INSERT INTO orderdetail VALUES(?,?,?,?)");
        stm.setObject(1, orderDetail.getOrderId());
        stm.setObject(2, orderDetail.getItemCode());
        stm.setObject(3, orderDetail.getQtyOnHand());
        stm.setObject(4, orderDetail.getUnitPrice());
        
        return stm.executeUpdate()>0;
    }
}
