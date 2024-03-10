package ArrayList;

import java.util.ArrayList;

public class _02_ArrayList {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Orange");
        list.add("orange");
        list.add("Peach");
        list.add("Banana");
        list.add("Orange");

        System.out.println(getCount(list,"Orange"));

    }

    public static int getCount(ArrayList<String> liste, String meyve){
        int count = 0;

        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i).equalsIgnoreCase(meyve)){
                count++;
            }
        }

        return count;
    }

}
