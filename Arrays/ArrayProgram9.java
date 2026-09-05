
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayProgram9 {

    public static ArrayList<Integer> findUnion(int[] nums1, int[] nums2) {

        ArrayList<Integer> union = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] < nums2[j]) {

                if (union.isEmpty() || union.get(union.size() - 1) != nums1[i]) {
                    union.add(nums1[i]);
                }

                i++;

            } else if (nums1[i] > nums2[j]) {

                if (union.isEmpty() || union.get(union.size() - 1) != nums2[j]) {
                    union.add(nums2[j]);
                }

                j++;

            } else {

                if (union.isEmpty() || union.get(union.size() - 1) != nums1[i]) {
                    union.add(nums1[i]);
                }

                i++;
                j++;
            }
        }

        // Add remaining elements of nums1
        while (i < nums1.length) {

            if (union.isEmpty() || union.get(union.size() - 1) != nums1[i]) {
                union.add(nums1[i]);
            }

            i++;
        }

        // Add remaining elements of nums2
        while (j < nums2.length) {

            if (union.isEmpty() || union.get(union.size() - 1) != nums2[j]) {
                union.add(nums2[j]);
            }

            j++;
        }

        return union;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();

        int[] nums1 = new int[n];

        System.out.println("Enter elements of first sorted array:");
        for (int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();

        int[] nums2 = new int[m];

        System.out.println("Enter elements of second sorted array:");
        for (int i = 0; i < m; i++) {
            nums2[i] = sc.nextInt();
        }

        ArrayList<Integer> union = findUnion(nums1, nums2);

        System.out.println("Union: " + union);

        sc.close();
    }
}


