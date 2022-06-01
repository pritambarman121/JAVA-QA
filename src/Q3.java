import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        // Take a 3 digit num as input and rev it
        int n , a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 3 digit number : ");
        n = sc.nextInt();
        if ( n>99 && n<1000) {
            a = n%10;
            b = n%100/10;
            c = n%1000/100;
            System.out.println("The rev number is : " +a+b+c);
        }
        else{
            System.out.println("The typed num is not a 3 digit num .");
        }
    }
}