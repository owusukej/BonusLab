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
public class PersonFactory {
 
    private static PersonFactory personFactoryInstance = null;
    
    private PersonFactory()
    {
        
    }
    
            // Creates a new object(Person) if there are no objects in the ckass 

 
    public static PersonFactory getInstance()
    {
        if(personFactoryInstance == null)
        {
           personFactoryInstance = new PersonFactory();
        }
        
           return personFactoryInstance;
    }

            // Creates a "person" 

    public Person create(String type, String name, String email,Person.Gender gender,
            String publisherName)
    {
        if(type.equalsIgnoreCase("AUTHOR"))
        {
            return new Author(name,email,gender,publisherName);
        }
        
        return null;
    }
    
}




