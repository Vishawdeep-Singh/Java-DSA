package Strings;
import java.util.*;
public class shortest_path {
    public static void main(String[] args) {
        String PATH = "WNEENESENNN";
System.out.println(getShortestPath(PATH));
    }
    public static float getShortestPath(String PATH) {
        int x=0;
        int y=0;
        for (int i = 0; i < PATH.length(); i++) {
            char dir = PATH.charAt(i);
            if (dir=='S') {
                y--;
            }
            else if(dir=='N') {
                y++;
            }
            else if(dir=='W'){
                x--;
            }
            else{
                x++;
            }
        }
        int X2 = x*x;
        int Y2= y*y;
return (float) Math.sqrt(X2 + Y2);
        
    }
}
