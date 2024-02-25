package Array2D;

import java.util.Arrays;

public class _01_Array2D {
    public static void main(String[] args) {

        int[][] array = {{2, 3, 2},{4,1,5},{7,2,5}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 2){
                    array[i][j] = 6;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

    }
}
