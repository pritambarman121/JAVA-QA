import java.util.Scanner;

public class Q31COPYELEMENTOFARRAY {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of element : ");
        int n = input.nextInt();

        int arr1[] = new int[n];
        int arr2[] = new int[arr1.length];


        System.out.println("Enter "+ n + " integer values:");
        for(int i=0; i < n; i++) {
            arr1[i] = input.nextInt();// read input
        }
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        System.out.println("Elements of original array: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        System.out.println("Elements of new array: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}