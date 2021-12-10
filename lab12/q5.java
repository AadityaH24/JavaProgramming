import java.io.*;
import java.util.*;

public class q5 {

    public static void main(String[] args) {
        int total = 0;
        int itemnum,quantity;
        double price;
        System.out.println("ItemNo.\tQuantity\tPrice");
        try {
            Scanner sc = new Scanner(new File("q3.txt"));
            while (sc.hasNextLine()) {
                itemnum = sc.nextInt();
                quantity = sc.nextInt();
                price = sc.nextDouble();

                total += quantity * price;
                System.out.println(itemnum + "\t" + quantity + "\t" + price);
            }
        } catch (Exception e) {
            System.out.println("File Read");
            
        } finally{
            System.out.println("Total Price of Order: " + total);
        }
    }
}