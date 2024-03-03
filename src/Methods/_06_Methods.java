package Methods;

public class _06_Methods {
    public static void main(String[] args) {

        System.out.println(powerOfThree(28));

    }

    public static boolean powerOfThree(int num1){

        boolean yesNo = false;

        if (num1 % 3 == 0)
            yesNo = true;

        return yesNo;
    }

}
