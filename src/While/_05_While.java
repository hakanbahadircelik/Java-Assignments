package While;

import java.util.Scanner;

public class _05_While {
    public static void main(String[] args) {

        int i = 1;
        int sum = 0;

        while (i <= 100){
            int mod = i % 10;
            if (mod == 5){
                sum++;
            }

            i++;
        }

        System.out.println(sum);
    }
}
