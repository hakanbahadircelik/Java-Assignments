package Array;

public class _12_Array {
    public static void main(String[] args) {

        String[] x = {"apple", "Orange", "Banana", "Pineapple"};

        for (int i = 0; i < x.length; i++) {

            if (x[i].equalsIgnoreCase("apple")){
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }

    }
}
