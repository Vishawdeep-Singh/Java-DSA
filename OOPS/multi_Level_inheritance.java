package OOPS;

public class multi_Level_inheritance {
    public static void main(String[] args) {
        Dogs dobby = new Dogs();
        dobby.eat();
        dobby.legs=4;
        System.out.println(dobby.legs);

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
        int legs;
    }
class Dogs extends Mammals{
    String breed;
}


