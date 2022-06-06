import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        //Triangle
        int a, b, c, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first angle value : ");
        a = sc.nextInt();
        System.out.println("Enter second angle value : ");
        b =sc.nextInt();
        System.out.println("Enter third angle value : ");
        c = sc.nextInt();
        sum = a+b+c;

        if (sum == 180){
            System.out.println("It's a triangle");
        }
        else {
            System.out.println("It's not a triangle");
        }
    }

}

