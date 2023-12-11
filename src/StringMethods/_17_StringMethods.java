package StringMethods;

import java.awt.*;
import java.util.Scanner;

public class _17_StringMethods {
    public static void main(String[] args) {

        Scanner readStr = new Scanner(System.in);
        System.out.print("Write your name : ");
        String name = readStr.nextLine();

        int index1 = name.indexOf(" ");
        int index2 = name.lastIndexOf(" ");

        System.out.println(name.charAt(0) + "." + name.charAt(index1+1) + "." + name.charAt(index2+1) + "." );

    }
}
