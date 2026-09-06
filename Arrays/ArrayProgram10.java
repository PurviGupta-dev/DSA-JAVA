
import java.util.Scanner;

public class ArrayProgram10 {

    public static int findMissingNumber(int[] nums) {

        int n = nums.length;
        int xor = 0;

        // XOR all numbers from 0 to n
        for (int i = 0; i <= n; i++) {
            xor = xor ^ i;
        }

        // XOR all elements of the array
        for (int num : nums) {
            xor = xor ^ num;
        }

        return xor;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int missing = findMissingNumber(nums);

        System.out.println("Missing number: " + missing);

        sc.close();
    }
}

