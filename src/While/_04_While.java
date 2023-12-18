package While;

import java.util.Scanner;

public class _04_While {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int i = 1;
        int sum = 0;

        while (i <= 5) {
            System.out.print(i + ".num = ");
            int num = read.nextInt();
            if (num <= 30 && num >= 10){
                sum = sum + num;
            }
                i++;
        }

        System.out.println(sum);

    }
}
