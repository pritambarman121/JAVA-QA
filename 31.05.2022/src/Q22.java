import java.sql.SQLOutput;
import java.util.Scanner;

public class Q22 {
    public static void main (String[] args)
    {
        int N;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a num : ");
        N = input.nextInt();
        Table(N, 1);
    }
    static void Table(int N, int i)
    {
    if (i > 10)
        return ;
    System.out.println(N + " * " + i + " = " + N * i);
    Table(N, i + 1);
    }


}