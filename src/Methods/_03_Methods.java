package Methods;

public class _03_Methods {
    public static void main(String[] args) {

        System.out.println(reverseString("javayi seviyorum"));



    }

    public static String reverseString(String sentences){

        String reverse = "";
        int uzunluk = sentences.length();

        for (int i = 0; i < sentences.length(); i++) {
            reverse = reverse + sentences.charAt(uzunluk-1);
            uzunluk--;
        }

        return reverse;
    }

}
