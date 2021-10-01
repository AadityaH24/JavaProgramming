package Lab6;

public class Spider extends Animal {
    public Spider(){
        super(8);
    }
    
    @Override
    public void eat() {
        System.out.println("Spider eats other insects   ");
    }
}
