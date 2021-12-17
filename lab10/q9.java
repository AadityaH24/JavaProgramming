
public class q9 {
    public static void main(String[] args) {
        int upperVal = 100000;
        int n = upperVal/3;
        divThread d1 = new divThread(1, n);
        divThread d2 = new divThread(n,2*n);
        divThread d3 = new divThread(2*n, 3*n + 1);
        System.out.println("Starting threads");

        d1.start();
        d2.start();
        d3.start();
        System.out.println("Threads started");
        try {
            d1.join();
            d2.join();
            d3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Threads joined");
        divFinderMulti.outDiv();
    }
}
class divThread extends Thread {
    int st;
    int end;
    divThread(int st, int end) {
        this.st = st;
        this.end = end;
    }
    @Override
    public void run() {
        divFinderMulti.calcDiv(st, end);
    }
}
class divFinderMulti {
    static int max = 0;
    static int maxDiv = 0;
    static int div = 0;

    public static void calcDiv(int start, int end) {
        for (int i = start; i <= end; i++) {
            div = 0;
            for (int j = start; j <= i; j++) {
                if (i % j == 0) {
                    div++;
                }
            }
            if (div > max) {
                System.out.println("New max div: " + div + " for " + i + "max: " + max);
                max = div;
                maxDiv = i;
            }
        }
    }
    public static void outDiv(){
        System.out.println(maxDiv);
        System.out.println(max);
    }
}


