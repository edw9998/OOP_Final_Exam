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
public class Monkey {
    private String Name;
    private int Weight;
    private String fav_food;
    
    public Monkey(){
        this.Name = "George";
        this.Weight = 120;
        this.fav_food = "Kiwi";
    } 
    
    public void printMonkeyDetails(){
        System.out.println(Name + " the monkey weighs " + Weight + " pounds and loves " + fav_food);
    } 
    
}
