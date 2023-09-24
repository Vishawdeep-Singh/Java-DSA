package OOPS;

public class classes {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        // created a pen object called p1
        p1.setColor("BLue");
        System.out.println(p1.Color);
        p1.setTip(5);
        System.out.println(p1.tip);
    }
}

class Pen {
    String Color;
    int tip;
    void setColor(String newColor){
Color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
