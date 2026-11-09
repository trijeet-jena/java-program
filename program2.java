import java.util.Arrays;
import java.util.List;

abstract class Animal {
    private final String name;

    protected Animal(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Animal name is required.");
        }
        this.name = name.trim();
    }

    public String getName() {
        return name;
    }

    public abstract String makeSound();
}

class Dog extends Animal {
    Dog(String name) { super(name); }
    @Override public String makeSound() { return "Woof"; }
}

class Cat extends Animal {
    Cat(String name) { super(name); }
    @Override public String makeSound() { return "Meow"; }
}

/** Shows encapsulation, abstraction, inheritance, and polymorphism. */
public class program2 {
    public static void main(String[] args) {
        List<Animal> animals = Arrays.asList(new Dog("Rex"), new Cat("Mimi"));
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " says " + animal.makeSound());
        }
    }
}


