import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        // prime or not prime

        int n , i;
        boolean tag = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Eenter any num : ");

        n = sc.nextInt();
        for (i = 2; i <= n/2; ++i){
            if(n%i == 0){
                tag = true ;
                break;
            }
        }
        if (!tag){
            System.out.println("The num is a prime num");
        }
        else{
            System.out.println("The num is not a prime num");
        }
    }
}
