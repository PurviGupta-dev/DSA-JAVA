
import java.util.Arrays;

public class ArrayProgram7 {

    public static void moveZeros(int[] nums) {
        int j = 0;

        // Find the first zero
        while (j < nums.length && nums[j] != 0) {
            j++;
        }

        // Move non-zero elements forward
        for (int i = j + 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 4, 0, 5, 2};

        moveZeros(nums);

        System.out.println("Array after moving zeros: "
                + Arrays.toString(nums));
    }
}
