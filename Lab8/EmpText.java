package lab8;
// Define Employee class with Employee code, name, date of birth and date of appointment. The
// Employee code must have the format of year-designation-number. The year is a two digit integer
// such as 87. the designation is a single letter code M for manager, A for Administrative staff, H for
// HR dept staff, E for Executive staff, and T for Technical staff. The number is a three digit number.
// The following are some sample employee codes.
// 82-M-183
// 76-A-242
// 71-H-107
// Write a Java program to read the employee code, name, date of birth, and date of appointment and
// validate the employee code. If the employee code is incorrect a suitable user defined exception must
// be thrown. Then verify if date of birth is before date of appointment. If it is not so, then throw
// another user defined Exception. If it is correct, then create the Employee object, display the count of
// employee and display the details of employees.

import java.util.Arrays;
import java.util.Scanner;

class Employee{
    public static int count = 0;

    int dob,doa;
    String desig;
    int num;
    String code;
    Employee(int dob, int doa, String desig, int num, String code){
        this.dob = dob;
        this.doa = doa;
        this.desig = desig;
        this.num = num;
        this.code = code;
        count++;
    }
    public String printEmp() {
        return "Date of birth " + dob+", Date of appointment: " +doa+", Designation: " + desig+", EmpNumber: " +num+", EmployeeCode: "+code;
    }
}

class EmpException extends Exception{
    String s1;
    EmpException(String s){
        this.s1 = s;
    }

    @Override
    public String toString() {
        return "Error: " + s1;
    }
}

public class EmpText {
    static String[] desigVals = {"A","M","T","E","H"};
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of employees");
        int n = scan.nextInt();
        int dob,doa,num;
        
        String des;
        String eCode;
        String temp;
        Employee[] empList = new Employee[n];
        
        
        System.out.println("For each emp enter date of birth, date of appointment, designation, EmpNumber, EmployeeCode ");
        int j=0;
        for (int i = 0; i < n; i++) {
            dob = scan.nextInt();
            doa = scan.nextInt();
            des = scan.next();
            num = scan.nextInt();
            eCode = scan.next();
            temp = ""+(doa%100)+"-" + des + "-"+num;
            try {
                if(!eCode.equals(temp) || !arrayContains(desigVals, des)){
                    throw new EmpException("Invalid Employee Code");
                }
                else{
                    if (doa>dob) {
                        
                        empList[j] = new Employee(dob, doa, des, num, eCode);
                        j++;
                    }
                    else{
                        throw new EmpException("Birth Year invalid");
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
                
            }
        }
        scan.close();
        System.out.println("Total Number of employees generated: " + Employee.count);
        for (int i = 0; i < j; i++) {
            System.out.println(empList[i].printEmp());
            
        }
    
    }
    public static <T> boolean arrayContains(T[] array, T value) {
        return Arrays.stream(array).anyMatch(value::equals);
    }
}
