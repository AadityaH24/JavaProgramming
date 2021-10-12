package Lab4;

import java.util.Scanner;

public class Julian {
    public static void main(String[] args) {
        System.out.println("19BAI1098");
        System.out.println("Enter Julian Day");
        Scanner scan = new Scanner(System.in);
        int jul = scan.nextInt();
        scan.close();
        int day = (jul+1)%7;
        System.out.println("Julian Day " + jul + " is ");
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Moday");  
                break;
            case 2:
                System.out.println("Tuesday"); 
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday"); 
                break;
            case 5:
                System.out.println("Friday"); 
                break;
            case 6:
                System.out.println("Saturday"); 
                break;        
            default:
                System.out.println("Error");
                break;
        }

        
    }
}
