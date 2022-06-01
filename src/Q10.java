import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        //days to month
        int d, m, r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Days : ");
        d = sc.nextInt();
        m = d/30;
        r = d%30;

        System.out.println("in months : "+m+" month "+r+" days" );
    }
}
