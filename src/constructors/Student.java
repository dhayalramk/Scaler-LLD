package constructors;

public class Student {
    String name;
    String address = "Default address";
    String email;
    String batch;
    double psp;
    String state;

    Student(String name, String address){
        this.name = name;
        this.address = address;
    }

    Student(){}

    void changeBatch(String newBatch){
        this.batch = newBatch;
    }

    void pauseCourse(){
        this.state = "PAUSED";
    }
}
