package Array;

public class _02_Array {
    public static void main(String[] args) {

        String word = "Hello World";
        String tersYazi = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            tersYazi = tersYazi + word.charAt(i);
        }

        System.out.println(tersYazi);

    }
}
