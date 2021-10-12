package Lab4;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        System.out.println("19BAI1098");
        System.out.println("Enter the Book Price, Quantity and Applied Discount");
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        int b = scan.nextInt();
        double c = scan.nextDouble();
        scan.close();

        // test single para
        System.out.println("Book Cost");
        System.out.println(Billing.computeBill(a));
        // 2 parameters
        System.out.println("Total cost of "+b+" books");
        System.out.println(Billing.computeBill(a,b));
        // 3 parameters
        System.out.println("Total Cost after Discount");
        System.out.println(Billing.computeBill(a,b,c));
    }
}
