/** Demonstrates creating and joining threads by extending Thread. */
class MessageThread extends Thread {
    private final String message;

    MessageThread(String name, String message) {
        super(name);
        this.message = message;
    }

    @Override
    public void run() {
        for (int count = 1; count <= 5; count++) {
            System.out.println(getName() + ": " + message + " " + count);
        }
    }
}

public class program6 {
    public static void main(String[] args) throws InterruptedException {
        Thread first = new MessageThread("Thread-A", "Hello");
        Thread second = new MessageThread("Thread-B", "Welcome");
        first.start();
        second.start();
        first.join();
        second.join();
        System.out.println("Both threads have completed.");
    }
}


