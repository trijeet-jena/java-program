/** Demonstrates method overloading with different parameter lists. */
public class MethodOverloadingDemo {
    static int add(int left, int right) {
        return left + right;
    }

    static double add(double left, double right) {
        return left + right;
    }

    static int add(int first, int second, int third) {
        return first + second + third;
    }

    public static void main(String[] args) {
        System.out.println("Two integers: " + add(4, 6));
        System.out.println("Two decimals: " + add(2.5, 3.75));
        System.out.println("Three integers: " + add(1, 2, 3));
    }
}
