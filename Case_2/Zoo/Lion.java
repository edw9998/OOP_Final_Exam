/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

/**
 *
 * @author EDWARD
 */
public class Lion {
    protected String Name;
    protected int Weight;
    
    public Lion(String name_param, int weight_param){
        this.Name = name_param;
        this.Weight = weight_param;
    }
    
    public void printLionDetails(){
        System.out.println(Name + " the lion weighs " + Weight + " pounds and consumes 5 pounds of meat every day.");
    }
}
