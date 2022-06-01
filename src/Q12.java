import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {

        int low , high;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Lower interval : ");
        low = sc.nextInt();
        System.out.println("Enter Higher interval : ");
        high = sc.nextInt();

        while (low < high) {
            boolean flag = false;

            for(int i = 2; i <= low/2; ++i) {
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && low != 0 && low != 1)
                System.out.print(low + " ");
            ++low;
        }
    }
}

