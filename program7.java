/** Two interfaces provide behavior that a class can combine. */
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("The duck flies.");
    }

    @Override
    public void swim() {
        System.out.println("The duck swims.");
    }
}

public class program7 {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
        duck.swim();
    }
}


