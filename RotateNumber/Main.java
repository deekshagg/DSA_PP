

public class Main {
    public static void main(String[] args) {
        int number = 95673;
        System.out.println(reverse(number));
    }
    public static int reverse(int number){
        int count = (int) Math.log10(number);
        int div = (int) Math.pow(10, count);
        int result = 0;
        while(div>=1){
            int remainder = number%10;
            number=number/10;
            result = result + remainder*div;
            div = div /10;
        }
        return result;
    }
}
