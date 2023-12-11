package StringMethods;

import java.util.Scanner;

public class _18_StringMethods {
    public static void main(String[] args) {

        Scanner readStr = new Scanner(System.in);
        System.out.print("Write name and surname : ");
        String name = readStr.nextLine();

        int space1 = name.indexOf(" ");
        int space2 = name.lastIndexOf(" ");

        String name1 = name.substring(0, space1);
        String name2 = name.substring(space1 + 1, space2);
        String name3 = name.substring(space2 + 1);

        System.out.println(name1 + "\n" + name2 + "\n" + name3);

    }
}
