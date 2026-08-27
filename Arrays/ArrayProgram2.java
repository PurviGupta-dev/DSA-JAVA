import java.util.Scanner;

public class ArrayProgram2 {

    public static int secondLargest(int[] nums) {
        int largest = nums[0];
        int secondLargest = -1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            } 
            else if (nums[i] < largest && nums[i] > secondLargest) {
                secondLargest = nums[i];
            }
        }

        return secondLargest;
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

        int result = secondLargest(nums);

        System.out.println("Second largest element: " + result);

        sc.close();
    }
}
