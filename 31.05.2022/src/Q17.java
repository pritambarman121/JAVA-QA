import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {

        String st , reverseStr = "";
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter");
        st = String.valueOf(sc.nextInt());

        int strLength = st.length();

        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + st.charAt(i);
        }

        if (st.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(st + " is a Palindrome ");
        }
        else {
            System.out.println(st + " is not a Palindrome");
        }
    }
}