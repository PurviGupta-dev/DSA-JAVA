public class RecursiveSum {

    static int sum(int n) {
        if (n == 0) {
            return 0; // Base case
        }

        return n + sum(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        int number = 5;

        System.out.println("Sum of numbers from 1 to " + number + " = " + sum(number));
    }
}