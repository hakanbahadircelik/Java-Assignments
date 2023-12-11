package Scanner;

import java.util.Scanner;

public class _10_Scanner {
    public static void main(String[] args) {

        Scanner readInt = new Scanner(System.in);

        System.out.print("1. Number = ");
        int num1 = readInt.nextInt();
        System.out.print("2. Number = ");
        int num2 = readInt.nextInt();

        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);

    }
}
