/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author lahiru (PK) 
 */
public class OrderDetails {
    
    private String orderId;
    private String itemCode;
    private int qtyOnHand;
    private double unitPrice;
    
    // Constractors
    public OrderDetails() {}
    public OrderDetails(String orderId, String itemCode, int qtyOnHand, double unitPrice) {
        this.orderId = orderId;
        this.itemCode = itemCode;
        this.qtyOnHand = qtyOnHand;
        this.unitPrice = unitPrice;
    }
    
    // Get Mothods
    public String getOrderId() {
        return orderId;
    }
    public String getItemCode() {
        return itemCode;
    }
    public int getQtyOnHand() {
        return qtyOnHand;
    }
    public double getUnitPrice() {
        return unitPrice;
    }

    // Set Mothods
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }
    public void setUnitPric(double unitPrice) {
        this.unitPrice = unitPrice;
    }
 
}
