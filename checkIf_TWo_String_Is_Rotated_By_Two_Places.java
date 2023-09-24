import java.util.*;
public class checkIf_TWo_String_Is_Rotated_By_Two_Places {
    class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {
if(str1.length()!=str2.length()){
    return false;
}
if(str1.length()<2){
    return str1.equals(str2);
}
String clock_rot="";
String anticlock_rot="";
int len = str1.length();
 
 anticlock_rot= str2.substring(len-2,len)+str2.substring(0,len-2);
 clock_rot=str2.substring(2)+str2.substring(0,2);
 
 if(str1.equals(anticlock_rot)||str1.equals(clock_rot)){
     return true;
 }
    return false;
}
}
}
