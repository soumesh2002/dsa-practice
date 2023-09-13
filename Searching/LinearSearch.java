package Searching;

public class LinearSearch {
    public static int search(int[] arr, int N, int x) {
        /*
         * N: denotes length of the array
         */
        for (int i = 0; i < N; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 50, 30, 70, 80, 20, 90, 40 };
        int key = 30;
        int result = search(arr, arr.length, key);

        System.out.println(result == -1 ? "not present = " : "present at index = " + result);
    }
}