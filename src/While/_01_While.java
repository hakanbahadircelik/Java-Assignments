package While;

import java.util.Scanner;

public class _01_While {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int i = 1;
        int sum = 0;

        while (i <= 5){
            System.out.print("num = ");
            int num = read.nextInt();
            int mod = num % 2;
            if (mod == 1){
                sum = sum + num;
            }
            i++;
        }

        System.out.println(sum);

    }
}
