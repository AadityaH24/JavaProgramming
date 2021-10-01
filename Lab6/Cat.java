package Lab6;

public class Cat extends Animal implements Pet {
    public String pName;
    public Cat(){
        this("");
    }
    public Cat(String name){
        super(4);
        pName = name;
    }
    @Override
    public void eat() {
        System.out.println("Cat eats milk and fish");
    }
    @Override
    public String getName() {
        return pName;
    }
    @Override
    public void setName(String name) {
        pName = name;
    }
    @Override
    public void play() {
        System.out.println("Cat plays with Yarn.");
    }
}
