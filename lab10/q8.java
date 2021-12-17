
public class q8 {
    public static void main(String[] args) {
        divFinder.findDiv();
    }
}
class divFinder {
    public static void findDiv() {
        int max = 0;
        int maxDiv = 0;
        int div;
        for (int i = 1; i <= 10000; i++) {
            div = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    div++;
                }
            }
            if (div > max) {
                max = div;
                maxDiv = i;
            }
        }
        System.out.println(maxDiv);
        System.out.println(max);
    }
}


