package homework_12;

import java.util.Arrays;

public class SortingAlgorithms {

    //Bubble sort
    public int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int k = 0; k < n - 1; k++) {
            boolean swapped = false;
            for (int j = 0; j < n - k - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            if (!swapped)
                break;
        }
        return arr;
    }

    //Selection sort
    public int[] selectionSort(int[] arr) {
        int n = arr.length;
        for (int k = 0; k < n - 1; k++) {
            int min = k;
            for (int j = k + 1; j < n; j++)
                if (arr[j] < arr[min])
                    min = j;
            int temp = arr[k];
            arr[k] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

    //Insertion sort
    public int[] insertionSort(int[] arr) {
        int n = arr.length;
        for (int k = 1; k < n; k++) {
            int cur = arr[k];
            int j = k;
            while (j > 0 && arr[j - 1] > cur) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = cur;
        }
        return arr;
    }

    //Merge sort
    public void mergeSort(int[] arr) {
        int n = arr.length;
        if (n < 2) return;

        int mid = n / 2;
        int[] S1 = Arrays.copyOfRange(arr, 0, mid);
        int[] S2 = Arrays.copyOfRange(arr, mid, n);

        mergeSort(S1);
        mergeSort(S2);

        merge(S1, S2, arr);
    }

    public void merge(int[] S1, int[] S2, int[] arr) {
        int i = 0, j = 0;
        while (i + j < arr.length) {
            if (j == S2.length || (i < S1.length && S1[i] < S2[j]))
                arr[i + j] = S1[i++];
            else
                arr[i + j] = S2[j++];
        }
    }

    //Quick sort
    public void quickSort(int[] arr) {
        int n = arr.length;
        if (n < 2) return;
        int pivot = arr[n - 1];
        int m = 0, k = n;
        int[] temp = new int[n];
        for (int i = 0; i < n - 1; i++)
            if (arr[i] < pivot)
                temp[m++] = arr[i];
            else if (arr[i] > pivot)
                temp[--k] = arr[i];
        int[] L = Arrays.copyOfRange(temp, 0, m);
        int[] E = new int[k - m];
        Arrays.fill(E, pivot);
        int[] G = Arrays.copyOfRange(temp, k, n);

        quickSort(L);
        quickSort(G);

        System.arraycopy(L, 0, arr, 0, m);
        System.arraycopy(E, 0, arr, m, k - m);
        System.arraycopy(G, 0, arr, k, n - k);
    }

}
