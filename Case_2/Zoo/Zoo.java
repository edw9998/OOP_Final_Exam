/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import java.util.Scanner;
/**
 *
 * @author EDWARD
 */
public class Zoo {
    static Lion lion = new Lion("Leo",300);
    static Snake snake = new Snake();
    static Monkey monkey = new Monkey();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int choice;
        
        mark:
        while(true){
            System.out.print("\n");
            System.out.println("Welcome To Our Virtual Zoo !");
            System.out.print("\n");
            System.out.println("Pick An Animal :");
            System.out.println("[1]Lion");
            System.out.println("[2]Snake");
            System.out.println("[3]Monkey");
            System.out.print("\n");
            System.out.println("[4]Quit");
            System.out.print("\n");
            System.out.println("Select An Option :");
            
            Scanner in = new Scanner(System.in);
            choice = in.nextInt();
            
            switch(choice){
                case 1:
                    lion.printLionDetails();
                    break;
                case 2:
                    snake.printSnakeDetails();
                    break;
                case 3:
                    monkey.printMonkeyDetails();
                    break;
                case 4:
                    break mark;
                default:
                    System.out.println("Invalid Choice");
                    break;
            } 
            
        }
        
    }
    
}
