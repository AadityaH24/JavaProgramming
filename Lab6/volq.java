package Lab6;

import java.util.Scanner;

interface volume {

    final double pi = 3.141;
    public double innerVolume(double s1, double s2, double s3);
    public double outerVolume(double s1, double s2, double s3);
}


class part implements volume {
    double s1,s2,s3;
    part(double s1, double s2, double s3){
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;

    }
    @Override
    public double innerVolume(double s1, double s2, double s3) {
        double o = (double) (pi*s1*s2*s3)/3;
        return o;
        
    }
    @Override
    public double outerVolume(double s1, double s2, double s3) {
        double o =  (double)(pi*s1*s2*s3)*4/3;
        return o;
        
    }
    public void show() {
        System.out.println(("Pi is: " + pi));
        System.out.println("Inner volume of part is: " + innerVolume(s1, s2, s3));
        System.out.println("Outer volume of part is: " + outerVolume(s1, s2, s3));

    }
    
}

public class volq {
    public static void main(String[] args) {
        System.out.println("19BAI1098");
        System.out.println("Enter 3 dimension for part: ");           
        Scanner input = new Scanner(System.in);

        double l = input.nextDouble();
        double b = input.nextDouble();
        double h = input.nextDouble();
        input.close();

        part p1 = new part(l, h, b);
        p1.show();

    }
    
}