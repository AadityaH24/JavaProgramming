
class MyThreadsync extends Thread{
    intObjsync ot;
    MyThreadsync(intObjsync o){
        this.ot = o;
    }
    public void run() {
        try {
            for (int j = 0; j < 1000000; j++) {
                // incObj();
                ot.plusOne();
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(ot.num);
    }
    // synchronized public void incObj(){
    //     ot.plusOne();
    // }
    
}

class intObjsync{
    int num;
    intObjsync(){
        num = 0;
    }
    public synchronized void plusOne(){
        num++;
    }
}
public class q2sync {
    public static void main(String[] args) {
        intObjsync o = new intObjsync();
        MyThreadsync t1 = new MyThreadsync(o);
        MyThreadsync t2 = new MyThreadsync(o);
        t1.start();
        t2.start();

    }
}
