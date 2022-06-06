import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        int num, f = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num : ");
        num = sc.nextInt();
        for (int i = 1 ; i <= num; ++i){
            f *= i;
        }
        System.out.println("Factorial ot the num is : " +f);
    }
}
