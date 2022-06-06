import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {

        // positive number
        int i, number, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a num : ");
        number = input.nextInt();

        for(i = 1 ; i < number ; i++) {
            if(number % i == 0)  {
                sum = sum + i;
            }
        }
        if (sum == number) {
            System.out.format( number + " is a Perfect Number");
        }
        else {
            System.out.format(number +" is NOT a Perfect Number" );
        }
    }
}