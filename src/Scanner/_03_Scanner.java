package Scanner;

import java.util.Scanner;

public class _03_Scanner {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("Ur favorite fruit = ");
        String fru = read.nextLine();
        System.out.println(fru);

    }
}
