package Scanner;

import java.util.Scanner;

public class _06_Scanner {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("Write your birthday = ");
        String birth = read.nextLine();
        System.out.println(birth);

    }
}
