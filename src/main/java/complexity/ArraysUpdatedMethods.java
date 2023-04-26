package homework_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysUpdatedMethods {
       public List<List<Integer>> findTriplets(int[] arr) {
        int n = arr.length;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            // Skip duplicates
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int l = i + 1;
            int r = n - 1;

            while (l < r) {
                int sum = arr[i] + arr[l] + arr[r];

                result.add(Arrays.asList(arr[i], arr[l], arr[r]));
                l++;
                r--;

                while (l < r && arr[l] == arr[l - 1]) {
                    l++;
                }
                while (l < r && arr[r] == arr[r + 1]) {
                    r--;
                }
                if (sum < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return result;
    }

    public int[] replace(int[] n) {
        int[] m = new int[n.length];
        for (int i = 0, k = n.length - 1; i <= k; i++, k--) {
            m[i] = n[i];
            m[k] = n[k];
        }
        return m;
    }

    public void decreasingOrder(int[] arr) {
        int n = arr.length;
        if (n < 2) return;
        int mid = n / 2;
        int[] S1 = Arrays.copyOfRange(arr, 0, mid);
        int[] S2 = Arrays.copyOfRange(arr, mid, n);
        decreasingOrder(S1);
        decreasingOrder(S2);
        merge(S1, S2, arr);
    }

    public void merge(int[] S1, int[] S2, int[] arr) {
        int i = 0, j = 0;
        while (i + j < arr.length) {
            if (j == S2.length || (i < S1.length && S1[i] > S2[j]))
                arr[i + j] = S1[i++];
            else
                arr[i + j] = S2[j++];
        }
    }

    public int toDecimal(int[] arr) {
        int decimal = 0;
        int n = arr.length;

        for (int i = n - 1, j = 0; i >= 0; i--, j++) {
            int bit = arr[i];
            if (bit == 1) {
                decimal += Math.pow(2, j);
            }
        }
        return decimal;
    }
}


