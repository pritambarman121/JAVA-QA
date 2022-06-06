public class Q9 {
    public static void main(String args[]) {
        //accept arg through Command line

        int price, quantity, final_price, s;
        double dis = 0;
        price = Integer.parseInt(args[0]);
        quantity = Integer.parseInt(args[1]);
        System.out.println("Price per item : " + price);
        System.out.println("Quantity : " + quantity);
        s = (price*quantity) ;
        while(quantity>=10){
            dis = s * 0.1;
            quantity++;
        }
        final_price = (int) (s - dis);
        System.out.println("amount after discount=" + final_price);
    }
}