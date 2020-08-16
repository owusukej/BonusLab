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



public class AuthorController {
    
   
    private Author model;
    AuthorView view;
    
    
    public AuthorController(Author model, AuthorView view)
    {
        this.model = model;
        this.view = view;
    }
    
    
    // Updating view with controller
    public void updateView()
    {
        view.printAuthorDetails(model.getName(), model.getEmail(), model.getBooks());
    }
    
    // Adding new book through the controller
    public void addBook(Book book)
    {
        model.addBook(book);
    }
    
    // Getter and Setter methods
    
    public String getAuthorName()
    {
        return model.getName();
    }
    
        public void setAuthorName(String name)
    {
        model.setName(name);
    }
	
    public String getAuthorEmail()
    {
        return model.getEmail();
    }
    
      public void setAuthorEmail(String email)
    {
        model.setEmail(email);
    }
    
    public Person.Gender getAuthorGender()
    {
        return model.getGender();
    }
    
      
    public void setAuthorGender(Person.Gender gender)
    {
        model.setGender(gender);
    }
    
    public String getAuthorPublisher()
    {
        return model.getPublisherName();
    }
    

    
    public void setAuthorPublisher(String publisher)
    {
        model.setPublisherName(publisher);
    }
    
}




