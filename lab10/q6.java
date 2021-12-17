class FibThread extends Thread {
    int n;
    FibThread(int n) {
        this.n = n;
    }
    public void run(){
        
        FibboPrime.printFibbonaci(n);
        
    }
    
}
class PrimeThread extends Thread {
    int n;
    PrimeThread(int n) {
        this.n = n;
    }
    public void run(){
        
        FibboPrime.printPrime(n);
        
    }
    
}

class FibboPrime{
    synchronized public static void printPrime(int n){
        int i,j;
        for(i=2;i<=n;i++){
            for(j=2;j<i;j++){
                if(i%j==0){
                    break;
                }
            }
            if(j==i){
                System.out.println(i);
            }
        }
    }
    synchronized public static void printFibbonaci(int n){
        int i,j,k;
        for(i=0;i<=n;i++){
            j=0;
            k=1;
            while(j<i){
                System.out.print(j+" ");
                j=j+k;
                k=j-k;
            }
            System.out.println();
        }
    }

}
public class q6 {
    public static void main(String[] args) {
        int n = 20;
        FibThread f1 = new FibThread(n);
        PrimeThread p1 = new PrimeThread(n);
        f1.start();
        p1.start();
    }

    
}