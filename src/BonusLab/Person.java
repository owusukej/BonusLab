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

//** Since in the assignment it says that Person should not be instantilizied, I created an abstract class that fulfills the requirements


public abstract class Person {
    
    /* Enum
    
The gender of the person that they identify as. 
    
    */
    public enum Gender{MALE,FEMALE,OTHER};
    
    

    
    // Variables for each person
    
    protected String name;
    protected String email;
    protected Gender gender;
    protected String publisherName;
    
    
    // Methods; getters and setters
  
    
    public String getName()
    {
        return name;
    }
    
       public void setName(String name)
    {
        this.name = name;
    }
    
    public String getEmail()
    {
        return email;
    }
    
      public void setEmail(String email)
    {
        this.email = email;
    }
    
    public Gender getGender()
    {
        return gender;
    } public void setGender(Gender gender)
    {
        this.gender = gender;
    }
    
    
    
    public String getPublisherName()
    {
        return publisherName;
    }
    
  
 
    
    public void setPublisherName(String publisherName)
    {
        this.publisherName = publisherName;
    }
    
}





