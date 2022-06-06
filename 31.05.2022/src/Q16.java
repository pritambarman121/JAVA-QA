import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,n, temp, total = 0;
        System.out.println("Enter a num : ");
        num = sc.nextInt();
        n = num;
        while (n!=0)
        {
            temp = n%10;
            total +=temp*temp*temp;
            n /= 10;
        }
        if (total == num) {
            System.out.println(num + " is an armstrong num");
        } else {
            System.out.println(num + " is not an armstrong num");
        }

    }
}
