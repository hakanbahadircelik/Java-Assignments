package Methods;

public class _02_Methods {
    public static void main(String[] args) {

        String orn1 = "Ben javayi seviyorum";
        String orn2 = "Javayi kolayca ogreniyorum";
        String orn3 = "Javayi kolayca ogreniyorum ben";
        String orn4 = "Javayi kolayca ogreniyorum ben ama asd asd";

        System.out.println(ortaKelime(orn1));
        System.out.println(ortaKelime(orn2));
        System.out.println(ortaKelime(orn3));
        System.out.println(ortaKelime(orn4));

    }

    public static String ortaKelime(String kelime) {

        String[] word = kelime.split(" ");
        String word2 = "";
        if (word.length % 2 == 0) {
            word2 = "Cumlede orta kelime yok";
        } else {
            word2 = word[word.length / 2];
        }

        return word2;
    }

}
