package If_Else;

import java.util.Scanner;

public class _02_If_Else {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("write nums ; ");
        String nums = read.nextLine();

        int space1 = nums.indexOf(" ");
        int space2 = nums.lastIndexOf(" ");

        String firstN = nums.substring(0, space1);
        String secondN = nums.substring(space1 + 1, space2);
        String thirdN = nums.substring(space2 + 1);

        int num1 = Integer.parseInt(firstN);
        int num2 = Integer.parseInt(secondN);
        int num3 = Integer.parseInt(thirdN);

        System.out.println(num1 + " " + num2 + " " + num3);

        int sum = num1 + num2 + num3;
        int odd = sum % 2;

        if (odd == 1) {
            System.out.println("odd");
        } else {
            System.out.println("even");
        }

    }
}
