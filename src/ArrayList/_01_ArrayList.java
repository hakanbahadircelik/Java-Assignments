package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_ArrayList {
    public static void main(String[] args) {

        int[][] array2d = {{1,2,3}, {4,5,6}, {7,8,9}};

        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                System.out.print(array2d[i][j]);
            }
        }

System.out.println();  //  SPACE

        ArrayList<Integer> aList = new ArrayList<>();

        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                aList.add(array2d[i][j]);
            }
        }

        System.out.println(aList);

    }
}
