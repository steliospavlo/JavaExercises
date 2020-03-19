package playingwithemployessinterface;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    /*
    ##Exercise2
1. Create class Employee with name and salary.
    2. Create subclasses Teacher, Receptionist, Director
3. Teacher teach(), Receptionist greet(), Director guide()
4. Interfaces Advisable, Driving
5. Advisable has method giveAdvice(), Driving has method drive().
6. Teacher-->Advisable, Receptionist-->Driving, Director-->both.
7. Create 2 Teachers, 1 Receptionist, 2 Director. Put them in a list.
7a. Add abstract method work() in Employee.
7b. Each work() method will call the special method each Subclass has.
7c. Ask each employee to work().
8. Separate those that can drive from those that can advice.
     */
    public static void main(String[] args) {
        Employee teacher1 = new Teacher("Nick", 1000);
        Employee teacher2 = new Teacher("John", 1200);
        Employee receptionist = new Receptionist("Peter", 1200);
        Employee director1 = new Director("Andy", 2000);
        Employee director2 = new Director("Kate", 2200);

        List<Employee> employees = new ArrayList();
        employees.add(teacher1);
        employees.add(teacher2);
        employees.add(receptionist);
        employees.add(director1);
        employees.add(director2);

        for (Employee work : employees) {
            work.work();
        }

        List<Advisable> advisers = new ArrayList();
        List<Driving> drivers = new ArrayList();
        //how many advisers and drivers do we have?  add them to a list //instance of

//        boolean isAdvisable = teacher1 instanceof Advisable;
//        System.out.println("Teacher1 Advisable = " + isAdvisable);
        List<Employee> employee = new ArrayList();

        for (Employee people : employees) {
            //System.out.println(people);
            if (people instanceof Advisable) {
                advisers.add((Advisable) people);
            }
            if (people instanceof Driving) {
                drivers.add((Driving) people);
            }
        }

        System.out.println("Advisers : \n" + advisers);
        System.out.println("Drivers : \n" + drivers);

    }

}
