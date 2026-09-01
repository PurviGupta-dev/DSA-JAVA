import java.util.Arrays;
import java.util.Scanner;

public class ArrayProgram6 {

    // Function to reverse a part of the array
    static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    // Function to rotate array left by k places
    static void rotateLeft(int[] nums, int k) {
        int n = nums.length;

        // If array is empty
        if (n == 0) {
            return;
        }

        // k can be greater than n
        k = k % n;

        // Reverse first k elements
        reverse(nums, 0, k - 1);

        // Reverse remaining elements
        reverse(nums, k, n - 1);

        // Reverse the entire array
        reverse(nums, 0, n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input k
        System.out.print("Enter k: ");
        int k = sc.nextInt();

        // Rotate array
        rotateLeft(nums, k);

        // Print result
        System.out.println("Array after left rotation by " + k + " places:");
        System.out.println(Arrays.toString(nums));

        sc.close();
    }
}