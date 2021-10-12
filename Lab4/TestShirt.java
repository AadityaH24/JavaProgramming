package Lab4;

import java.util.Scanner;

class Shirt {
    int collarSize;
    int sleeveLength;
    String material = "cotton";
    Shirt(int s1, int s2){
        collarSize = s1;
        sleeveLength = s2;
    }
    Shirt(int s1, int s2, String s3){
        collarSize = s1;
        sleeveLength = s2;
        material = s3;
    }
    void printShirt(){
        System.out.println("Collar: " + collarSize +" Sleeve: " + sleeveLength + " Material: " + material);
    }

}
public class TestShirt {
    public static void main(String[] args) {
        System.out.println("19BAI1098");
        Scanner scan = new Scanner(System.in);

        System.out.println("Input Data for default green shirt");
        int g1 = scan.nextInt();
        int g2 = scan.nextInt();
        Shirt greenShirt = new Shirt(g1,g2);
        System.out.println("Input Data for silk blue shirt");
        int s1 = scan.nextInt();
        int s2 = scan.nextInt();
        String s3 = scan.next();
        Shirt blueShirt = new Shirt(s1,s2,s3);
        System.out.println("Input Data for nylon red shirt");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        String n3 = scan.next();
        scan.close();
        Shirt redShirt = new Shirt(n1,n2,n3);

        System.out.println("Green Shirt");
        greenShirt.printShirt();

        System.out.println("Blue Shirt");
        blueShirt.printShirt();

        System.out.println("Red Shirt");
        redShirt.printShirt();

    }
}
