package Lab6;

public class TestAnimals {
    public static void main(String[] args) {
        System.out.println("19BAI1098");

        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();
        System.out.println("");
        // Fish d = new Fish();
        d.eat();
        d.setName("Nemo");
        d.walk();
        d.getName();
        System.out.println("Name of Fish is " + d.getName());
        System.out.println("");
        // Cat c = new Cat("Fluffy");
        c.eat();
        c.walk();
        System.out.println("Name of Cat is " + c.getName());
        System.out.println("");
        // Animal a = new Fish();
        a.walk();
        a.eat();
        System.out.println("");
        // Animal e = new Spider();
        e.eat();
        e.walk();
        System.out.println("");
        // Pet p = new Cat();
        ((Cat)p).setName("Kitkat");
        System.out.println("Name of Pet Cat is " + p.getName());
        ((Cat)p).walk();
    }
    
}
