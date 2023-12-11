package Scanner;

import java.util.Scanner;

public class _01_Scanner {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("Ur name = ");
        String name = read.nextLine();
        System.out.println(name);

    }
}
