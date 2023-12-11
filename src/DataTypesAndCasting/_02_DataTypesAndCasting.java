package DataTypesAndCasting;

public class _02_DataTypesAndCasting {
    public static void main(String[] args) {
        String num1,num2,num3;
        num1 = "100";
        num2 = "200";
        num3 = "300";

        int num11 = Integer.parseInt(num1);
        int num22 = Integer.parseInt(num2);
        int num33 = Integer.parseInt(num3);

        int result = num11+num22+num33;
        System.out.println(result);

    }
}
