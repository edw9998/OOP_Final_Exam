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
public class Snake{
    private String Name;
    private int Weight;
    protected int Length;
    
    public Snake(){
        this.Name = "Ana";
        this.Weight = 50;
        this.Length = 5;
    }
    
    public void printSnakeDetails(){
        System.out.println(this.Name + " the snake weighs " + this.Weight + " pounds and is " + Length + " foot long.");
    } 
    
}
