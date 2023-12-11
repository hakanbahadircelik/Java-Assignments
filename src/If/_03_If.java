package If;

import java.util.Scanner;

public class _03_If {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("write a sentences :");
        String text = read.nextLine();

        if (text.contains("A")) {
            System.out.println("There is");
        } else {
            System.out.println("There is not");
        }

    }
}
