import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BigInteger mult;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your First Big number : ");
        BigInteger number1 = input.nextBigInteger();
        System.out.println("Enter your secound Big number : ");
        BigInteger number2 = input.nextBigInteger();
        mult = number1.multiply(number2);
        System.out.println(mult);
    }
}