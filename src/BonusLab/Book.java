/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BonusLab;

/**
 *
 * @author Jimmy Kessie 
 */
public class Book {
    //** Variables for the book 
    private String title;
    private double price;
    private Author author;
    
    
    
  
    public Book(String title, double price, Author author)
    {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    
    //these setters and getters methods
    
  
    public void setTitle(String title)
    {
        this.title = title;
    }
      
    public String getTitle()
    {
        return title;
    }
    public void setPrice(int p)
    {
        this.price = price;
    }
    
       public double getPrice()
    {
        return price;
    }
    
    
    public void setAuthor(Author a)
    {
        this.author = author;
    }

 
 
    public Author getAuthor()
    {
        return author;
    }
    
}




