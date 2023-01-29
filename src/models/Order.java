/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author lahiru (PK) 
 */
public class Order {
    
    private String ID;
    private String date;
    private String customerID;
    private ArrayList<OrderDetails> orderDetailsList;
    
    // Constractors
    public Order() {}
    public Order(String ID, String date, String customerID, ArrayList<OrderDetails> orderDetailsList) {
        this.ID = ID;
        this.date = date;
        this.customerID = customerID;
        this.orderDetailsList = orderDetailsList;
    }
    
    // Get Mothods
    public String getID() {
        return ID;
    }
    public String getDate() {
        return date;
    }
    public String getCustomerID() {
        return customerID;
    }
    public ArrayList<OrderDetails> getOrderDetailsList() {
        return orderDetailsList;
    }
    
    // Set Mothods
    public void setID(String ID){
        this.ID = ID;
    }
    public void setDate(String date){
        this.date = date;
    }
    public void setCustomerID(String customerID){
        this.customerID = customerID;
    }
    public void setOrderDetailsList(ArrayList<OrderDetails> orderDetailsList) {
        this.orderDetailsList = orderDetailsList;
    }

}
