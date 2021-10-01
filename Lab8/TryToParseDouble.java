package lab8;

// The Double.parseDouble() method requires a String argument, but it fails if the String cannot be
// converted to a floating-point number. Write an application in which you try accepting a double input
// from a user and catch a NumberFormatException if one is thrown. The catch block forces the
// number to 0 and displays an appropriate error message. Following the catch block, display the
// number. Save the file as TryToParseDouble.java
import java.util.Scanner;

public class TryToParseDouble {
    public static void main(String[] args) {
        
        System.out.println("Enter a float");

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        double d = 0;
        try {
            d = Double.parseDouble(s);
            
        } catch (NumberFormatException e) {
            System.out.println("Error: Not a valid number\n"+e);
            d = 0.0;
        }
        System.out.println(d);

        
        
    }
}
