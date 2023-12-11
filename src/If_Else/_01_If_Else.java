package If_Else;

import java.util.Scanner;

public class _01_If_Else {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("Write num : ");
        String nums = read.nextLine();

        int space = nums.indexOf(" ");

        String firstNum = nums.substring(0,space);
        String secondNum = nums.substring(space+1);

        int num1 = Integer.parseInt(firstNum);
        int num2 = Integer.parseInt(secondNum);

        if (num1 == num2){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

    }
}
