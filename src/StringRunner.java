import java.util.*;
public class StringRunner {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);


        System.out.print("Enter first string: ");
        String str1 = input.nextLine();
        System.out.println("String length: " + str1.length());
        System.out.println("First Half: " + str1.substring(0,str1.length()/2));
        System.out.println("Second Half: " + str1.substring(str1.length()/2));
        System.out.print("Enter second string: ");
        String str2 = input.nextLine();
        if (str1.length()>str2.length()) {
            System.out.println(str1 + " is longer");
        } else if (str2.length()>str1.length()){
            System.out.println(str2 + " is longer");
        } else {
            System.out.println("Both strings have the exact same length");
        }
        if (str1.compareTo(str2) > 0) {
            System.out.println(str2 + " is first in the alphabet");
        } else if (str1.compareTo(str2) < 0) {
            System.out.println(str1 + " is first in the alphabet");
        } else {
            System.out.println("Both strings have the exact same characters");
        }
        if (str1.indexOf(str2) != -1) {
                System.out.println(str2 + " is found in " + str1 + " at index " + str1.indexOf(str2));
        } else {
            System.out.println(str2 + " is not found in " + str1);
        }










    }


}
