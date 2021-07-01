/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam_case_two;

/**
 *
 * @author EDWARD
 */
public class Finalexam_case_two {
    static book_tracker Book = new book_tracker("The Young Doctor","1974","Ida Bagus","900");
    static book_tracker Book_Two = new book_tracker("Superheroes Are Real","1719","Raymond Bahana","15.50");
    static book_tracker Book_Three = new book_tracker("Falling in Love with Polymorphism","1902","Nunung Nurul","12.80");
    static book_tracker Book_Four = new book_tracker("Bleh Bleh Bleh Bleh","1996","Jude Martinez","9.50");
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Book.getTitle() + "," + Book.getYear() + "," + Book.getAuthor() + "," + Book.getPrice());
    }
    
}