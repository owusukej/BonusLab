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
public class BookFactory {
        

    private static BookFactory bookFactoryInstance = null;
    
    private BookFactory()
    {
        
    }
   
   
    public static BookFactory getInstance()
    {
        // Creates a new object(book) if there are no objects in the ckass 
        if(bookFactoryInstance == null)
        {
           bookFactoryInstance = new BookFactory();
        }
        
           return bookFactoryInstance;
    }
    

    
    // We are only using one method which creates a "book" for our list. 
    
   
    public Book create(String title,double price, Author author)
    {
        return new Book(title,price,author);
    }

    
}




