package Scanner;

import java.util.Scanner;

public class _04_Scanner {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("How many doors you have on your car = ");
        int door = read.nextInt();
        System.out.println(door);

    }
}
