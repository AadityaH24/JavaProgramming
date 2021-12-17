
class MyThread extends Thread{
    intObj ot;
    MyThread(intObj o){
        this.ot = o;
    }
    public void run() {
        try {
            for (int j = 0; j < 1000000; j++) {
                ot.plusOne();
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(ot.num);
    }
    
}

class intObj{
    int num;
    intObj(){
        num = 0;
    }
    public void plusOne(){
        num++;
    }
}
public class q2unsync {
    public static void main(String[] args) {
        intObj o = new intObj();
        MyThread t1 = new MyThread(o);
        MyThread t2 = new MyThread(o);
        t1.start();
        t2.start();

    }
}
