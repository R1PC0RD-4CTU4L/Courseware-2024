import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        int i, j;
        for (i = 0; i < nums.length - 1; i++) {
            for (j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {

                    return new int[] { i, j };
                }

            }
        }

        return new int[] { -1, -1 };

    }

    public static void main(String[] args) {

        /*
         * int[] nums = { 2, 7, 11, 15 };
         * int target = 9;
         */
        /*
         * Here the elements 2 and 7 add up to the target 9. Hence we have to put the
         * indexes 0 and 1 in an array and return it.
         */

        int[] nums = { 1, 3, 2, 7, 11, 15 };
        int target = 26;

        /*
         * Here the elements 11 and 15 add up to the target 26. Hence we have to put the
         * indexes 4 and 5 in an array and return it.
         */

        int arr[] = twoSum(nums, target);
        System.out.println(Arrays.toString(arr));

    }

}