/*
    Write Java programs to implement String and StringBuffer classes and its methods.
*/
import java.io.*;

class string {
    void string_methods()   {
        System.out.println("\nUsing string methods :-");
        String s1 = "Royal"; // 1st string
        String s2 = "Enfield"; // 2nd string
        System.out.println("s1 = "+s1);
        System.out.println("s2 = "+s2);
        System.out.println("Length of string s1 = "+s1.length()+" Length of string s2 = "+s2.length()); // To print length of steing
        String s3 = s1.concat(s2); // Concatening 1 and 2
        System.out.println("Concatenated string s3 = "+s3);
        String s4 = s1+s2;
        System.out.println("Concatenated string using '+' = "+s4);
        System.out.println("To UPPERCASE : "+s4.toUpperCase()); // Converting to UPPERCASE
        System.out.println("To lowercase : "+s4.toLowerCase()); // Converting to lowercase
        System.out.println("Character at positon 3 of s3 = "+s3.charAt(4)); //Printing character at a particular position
    }
}

class string_buffer {
    void string_buffer_methods()    {
        System.out.println("\nUsing StringBUffer methods :-");
        StringBuffer s = new StringBuffer("Tata IPL");  //String
        System.out.println("String = "+s);
        System.out.println("Length of string s = "+s.length());
        System.out.println("Capacity of string s = "+s.capacity());
        System.out.println("Adiing text at end = "+s.append(" 2022"));
        System.out.println("Adding text at specified position = "+s.insert(0, "Star Sports presents "));
        System.out.println("Reversing the string = "+s.reverse());
        s.reverse();
        System.out.println("Deleting charcters from specified positon = "+s.delete(12, 20));
        System.out.println("Replcaing characters at specified positon = "+s.replace(0, 11, "Sony Sports"));
    }
}
public class Program_6a {
    public static void main(String args[]) {
        string  S = new string();   // Object of string class
        S.string_methods();

        string_buffer sb = new string_buffer(); // Object of string_buffer class
        sb.string_buffer_methods();
    }
}
