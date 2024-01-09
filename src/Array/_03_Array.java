package Array;

public class _03_Array {
    public static void main(String[] args) {

        int[] num = {25,30,30,35,100};

        int sum = 0;

        for (int i = 0; i < num.length; i++) {

            sum = sum + num[i];

        }

        System.out.println("sum = " + sum);

    }
}
