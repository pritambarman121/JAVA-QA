import java.util.Scanner;

public class Q30ARRAY {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of element : ");
        n = scan.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter "+ arr.length + " integer values:");
        for(int i=0; i < arr.length; i++) {
            arr[i] = scan.nextInt();// read input
        }
        /*
        System.out.println("Array elements are:");
        for (int i=0; i < arr.length; i++) {
            System.out.println(arr[i]+"\t");
        }*/

        System.out.println("Array elements as reverse :");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " "+"\t");
        }

    }
}