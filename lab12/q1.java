import java.io.File;

public class q1 {

    public static void main(String[] args) {
        System.out.println("19BAi1098");
        try {
            File f1 = new File( "C:\\java", "abc.txt") ;
            f1.createNewFile();
            if (f1.exists()) {
                System.out.println("File exists");
                System.out.println("File Path:" + f1.getAbsolutePath());
            } else {
                System.out.println("File does not exist");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}