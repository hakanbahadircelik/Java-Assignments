package StringMethods;

import java.util.Scanner;

public class _14_StringMethods {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("write a name : ");
        String text1 = read.nextLine();
        System.out.print("write a surname : ");
        String text2 = read.nextLine();

        System.out.println(text1 + " " + text2);

    }
}
