package Scanner;

import java.util.Scanner;

public class _05_Scanner {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("which city you lived 10 year ago = ");
        String city = read.nextLine();
        System.out.println(city);

    }
}
