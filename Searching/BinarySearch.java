package Searching;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 10, 50, 30, 70, 80, 20, 90, 40 };
        // {10, 20, 30, 40, 50, 70, 80, 90}
        // 10 + (90 - 10) / 2 = 10 + 40 = 50
        int key = 30;
        // System.out.println("sorted = " + sorted_array_check(arr));
        // Arrays.sort(arr);
        // for (int x : arr) {
        // System.out.println(x);
        System.out.println("Original array: " + Arrays.toString(arr));

        if (sorted_array_check(arr)) {
            System.out.println("Array is already sorted.");
        } else {
            System.out.println("Array is not sorted. Sorting it first.");
            arraySort(arr);
            System.out.println("Sorted array: " + Arrays.toString(arr));
        }

        int index = binarysearch(arr, key);

        if (index != -1) {
            System.out.println("Element " + key + " is present at index " + index);
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }
    }

    public static void arraySort(int arr[]) {
        Arrays.sort(arr);
    }

    public static boolean sorted_array_check(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param arr: integer array
     * @param x:   key
     * @return: boolean (T/F)
     */

    public static int binarysearch(int[] arr, int x) {
        if (sorted_array_check(arr)) {
            int L = 0;
            int R = arr.length - 1;
            while (L <= R) {
                int mid = L + (R - L) / 2;

                // check if x is at mid
                if (arr[mid] == x) {
                    return mid;
                }

                if (arr[mid] < x) {
                    L = mid + 1;
                }

                if (arr[mid] > x) {
                    R = mid - 1;
                }
            }

            return -1;

        } else {
            arraySort(arr);
            binarysearch(arr, x);
        }
        return x;
    }

}
