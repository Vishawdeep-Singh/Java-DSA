package OOPS;

public class abstrat {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        Chicken c = new Chicken();
        c.eat();
        c.walk();

        Animal a = new Animal();
            // here it is error because we cannot create object of
            //  abstract classes . also in abstract function we have
            //  to imply that abstract func. in inheritence like the
            // example below .
        
    }
}
abstract class Animal{
    void eat(){
        System.out.println("animal eats"); 
    }
    abstract void walk();

    
}
class Horse extends Animal{
void walk(){
    System.out.println("Walk on 4 legs");
}
}
class Chicken extends Animal{
    void walk(){
        System.out.println("Walk on 2 legs");
    }
}