import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

        // Company Insurance
        char G, S;
        int age;
        Scanner sc = new Scanner(System.in);

        System.out.println("Driver's Marital Status(Y/N)  : ");
        S = sc.next().charAt(0);

        System.out.println("Driver's  Gender(M/F) :");
        G = sc.next().charAt(0);

        System.out.println("Driver's Age: ");
        age= sc.nextInt();

        if (S =='Y')
        {
            System.out.println ("Insured");
        }
        else if (S =='N' && age>30 && G =='M')
        {
            System.out.println ("Insured");
        }
        else if (S =='N' && age>25 && G =='F' )
        {
            System.out.println ("Insured");
        }
        else
        {
            System.out.println ("Not Insured");
        }
    }
}