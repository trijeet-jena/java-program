import java.util.ArrayList;
import java.util.List;

/** A generic stack with push, pop, peek, and isEmpty operations. */
class GenericStack<T> {
    private final List<T> items = new ArrayList<>();

    public void push(T item) {
        items.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot pop from an empty stack.");
        }
        return items.remove(items.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot peek at an empty stack.");
        }
        return items.get(items.size() - 1);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}

public class program8 {
    public static void main(String[] args) {
        GenericStack<Integer> stack = new GenericStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top item: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Next item: " + stack.peek());
    }
}


