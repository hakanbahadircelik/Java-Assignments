package While;

import java.util.Scanner;

public class _03_While {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("how many numbers you wanna do = ");
        int num1 = read.nextInt();

        int i = 1;
        int sum = 0;

        while (i <= num1) {
            System.out.print(i + ".num = ");
            int num = read.nextInt();
            sum = sum + num;

            i++;
        }

        System.out.println(sum);

    }
}
