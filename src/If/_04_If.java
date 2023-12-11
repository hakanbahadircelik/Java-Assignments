package If;

import java.util.Scanner;

public class _04_If {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("password : ");
        String pw1 = read.nextLine();

        System.out.print("again password : ");
        String pw2 = read.nextLine();

        if (pw1.equals(pw2)){
            System.out.println("pw true");
        } else {
            System.out.println("pw wrong");
        }

    }
}
