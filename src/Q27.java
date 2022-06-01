import java.util.Scanner;

class Factor {
    Factor(int num){
        for ( int i = 1 ; i <= num; i++){
            if (num%i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int num = sc.nextInt();
        Factor a = new Factor(num);
    }
}
