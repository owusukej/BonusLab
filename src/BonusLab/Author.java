/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BonusLab;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Jimmy Kessie
 */

/* 
this is an extension of a Person because the Author is a person and has everything a person needs. 
*/

public class Author extends Person{
    
    
 
    private List books = new ArrayList<>();

    
    /* 
    * We initialize our object
    */
    public Author(String name, String email, Gender gender,
            String publisherName)
    {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.publisherName = publisherName;
    }
    
    
    // we add books to our booklist 
    public void addBook(Book book)
    {
        books.add(book);
    }

    
    //  We then return the books objects to our AuthorView class
    public List<Book> getBooks() {
        return books;
    }
    
}






