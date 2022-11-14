import Interfaces.Walkable;

public class Human extends Mammal implements Walkable {
    public void move() {
        walk();
    }

    public void walk() {
        System.out.println("I am walking");
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public void giveBirth() {
        System.out.println("I am giving birth");
    }
}
