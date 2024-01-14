import java.util.Arrays;

public class LargestAndSmallestElementInArray {

    public static int[] findLargestAndSmallest(int[] arr) {

        int maxElement = Integer.MIN_VALUE;
        int minElement = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < minElement) {
                minElement = arr[i];
            }
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }

        return new int[] { minElement, maxElement };

    }

    public static void main(String[] args) {

        int arr[] = { 1, 5, 7, 6, 13, 24, -6, 45, 96, 100, 250, 164, 352, 784, 602, 13, 12, -9 };

        int result[] = findLargestAndSmallest(arr);

        System.out.println(Arrays.toString(result));

    }

}
