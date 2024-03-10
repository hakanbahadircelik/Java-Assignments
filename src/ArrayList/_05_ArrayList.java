package ArrayList;

import java.util.ArrayList;

public class _05_ArrayList {
    public static void main(String[] args) {

        ArrayList<String> renkler = new ArrayList<>();
        renkler.add("yellow");
        renkler.add("red");
        renkler.add("blue");
        renkler.add("red");
        renkler.add("blue");

        String s1 = "blue";
        String s2 = "yellow";

        System.out.println(changelnArraylist(renkler,s1,s2));
    }

    public static ArrayList<String> changelnArraylist(ArrayList<String> liste, String s1, String s2){

        ArrayList<String> colors = new ArrayList<>();

        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i).equalsIgnoreCase(s1)){
                colors.add(s2);
            } else {
                colors.add(liste.get(i));
            }
        }

        return colors;
    }

}
