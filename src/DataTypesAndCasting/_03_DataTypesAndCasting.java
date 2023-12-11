package DataTypesAndCasting;

public class _03_DataTypesAndCasting {
    public static void main(String[] args) {

        String num1,num2,num3;
        num1 = "150";
        num2 = "185";
        num3 = "95";

        int num11 = Integer.parseInt(num1);
        int num22 = Integer.parseInt(num2);
        int num33 = Integer.parseInt(num3);

        double result = (num11 + num22 + (double)num33) / 3;
        System.out.println(result);

    }
}
