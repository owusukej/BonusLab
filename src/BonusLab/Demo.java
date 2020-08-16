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
public class Demo {
    
    
    public static void main(String[] args)
    {
        
        // Person factory
        PersonFactory personFactory = PersonFactory.getInstance();
        
        // Book factory
        BookFactory bookFactory = BookFactory.getInstance();
        
        Author author = (Author) personFactory.create("Author", "Brad Thor", "brad.thor@authors.com", Person.Gender.MALE, "Publisher");
        
        // AuthorView
        AuthorView authorView = new AuthorView();
	
        // Controller
        AuthorController authorController = new AuthorController(author,authorView);
        
        // Adding books to our list through the controller
        authorController.addBook(bookFactory.create("Near Dark", 14.99, author));
        authorController.addBook(bookFactory.create("Backlash", 8.99, author));
        authorController.addBook(bookFactory.create("The Lions of Lucerne", 12.99, author));
        authorController.addBook(bookFactory.create("Spy Master", 8.99, author));
        authorController.addBook(bookFactory.create("Path of the Assassin", 12.99, author));

        
        // Viewing our console
        authorController.updateView();
    }
    
}



