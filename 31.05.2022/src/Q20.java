import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year : ");
        year = input.nextInt();

        if(year%400 == 0){
            System.out.println("It's a leap year");
        }
        else if (year%4 == 0 && year%100 != 0) {
            System.out.println("It's a leap year");
        }
        else {
            System.out.println("It's not a leap year");
        }
    }
}
