package StringMethods;

import javafx.stage.Screen;

import java.util.Scanner;

public class _15_StringMethods {
    public static void main(String[] args) {

        Scanner readStr = new Scanner(System.in);
        System.out.print("dont write = ");
        String text = readStr.nextLine();
        System.out.println("text.isEmpty() = " + text.isEmpty());
        
    }
}
