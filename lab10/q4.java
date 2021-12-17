class DataRace extends Thread{
    @Override
    public void run() {
    
        System.out.println("Original Balance = 1000");
        BankAccount.deposit(1400);
        int a = BankAccount.getBalance();
        System.out.println( Thread.currentThread().getName() +" Added 1400 = "+ a);
    }
}
class BankAccount{
    static int balance = 1000;
    public static void deposit(int amount){
        balance += amount;
    }
    public static void withdraw(int amount){
        balance -= amount;
    }
    public static int getBalance() {
        return balance;
    }
}
public class q4 {
    public static void main(String[] args) {
        DataRace d1 = new DataRace();
        DataRace d2 = new DataRace();
        d1.start();
        d2.start();

    }
}
