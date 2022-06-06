import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {

        int n1 , n2 , n3 ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st value ");
        n1 = input.nextInt();
        System.out.println("Enter 2nd value ");
        n2 = input.nextInt();
        System.out.println("Enter 3rd value ");
        n3 = input.nextInt();

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");
        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");
        else
            System.out.println(n3 + " is the largest number.");
    }
}
