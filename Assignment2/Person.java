/* Name: Patrick Thrower
 * Student Number: T00620480
 * Assignment Number: 2
 * Due Date: Tuesday October 4, 2022, 2:30pm
 * Program Description: Parent class with new equals method
 */

public class Person
{

    String name;
    Integer id = new Integer(0);
    
    public Person()
    {
        name = "no name";
        id = 999999;
    }
    public Person (String newName, int newId)
    {
        name = newName;
        id = newId;
    }
    
    public String toString()
    {
        return String.format("Name: %s\nID: %d", name, id);
    }
    
    public boolean equals(Object o) 
    {
       if (this == o)     // self check
        return true;
       if (o == null)    // null check
       return false;
       if (!(o instanceof Person))   // type check     and cast
        return false;

       Person person = (Person) o;
       
       return  this.name.equals(person.name) && this.id.equals(person.id);
    }

    public String getName()
    {
        return name;
    }
    public int getId()
    {
        return id;
    }
    
    public void setName(String newName)
    {
        name = newName;
    }
    public void setId(int newId)
    {
        id = newId;
    }
    
}