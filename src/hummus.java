import java.util.Scanner;

public class hummus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int min = Integer.MAX_VALUE, max = 0, price;
        price = s.nextInt();
        while (price > 0) {
            System.out.println("enter the hummus prices of different restaurants: ");
            price = s.nextInt();
            if (price > max) {
                max = price;
            }
            if (price > 0 && price < min) {
                min = price;
            }
        }
        System.out.println("the most expensive hummus is " + max );
        System.out.println(" the cheapest hummus is " + min );

    }
}

