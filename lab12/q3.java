import java.util.Scanner;
import java.io.*;
// Write a program for a mail-order company. The program uses a data-entry screen in which the user types an item number and a quantity. The valid item numbers and prices are as follows: 

// Item-Number Price 
// 101 100.50 
// 105 175.95 
// 108 220.45 
// 115 280.75
// 125 300.99 

// When the user enters an item number, check the number to make sure that it is valid. If it is valid, write the record that includes item number, quantity, price in a text file, otherwise your program should raise a user-defined exception. 



public class q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int itemNumber;
        int quantity;
        double price;
        String fileName = "q3.txt";

        try {
            FileWriter fw = new FileWriter(fileName, true);
            PrintWriter pw = new PrintWriter(fw);
            System.out.println("Enter item number: ");
            itemNumber = sc.nextInt();
            System.out.println("Enter quantity: ");
            quantity = sc.nextInt();
            sc.close();
            if (itemNumber == 101) {
                price = 100.5;
            } else if (itemNumber == 105) {
                price = 175.95;
            } else if (itemNumber == 108) {
                price = 220.45;
            } else if (itemNumber == 115) {
                price = 280.75;
            } else if (itemNumber == 125) {
                price = 300.99;
            } else {
                pw.close();
                fw.close();
                throw new ItemNumberError(itemNumber);
            }
            
            pw.write(itemNumber + " ");
            pw.write(quantity + " ");
            pw.write(price + "\n");

            pw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}

class ItemNumberError extends Exception {
    int i;
    public ItemNumberError(int itemNumber) {
        i = itemNumber;
    }
    @Override
    public String toString() {
        return "Invalid ItemNumber: " + i;
    }
}