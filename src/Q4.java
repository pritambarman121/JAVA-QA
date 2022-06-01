import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        // Sum of first and last digit of 4 digit num
        int n, s, fd, ld;
        System.out.println("Enter a 4 digit number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n>999 && n<10000){
            fd = n%10000/1000;
            ld = n%10;
            s = fd+ld;
            System.out.println("Sum of max and min digit of the typed number is : " +s);
        }
        else {
            System.out.println("The typed num is not a 4 digit num");
        }
    }
}
