import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        int n, a, b, c, s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 3 digit number :");
        n = sc.nextInt();
        a= n%10;
        b= n%100/10;
        c= n%1000/100;
        s = a+b+c ;
        System.out.println("Sum of the digits is :"+s);
    }
}
