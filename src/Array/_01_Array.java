package Array;

public class _01_Array {
    public static void main(String[] args) {

        String word = "Removes white space from both ends of a string";

        int x = 0;

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == ' '){
                x++;
            }

        }

        System.out.println(x+1);

        // second way

        String[] words = word.split(" ");
        System.out.println(words.length);


    }
}
