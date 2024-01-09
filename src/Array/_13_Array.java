package Array;

public class _13_Array {
    public static void main(String[] args) {

        String nums = "$12 $23 $10 $2 $5 $2";
        int sum = 0;

        String newNums = nums.replace("$", "");

        String[] arrayStr = newNums.split(" ");

        int[] arrayInt = new int[arrayStr.length];

        for (int i = 0; i < arrayStr.length; i++) {
            arrayInt[i] = Integer.parseInt(arrayStr[i]);
            sum = sum + arrayInt[i];
        }

        System.out.println(sum);

    }
}
