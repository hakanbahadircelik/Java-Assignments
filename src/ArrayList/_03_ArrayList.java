package ArrayList;

import java.util.ArrayList;

public class _03_ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numaralar = new ArrayList<>();

        numaralar.add(1);
        numaralar.add(2);
        numaralar.add(3);
        numaralar.add(4);
        numaralar.add(5);

        System.out.println(getSum(numaralar));

    }

    private static int getSum(ArrayList<Integer> numbers){
        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            sum = sum + numbers.get(i);
        }

        return sum;
    }

}
