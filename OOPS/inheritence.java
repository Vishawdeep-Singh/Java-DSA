package OOPS;
import java.util.*;;

public class inheritence {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }



}



// base class
class Animal{
    String color;
    void eat () {
        System.out.println("Eats");
    
    }
    void breathe(){
        System.out.println("Breathes");
    }
    
    }
    //Derived class
    class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims in water");
    }
    
    }