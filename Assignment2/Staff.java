/* Name: Patrick Thrower
 * Student Number: T00620480
 * Assignment Number: 2
 * Due Date: Tuesday October 4, 2022, 2:30pm
 * Program Description: Introducing new child staff class with new data
 */

public class Staff extends Person
{
    String job;
    
    public Staff()
    {
        super();
        job = "no job";
    }
    public Staff(String newName, int newId, String newJob)
    {
        super(newName, newId);
        job = newJob;
    }
    
    public String toString()
    {
        return super.toString() + "\nJob Title: " + job;
    }
    
    public String getJob()
    {
        return job;
    }
    
    public void setJob(String newJob)
    {
        job = newJob;
    }
}