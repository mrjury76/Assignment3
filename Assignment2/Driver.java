/* Name: Patrick Thrower
 * Student Number: T00620480
 * Assignment Number: 2
 * Due Date: Tuesday October 4, 2022, 2:30pm
 * Program Description: Driver class to print and test new methods
 */

public class Driver
{
    public static void main (String[] args)
    {
        //creating objects
        Person p = new Person("Patrick", 1234);
        Student s = new Student("Lemmy", 5678, "Arts", 4.0);
        Student s2 = new Student("Pablo", 5678, "Arts", 3.5);
        Student s3 = new Student("Orion", 5678, "Arts", 3.0);
        Student s4 = new Student("Steve", 5678, "Arts", 2.5);
        Faculty f = new Faculty("John", 9012, "Science", "Doctor");
        Staff j = new Staff("Noda", 6666, "Janitor");

        //people array
        //Person[] people = {p, s, f, j};


        Student[] stu = {s, s2, s3 ,s4};
        Student[] stu10 = new Student[10];
        stu10[0] = ("Lemmy", 123, "Arts", 4.0);
        stu10[1] = ("Lemmy", 123, "Arts", 3.5);
        stu10[2] = ("Lemmy", 123, "Arts", 3.0);
        stu10[3] = ("Lemmy", 123, "Arts", 4.0);
        stu10[4] = ("Lemmy", 123, "Arts", 4.0);
        stu10[5] = ("Lemmy", 123, "Arts", 4.0);
        stu10[6] = ("Lemmy", 123, "Arts", 4.0);
        stu10[7] = ("Lemmy", 123, "Arts", 4.0);
        stu10[8] = ("Lemmy", 123, "Arts", 4.0);
        stu10[9] = ("Lemmy", 123, "Arts", 4.0);
        ((Student)s).setGpa(1.0)

        //for loop to display proper equals method
        for (int i = 0; i<stu.length; i++)
        {
            System.out.println("Testing compareTo: " + stu[i].getName() );

            for (int h = 0; h<stu.length; h++)
            {
                System.out.println(stu[h].compareTo(stu[i]) );
            }
            System.out.println();
        }
        
        //for loop to display proper equals method
        /*for (int i = 0; i<people.length; i++)
        {
            System.out.println("Testing equals method with: " + people[i].getName());

            for (int h = 0; h<people.length; h++)
            {
                System.out.println("\t" + people[h].getName() + ": " + people[i].equals(people[h]) );
            }
            System.out.println();
        }*/
    }
}