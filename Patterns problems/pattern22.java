import java.util.Scanner;

public class pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                // Distance from each of the four borders
                int top = i;
                int left = j;
                int bottom = size - 1 - i;
                int right = size - 1 - j;

                int minDistance = Math.min(
                    Math.min(top, bottom),
                    Math.min(left, right)
                );

                int value = n - minDistance;

                System.out.print(value + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
