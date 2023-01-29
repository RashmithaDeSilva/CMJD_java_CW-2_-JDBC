/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author lahiru (PK) 
 */
public class Item {
    
    private String code;
    private String description;
    private double unitPrice;
    private int qtyOnHand;
    
    // Constractors
    public Item() {}
    public Item(String code) {
        this.code = code;
    }
    public Item(String code, String description, double unitPrice, int qtyOnHand) {
        this.code = code;
        this.description = description;
        this.unitPrice = unitPrice;
        this.qtyOnHand = qtyOnHand;
    }
    
    // Get Mothods
    public String getCode() {
        return code;
    }
    public String getDescription() {
        return description;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public int getQtyOnHand() {
        return qtyOnHand;
    }
    
    // Set Mothods
    public void setCode(String code) {
        this.code = code;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setUnitPric(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }
    
}
