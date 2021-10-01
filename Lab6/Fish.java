package Lab6;

public class Fish extends Animal implements Pet {  

    public String fName;
    public Fish(){
        super(0);
    }
    @Override
    public void walk() {
        System.out.println("Fish cannot walk.");
    }
    @Override
    public String getName() {
        return fName;
    }
    @Override
    public void setName(String name) {
        fName = name;
    }
    @Override
    public void play() {
        System.out.println("Fish plays with aqautic reefs");
    }

    @Override
    public void eat() {
        System.out.println("Fish eats algae.");
    }    
}
