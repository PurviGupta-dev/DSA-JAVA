import java.util.Scanner;

public class DataTypeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter something: ");
        String input = sc.nextLine();

        sc.close();
        try {
            Integer.parseInt(input);
            System.out.println("Data type: Integer");
            return;
        } catch (NumberFormatException e) {
            // Not an integer
        }

        try {
            Double.parseDouble(input);
            System.out.println("Data type: Double");
            return;
        } catch (NumberFormatException e) {
            // Not a double
        }

        if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
            System.out.println("Data type: Boolean");
        } else {
            System.out.println("Data type: String");
        }
    }
}
