import Interfaces.Walkable;

public class Main {
    public static void main(String[] args) {
        Walkable walker = new Human();
        walker.walk();

        Human human1 = new Human();
        human1.giveBirth();
        human1.eat();

        Mammal mammal = new Human();
        mammal.move();
    }
}