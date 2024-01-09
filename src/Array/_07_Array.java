package Array;

public class _07_Array {
    public static void main(String[] args) {

        int[] nums = {12, 14, 21, 23, 10, 4};
        int ave = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }

        ave = sum / nums.length;

        System.out.println("ave = " + ave);

    }
}
