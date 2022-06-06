import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {

        int base, exponent;
        long result = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base ");
        base = input.nextInt();
        System.out.println("Enter exponent ");
        exponent = input.nextInt();
        while (exponent != 0)
        {
            result *= base;
            --exponent;
        }
        System.out.println("answer is " + result);
    }
}
