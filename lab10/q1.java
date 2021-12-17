class hellothread extends Thread {
    public void run(){
        
        try {
            System.out.println("Hello World. "+ this.getId());
        }
        catch (Exception e) {
            System.out.println("Interrupted: " + e);
        }
        System.out.println("Exiting.");
        
    }
    
}

public class q1 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            new hellothread().start();
        }
    }

    
}