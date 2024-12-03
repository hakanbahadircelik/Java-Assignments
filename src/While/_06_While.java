package While;

import java.util.Scanner;

public class _06_While {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int i = 1;

        int rand = (12 + (int) (Math.random() * 20));
        System.out.println(rand);  //  is it create randomly (test)

        while (i <= 3) {
            System.out.print(i + ".guess = ");
            int guess = read.nextInt();
            if (guess == rand) {
                System.out.println("You found it :)");
            } else {
                System.out.println("You couldn't find :(");
            }
            i++;
        }

        System.out.println("The number was= " + rand);
    }
}
