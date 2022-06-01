import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        //Salary

        double TA, DA, HRA, PF, BS, GS, BO, BO1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Basic Salary : ");
        BS = sc.nextInt();
        TA = (10*BS)/ 100;
        System.out.println("TA is : "+TA);
        DA = (15*BS) / 100;
        System.out.println("DA is : "+DA);
        HRA = (20*BS) / 100;
        System.out.println("HRA is : "+HRA);
        PF = (12*BS) / 100;
        System.out.println("PF is : "+PF);
        BO = (BS*10)/100;
        BO1 = (BS*20)/100;


        if (BS >= 20000){
            GS = (BS+DA+TA+HRA+BO-PF);
            System.out.println("The gross salary is : " +GS);
        }
        else {
            GS = (BS+DA+TA+HRA+BO1-PF);
            System.out.println("The gross salary is : " +GS);
        }

    }
}
