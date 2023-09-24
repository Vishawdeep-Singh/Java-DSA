package OOPS;

public class constructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Vishu");
        Student s3 = new Student(29);
        // Student s4 = new Student("Vishu" , 29); // error show because there is no such constructor
    }
}

class Student{
    String name;
    int roll;

    Student(){ // Constructor
System.out.println("Constructor is called");

    }

    Student(String name){
this.name = name;
    }
    Student(int roll){
this.roll = roll;
    }
}
