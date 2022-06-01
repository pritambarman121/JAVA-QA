import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        int a, b, c, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st num : ");
        a = sc.nextInt();
        System.out.println("Enter 2nd num : ");
        b = sc.nextInt();
        System.out.println("Enter 3rd num : ");
        c = sc.nextInt();

        m = (a>b) ? (a>c ? a:c):(b>c ? b:c);
        System.out.println("Max among 3 is : "+m);


    }
}
