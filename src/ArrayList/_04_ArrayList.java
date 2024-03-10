package ArrayList;

import java.util.ArrayList;

public class _04_ArrayList {
    public static void main(String[] args) {

        ArrayList<String> city = new ArrayList<>();
        city.add("New jersey");
        city.add("New york");
        city.add("Ohio");
        city.add("Florida");
        city.add("Boston");

        System.out.println(getLenght(city));
    }

    public static ArrayList<Integer> getLenght(ArrayList<String> sehirler) {

        ArrayList<Integer> count = new ArrayList<>();

        for (int i = 0; i < sehirler.size(); i++) {
            count.add(sehirler.get(i).length());
        }

        return count;
    }

}
