/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_final_exam;

/**
 *
 * @author EDWARD
 */
public class Sales {
    // each object contains details of one sale
    private String itemId;  // id of the item
    private double value;   // the price of one item
    private int quantity;   // the number of the items sold
    
    // constructor missing
    public Sales(String item_id_val, double value_val, int qty_val){
        this.itemId = item_id_val;
        this.value = value_val;
        this.quantity = qty_val;
    }
    
    public void setItemId(String new_id) {
        this.itemId = new_id;
    }
    
    public void SetValue(double new_val) {
        this.value = new_val;
    }
    
    public void setQuantity(int new_qty) {
        this.quantity = new_qty;
    }
    
    public String getItemId() {
        return this.itemId;
    }
    
    public double getValue() {
        return this.value;
    }
    
    public int getQuantity() {
        return this.quantity;
    } 

}