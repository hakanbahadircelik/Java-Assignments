package Scanner;

import java.util.Scanner;

public class _11_Scanner {
    public static void main(String[] args) {

        Scanner readInt = new Scanner(System.in);

        System.out.print("1. Point = ");
        int point1 = readInt.nextInt();
        System.out.print("2. Point = ");
        int point2 = readInt.nextInt();
        System.out.print("3. Point = ");
        int point3 = readInt.nextInt();

        System.out.println( (point1 + point2 + point3) / 3 );

    }
}
