import java.util.Scanner;
///Write an application that throws and catches an ArithmeticException when you attempt to take the
// square root of a negative value. Prompt the user for an input value and try the Math.sqrt() method
// on it. The application either displays the square root or catches the thrown Exception and displays
// an appropriate message. Save the file as SqrtException.java.

public class SqrtException {
    
    public static void main(String[] args) {
        System.out.println("Enter a number");

        
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        scan.close();
        try {
            if(x >= 0 ){
                System.out.println("Square root of "+x+" = " + Math.sqrt(x));

            }
            else{
                throw new ArithmeticException();
            }
            
        } catch (Exception e) {
            System.out.println("Error: Number is negative\n" + e);

        }
        scan.close();
    }
}
