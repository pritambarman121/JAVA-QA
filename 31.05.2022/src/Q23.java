import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        int N , M ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a num : ");
        N = input.nextInt();
        System.out.println("Enter 2nd num : ");
        M = input.nextInt();

        for (int i = 1; i <= M; i++) {
            System.out.println(N + " * " + i + " = " + N * i);
        }
    }
}