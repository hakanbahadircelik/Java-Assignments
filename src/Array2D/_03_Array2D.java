package Array2D;

public class _03_Array2D {
    public static void main(String[] args) {

        String[][] array = {
                {"new jersey"," atlanta","ohio"} ,
                {"Pittsburgh" ,"ohio","ohio"} ,
                {"ohio","new york", "new jersey"}
        };

        String Florida = " Florida ";

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].equalsIgnoreCase("ohio")){
                    array[i][j] = Florida;
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
