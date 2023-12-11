package If;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class _01_If {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("write a num : ");
        String num = read.nextLine();

        int length = num.length();
        char first = num.charAt(length-1);
        int odd = first % 2;

        if (odd == 1){
            System.out.println("odd");
        }else {
            System.out.println("even");
        }

    }
}
