package OOPS;

public class hierarchial_inheritence {
    public static void main(String[] args) {
        
    }
}


class Animal{
    String color;
    void eat () {
        System.out.println("Eats");
    
    }
    void breathe(){
        System.out.println("Breathes");
    }
    
    }
    class Mammals extends Animal{
        void walk(){
            System.out.println("Walks");
        }
    }
class Fish extends Animal{
    void swim(){
        System.out.println("Swims");
    }
}
class Bird extends Animal{
    void fly(){
System.out.println("Flys");
    }
}