import java.util.*;

public class problem3 {

    static int getMinDiff(int[] arr, int k) {

        int n = arr.length;

        Arrays.sort(arr);

        int ans = arr[n - 1] - arr[0];

        int small = arr[0] + k;
        int large = arr[n - 1] - k;

        if (small > large) {
            int temp = small;
            small = large;
            large = temp;
        }

        for (int i = 1; i < n - 1; i++) {

            int subtract = arr[i] - k;
            int add = arr[i] + k;

            if (subtract < 0)
                continue;

            int minimum = Math.min(small, subtract);
            int maximum = Math.max(large, add);

            ans = Math.min(ans, maximum - minimum);
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {1, 5, 8, 10};
        int k = 2;

        System.out.println(getMinDiff(arr, k));
    }
}