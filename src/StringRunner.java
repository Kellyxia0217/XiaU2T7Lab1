import java.util.*;
public class StringRunner {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter first string: ");
        String str1 = input.next();
        System.out.println("String length: " + str1.length());
        System.out.print("First Half: " + str1.substring(0,str1.length()/2));
        System.out.print("Second Half: " + str1.substring(str1.length()/2,str1.length()));
        System.out.println("Enter second string: ");
        String str2 = input.next();
        if (str1.length()>str2.length()) {
            System.out.println(str1 + "is longer");
        } else if (str2.length()>str1.length()){
            System.out.println(str2 + "is longer");
        } else {
            System.out.println("Both strings have the exact same length");
        }
        if (str1.compareTo(str2) > 0) {
            System.out.println(str2 + "is first in the alphabet");
        } else if (str1.compareTo(str2) < 0) {
            System.out.println(str1 + "is firs in the alphabet");
        } else {
            System.out.println("Both strings have the exact same characters");
        }










    }


}
