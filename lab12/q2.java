// Write a program to accept specified number of characters as input, convert them into uppercase characters and save the data in a text file


import java.io.*;
import java.util.Scanner;

public class q2 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of characters to be converted to uppercase");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the characters");
        String s = sc.nextLine();
        char[] ch = new char[n];
        sc.close();
        
        for (int i = 0; i < n; i++) {
            ch[i] = Character.toUpperCase(s.charAt(i));
        }
        FileWriter fw = new FileWriter("q2.txt");
        for (int i = 0; i < n; i++) {
            fw.write(ch[i]);
        }
        fw.close();
    }
}
