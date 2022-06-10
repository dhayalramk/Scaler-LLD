package introtooop;

public class Main {
    public static void main(String[] args){
        Student dhayal = new Student(); // Constructor

        // Initialize values
        dhayal.name = "Dhayal Ram";
        dhayal.address = "World";
        dhayal.state = "ACTIVE";

        // State check before and after pausing the course
        System.out.println("State of: "+dhayal.name + ", is: "+ dhayal.state);
        dhayal.pauseCourse();
        System.out.println("State of: "+dhayal.name + ", is: "+ dhayal.state);
    }
}
