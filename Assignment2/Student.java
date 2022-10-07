/* Name: Patrick Thrower
 * Student Number: T00620480
 * Assignment Number: 2
 * Due Date: Tuesday October 4, 2022, 2:30pm
 * Program Description: Student child class with methods and data
 */

public class Student extends Person implements Comparable <Student>
{
    String degree;
    double gpa;
    
    public Student ()
    {
        super();
        degree = "no degree";
        gpa = 0.0;
    }
    public Student (String newName, int newId, String newDegree, double newGpa)
    {
        super(newName, newId);
        degree = newDegree;
        gpa = newGpa;
    }
    
    public String toString()
    {
        return String.format("%s\nDegree: %s\nGPA: %.1f", super.toString(), degree, gpa );
    }
    
    public String getDegree()
    {
        return degree;
    }
    public double getGpa()
    {
        return gpa;
    }
    
    public void setDegree(String newDegree)
    {
        degree = newDegree;
    }
    public void setGpa (double newGpa)
    {
        gpa = newGpa;
    }
    
    public int compareTo (Student s)
        {
            int output = 99;
            if (this.gpa > s.gpa)
            {
                output = 1;
            }
            else if (this.gpa == s.gpa)
            {
                output = 0;
            }
            else if (this.gpa < s.gpa)
            {
                output = -1;
            }
            return output;
        }
        
}