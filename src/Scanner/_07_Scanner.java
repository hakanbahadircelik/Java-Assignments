package Scanner;

import java.util.Scanner;

public class _07_Scanner {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("do u have a bank acc ? ");
        boolean yesNo = read.nextBoolean();
        System.out.println(yesNo);

    }
}
