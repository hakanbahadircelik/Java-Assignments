package Methods;

public class _01_Methods {
    public static void main(String[] args) {

        System.out.println(randomNum(10));
        

    }

    public static int randomNum(int max){

        max = (int)(Math.random()*max);

        return max;
    }

}
