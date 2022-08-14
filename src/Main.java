import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BigInteger mult;
        String str = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your First Big number : ");
        BigInteger number1 = input.nextBigInteger();
        System.out.println("Enter your secound Big number : ");
        BigInteger number2 = input.nextBigInteger();
        input.nextLine();
        System.out.println("Enter your Operator(+ - / * ) : ");
        str = input.nextLine();
        switch (str){
            case("*"):
                mult = number1.multiply(number2);
                System.out.println(mult);
                break;
            case("+"):
                mult = number1.add(number2);
                System.out.println(mult);
                break;
            case("-"):
                mult = number1.subtract(number2);
                System.out.println(mult);
                break;
            case("/"):
                mult = number1.divide(number2);
                System.out.println(mult);
                break;
        }



    }
}