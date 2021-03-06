package constructors;

public class Main {
    public static void main(String[] args){
        Student dhayal = new Student("Dhayal Ram", "World"); // Constructor

        // Initialize values
        dhayal.state = "ACTIVE";

        // State check before and after pausing the course
        System.out.println("State of: "+dhayal.name + ", is: "+ dhayal.state);
        dhayal.pauseCourse();
        System.out.println("State of: "+dhayal.name + ", is: "+ dhayal.state);

        Student s1 = new Student("Ram", null);

        System.out.println("Empty parameter constructor called");
        Student s2 = new Student();

        System.out.println("Copy constructor called");
        Student s3 = new Student(s2);
    }
}
