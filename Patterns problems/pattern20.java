import java.util.Scanner;

public class pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Upper half including middle
        for (int i = 0; i < n; i++) {

            // Left stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            // Middle spaces
            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 2; i >= 0; i--) {

            // Left stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            // Middle spaces
            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}
