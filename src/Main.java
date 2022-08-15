import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /*
    public static void multi() {
        String[] one, two, nn;
        int ba = 0, len1, len2;
        int firstNumber, secondNumber;
        int f = 0, s = 0, r = 0;
//        String[] result ;
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        System.out.println("Enter your First Big number : ");
        String number1 = input.nextLine();
        System.out.println("Enter your secound Big number : ");
        String number2 = input.nextLine();
        one = number1.split("");
        two = number2.split("");
        for (String s1 : one) {
            int x = Integer.parseInt(s1);
            list1.add(x);
        }
        for (String s2 : two) {
            int x = Integer.parseInt(s2);
            list2.add(x);
        }
        len1 = list1.size();
        len2 = list2.size();
        for (int i = len1; i >= 0; i--) {
            f = list1.get(i - 1);
            s = list2.get(i - 1);
            f *= s;
            f += ba;
            String n = "";
            n = String.valueOf(f);
            nn = n.split("");
            if (nn.length > 1) {
//                result.add(Integer.parseInt(nn[1]));
                String rr ="";
                rr = nn[1];
                System.out.print(rr);
                ba = Integer.parseInt(nn[0]);
            }else{
//                result.add(Integer.parseInt(nn[0]));
                String rr = "";
                rr = nn[0];
                System.out.print(rr);
                ba = 0;
            }
            System.out.println(result);
        }
    }
    */





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
//        multi();

    }
}