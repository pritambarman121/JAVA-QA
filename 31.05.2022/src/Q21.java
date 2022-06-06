import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {

        int low , high, n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter lower interval value : ");
        low = input.nextInt();
        System.out.println("Enter higher interval value : ");
        high = input.nextInt();

        for(n = low + 1; n < high; ++n) {
            int digits = 0;
            int result = 0;
            int Number = n;

            while (Number != 0) {
                Number = Number/10;
                ++digits;
            }
            Number = n ;
            while (Number != 0) {
                int rem = Number % 10;
                result += (rem*rem*rem);
                Number /= 10;
            }

            if (result == n) {
                System.out.print(n + " ");
            }
        }
    }
}
