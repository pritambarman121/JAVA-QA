import java.util.Scanner;

public class Q2
{
    public static void main(String[] args) {

        //Calculate interest and total amount paid to bamk

        int principle; int year; double rate = 7.5 ; double interest; double total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principle Amount : ");
        principle = sc.nextInt();
        System.out.println("Enter time in year : ");
        year = sc.nextInt();
        rate = 7.5 ;

        interest = (principle*year*rate)/100 ;
        total = principle+interest ;

        System.out.println("The simple interest paid to the bank : " +interest);
        System.out.println("Final amount paid to the bank is : " +total);




    }
}
