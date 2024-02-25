package Array2D;

public class _02_Array2D {
    public static void main(String[] args) {

        int[][] array = {{5, 2, 1}, {10, 2, 3, 6}, {1, 2}};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
            }
        }

        System.out.println("sum = " + sum);

    }
}
