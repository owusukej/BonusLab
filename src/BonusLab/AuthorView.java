/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BonusLab;

import java.util.List;

/**
 *
 * @author Jimmy Kessie 
 */
public class AuthorView {
    
//Here is where we display the Book AUthor's name, their email address and their book list below. 
	public void printAuthorDetails(String name, String email,List<Book> books)
    {
        System.out.println(name + "(" + email + ")" + "\nBooks:");
        
        for(Book book : books)
        {
            System.out.println(book.getTitle() + ", " + book.getPrice() + "$");
        }
        
    }
        
    
}




