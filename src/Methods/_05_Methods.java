package Methods;

public class _05_Methods {
    public static void main(String[] args) {

        String[] dizi = {"merhaba", "dunya", "selam"};

        System.out.println(reverseWord(dizi));

    }

    public static String reverseWord(String[] dizi) {

        String tersi = "";

        for (int i = dizi.length-1; i >= 0; i--) {
            tersi = tersi + dizi[i] + " ";
        }

        return tersi;
    }

}
