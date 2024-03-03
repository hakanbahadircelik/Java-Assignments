package Methods;

public class _04_Methods {
    public static void main(String[] args) {

        System.out.println(reverseWord("Java yazin"));

    }

    public static String reverseWord(String word) {

        String[] spaces = word.split(" ");

        String last = "";
        int num = spaces.length;

        for (int i = 0; i < spaces.length; i++) {
            last = last + spaces[num - 1] + " ";
            num--;
        }

        return last;
    }

}
