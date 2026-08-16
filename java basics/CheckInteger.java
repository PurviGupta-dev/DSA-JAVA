import java.util.Scanner;

public class CheckInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter something: ");
        String input = sc.nextLine();
        sc.close();
        try {
            Integer.parseInt(input);
            System.out.println("The input is an integer.");
        } catch (NumberFormatException e) {
            System.out.println("The input is not an integer.");
        }
    }
}
