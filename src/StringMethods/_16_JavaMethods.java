package StringMethods;

import java.util.Scanner;

public class _16_JavaMethods {
    public static void main(String[] args) {

        Scanner readStr = new Scanner(System.in);
        System.out.print("write a word = ");
        String text = readStr.nextLine();

        System.out.println("first letter = " + text.charAt(0));
        int length = text.length();
        System.out.println("last letter = " + text.charAt(length-1));

    }
}
