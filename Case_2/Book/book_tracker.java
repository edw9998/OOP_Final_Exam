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
public class book_tracker {
    private String title;
    private String yearPublished;
    private String authorName;
    private String price;
    
    public book_tracker(String title_param, String year_param, String author_param, String price_param){
        this.title = title_param;
        this.yearPublished = year_param;
        this.authorName = author_param;
        this.price = "$" + price_param;
    } 
    
    public void setTitle(String newTitle){
        this.title = newTitle;
    }
    
    public void setYear(String newYear){
        this.yearPublished = newYear;
    }
    
    public void setAuthor(String newAuthor){
        this.authorName = newAuthor;
    }
    
    public void setPrice(String newPrice){
        this.price = "$" + newPrice;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public String getYear(){
        return this.yearPublished;
    }
    
    public String getAuthor(){
        return this.authorName;
    }
    
    public String getPrice(){
        return this.price;
    }
    
}
