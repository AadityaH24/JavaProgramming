package Lab4;

class TaxPayer{
    private int ssn;
    private double income;
    TaxPayer(int a, double b){
        ssn = a;
        income = b;
    }
    public int getSsn(){
        return ssn;
    }
    public double getIncome(){
        return income;
    }
    public void printData(){
        System.out.println("SSN: " + ssn + " \nIncome: " + income); 
    }
}
public class UseTaxPayer {
    public static void main(String[] args) {
        System.out.println("19BAI1098");

        //declare array of objects
        TaxPayer[] taxArr = new TaxPayer[10];
        for (int i = 0; i < taxArr.length; i++) {
            taxArr[i] = new TaxPayer(100000+1+i,Math.random()*100000);
        }
        System.out.println("Displaying The Taxpayer Details");

        for (int i = 0; i < taxArr.length; i++) {
            System.out.println("Taxpayer " + (i+1));
            System.out.println("SSN: " + taxArr[i].getSsn() + " \nIncome: " + taxArr[i].getIncome());

        }

    }
}
