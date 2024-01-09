package Array;

public class _08_Array {
    public static void main(String[] args) {

        int[] nums = {5, 6, 8, 12, 14, 19};
        int x = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                x = x - nums[i];
            } else {
                x = x + nums[i];
            }
        }

        System.out.println(x);

    }
}
