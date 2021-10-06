package Lab5;

import java.util.Scanner;

public class UseCourse {
    public static void main(String[] args) {
        System.out.println("19BAI1098");

        System.out.println("Enter Course To register.");
        Scanner input = new Scanner(System.in);
        String courseName = input.next();
        if (courseName.equals("BIO")||courseName.equals("CHEM")||courseName.equals("CHEM")||courseName.equals("PHY")) {
            System.out.println("Enter CourseCode and Credits");
            int code = input.nextInt();
            int cred = input.nextInt();
            LabCourse L1 = new LabCourse(courseName, code, cred);
            L1.display();
        } else {
            System.out.println("Enter CourseCode and Credits");
            int code = input.nextInt();
            int cred = input.nextInt();
            CollegeCourse C1 = new CollegeCourse(courseName, code, cred);
            C1.display();

        }
        input.close();
    }
}
