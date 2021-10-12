package Lab4;

import java.util.Arrays;

public class TestPatient {
    public static void main(String[] args) {
        System.out.println("19BAI1098");
        System.out.println("Default patient Details:");
        Patient P0 = new Patient();
        System.out.println(P0.getID());
        System.out.println(P0.getAge());
        System.out.println(Arrays.toString(P0.getBloodData()));
        System.out.println("Patient Id 119:");
        int[] n1 = {0,0};
        Patient P1 = new Patient(119, 26, n1);
        System.out.println(P1.getID());
        System.out.println(P1.getAge());
        System.out.println(Arrays.toString(P1.getBloodData()));


    }
}
