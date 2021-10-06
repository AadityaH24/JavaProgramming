package Lab5;

import java.util.Scanner;

public class DemoTee {
    public static void main(String[] args) {
        System.out.println("19BAI1098");
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter ordernum, size and color for T-shirt");
        int order = scan.nextInt();
        String size = scan.next();
        String color = scan.next();
        TeeShirt t1 = new TeeShirt();
        t1.setOrderNum(order);
        t1.setColor(color);
        t1.setSize(size);
        System.out.println("Entered Details\nOrder: " + t1.getOrderNum()+ " Size: " + t1.getSize() + " Color: " + t1.getColor() +"\nPrice: "+ t1.getPrice() +"\n");

        System.out.println("Enter size and color for T-shirt");
        order++;
        size = scan.next();
        color = scan.next();
        TeeShirt t3 = new TeeShirt();
        t3.setOrderNum(order);
        t3.setColor(color);
        t3.setSize(size);
        System.out.println("Entered Details\nOrder: " + t3.getOrderNum()+ " Size: " + t3.getSize() + " Color: " + t3.getColor() +"\nPrice: "+ t3.getPrice() +"\n");
        
        System.out.println("Enter size, color and slogan for Custom T-Shirt");
        order++;
        size = scan.next();
        color = scan.next();
        scan.nextLine();
        String message = scan.nextLine();
        CustomTee t2 = new CustomTee();
        t2.setOrderNum(order);
        t2.setSize(size);
        t2.setColor(color);
        t2.setSlogan(message);
        System.out.println("Entered Details\nOrder: " + t2.getOrderNum()+ " Size: " + t2.getSize() + " Color: " + t2.getColor() +" Slogan: " + t2.getSlogan()+"\nPrice: "+ t2.getPrice());

        System.out.println("Enter size, color and slogan for Custom T-Shirt");
        order++;
        size = scan.next();
        color = scan.next();
        scan.nextLine();
        message = scan.nextLine();
        CustomTee t4 = new CustomTee();
        t4.setOrderNum(order);
        t4.setSize(size);
        t4.setColor(color);
        t4.setSlogan(message);
        System.out.println("Entered Details\nOrder: " + t4.getOrderNum()+ " Size: " + t4.getSize() + " Color: " + t4.getColor() +" Slogan: " + t4.getSlogan()+"\nPrice: "+ t4.getPrice());

        scan.close();
    }
    
}
