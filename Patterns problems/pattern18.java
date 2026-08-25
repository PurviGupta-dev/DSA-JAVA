import java.util.Scanner;

public class pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            char start = (char) ('A' + n - i - 1);

            for (int j = 0; j <= i; j++) {
                System.out.print((char) (start + j) + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
