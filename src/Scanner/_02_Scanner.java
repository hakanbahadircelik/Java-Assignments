package Scanner;

import java.util.Scanner;

public class _02_Scanner {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("Write a num = ");
        int num = read.nextInt();
        System.out.println(num);

    }
}
