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
public class SalesPerson {
    // each object contains details of one salesperson
    private String id;
    private Sales[] salesHistory;   // details of the different sales
    private int count = 0;          // number of sales made
    
    //constructor for a new salesperson
    //Answer For Case 1 --> Number 2a :
    public SalesPerson(String id){
        // code missing
        this.id = id;
        this.salesHistory = new Sales[3];
        this.count = 0;
    } 
    
    public int getCount() {
        return this.count;
    } 
    
    public String getId() {
        return this.id;
    } 
    
    public void setSalesHistory(Sales s){
        salesHistory[count] = s;
        count = count + 1;
    } 
    
    public Sales getSalesHistory(int arr_idx){
        return salesHistory[arr_idx];
    }
    
    public double calcTotalSales(){
        // calculates total sales for the salesperson
        // code missing
        /*
            Answer For Case 1 --> Number 2e :
            1) Loop through salesHistory Array.
            2) Count The Sum Of Attribute Value.
        */
        double val_sum = 0.0d;
        
        for(int j = 0; j < salesHistory.length - 1; j++)
            val_sum = val_sum + salesHistory[j].getValue();
        
        return val_sum;
    } 
    
    public Sales largestSale(){
        // calculates the sale with the largest value
        // code missing
        /*
            Find the Sales Instance In The Array With The Highest Value.
        */
        double start = salesHistory[0].getValue();
        Sales Largest = null;
        
        // Traverse array elements from second element and compare every element with current max.
        for(int i = 1; i < salesHistory.length - 1; i++)
            if(salesHistory[i].getValue() > start)
                Largest = salesHistory[i];
        
        return Largest;
    }
    
}