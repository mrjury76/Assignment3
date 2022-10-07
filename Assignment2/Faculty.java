/* Name: Patrick Thrower
 * Student Number: T00620480
 * Assignment Number: 2
 * Due Date: Tuesday October 4, 2022, 2:30pm
 * Program Description: Faculty child class with methods and data
 */

public class Faculty extends Person
{
    String dept;
    String title;
    
    public Faculty()
    {
        super();
        dept = "no dept";
        title = "no title";
    }
    public Faculty(String newName, int newId, String newDept, String newTitle)
    {
        super(newName, newId);
        dept = newDept;
        title = newTitle;
    }
    
    public String toString()
    {
        return super.toString() + "\nDepartment: " + dept + "\nTitle: " + title;
    }
    
    public String getDept()
    {
        return dept;
    }
    public String getTitle()
    {
        return title;
    }
    
    public void setDept(String newDept)
    {
        dept = newDept;
    }
    public void setTitle(String newTitle)
    {
        title = newTitle;
    }
}