package If;

import java.util.Scanner;

public class _02_If {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("write midterm point : ");
        int midtermP = read.nextInt();

        System.out.print("Write final point : ");
        int finalP = read.nextInt();

        double ort = 0.4 * midtermP + 0.6 * finalP;

        System.out.println(ort);

        if(ort >= 50){
            System.out.println("you passed");
        } else {
            System.out.println("you did not passed");
        }

    }
}
