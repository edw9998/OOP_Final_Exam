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
public class Java_final_exam {
    static SalesPerson[] salesPeople = new SalesPerson[6];
    
    // Answer For Case 1 --> Number 2f :
    static String highest(){
        double init = salesPeople[0].calcTotalSales();
        SalesPerson Highest = null;
        
        for(int k = 0; k < 3; k++)
            if(salesPeople[k].calcTotalSales() > init)
                Highest = salesPeople[k];
        
        return Highest.getId();          
    }
    
    // Answer For Case 1 --> Number 2g :
    // Instead Of Adding Sales, Value Of Selected Sale Is Updated To Be Higher.
    static void addSales(Sales s, String id){
        for(int find = 0; find < 3; find++){
            if(salesPeople[find].getId() == (String)id){
                salesPeople[find].setSalesHistory(s);
            }
        } 
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        salesPeople[0] = new SalesPerson("100");
        salesPeople[1] = new SalesPerson("101");
        salesPeople[2] = new SalesPerson("102");
        salesPeople[0].setSalesHistory(new Sales("A100",300.00,10));
        salesPeople[0].setSalesHistory(new Sales("A200",1000.00,2));
        salesPeople[1].setSalesHistory(new Sales("A300",2550.40,10));
        
        System.out.println(salesPeople[2].getId());
        System.out.println(salesPeople[0].getCount());
        System.out.println(salesPeople[1].getSalesHistory(0).getValue());
        System.out.println(salesPeople[0].calcTotalSales());
    }
    
}