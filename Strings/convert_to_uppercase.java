package Strings;

public class convert_to_uppercase {
    public static void main(String[] args) {
        String str = "hi , i am vishu";
    }
    public static String toUppercase(String str) {
        Stringbuilder sb= new Stringbuilder();
        char ch = Character.toUpperCase(str.charAt(0));
        ((Object) sb).append(ch);
    }
}
