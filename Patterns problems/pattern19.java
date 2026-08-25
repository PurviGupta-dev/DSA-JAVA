import java.util.Scanner;

public class pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Upper half
        for (int i = 0; i < n; i++) {

            // Stars on left
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            // Spaces in middle
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }

            // Stars on right
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = 0; i < n; i++) {

            // Stars on left
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces in middle
            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }

            // Stars on right
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}
