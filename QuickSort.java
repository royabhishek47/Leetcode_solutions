package TutorOps;

public class QuickSort {
    public static void main(String[] args) {
        int[] a = { 8, 5, 2, 9, 5, 6, 3 };
        quickSortAlgo(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static int arrayPartition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = (start - 1);
        for (int ele = start; ele < end; ele++) {
            if (arr[ele] <= pivot) {
                i++;
                int swap = arr[i];
                arr[i] = arr[ele];
                arr[ele] = swap;
            }
        }
        int swap = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swap;
        return i + 1;
    }

    public static void quickSortAlgo(int[] a, int start, int end) {
        if (start < end) {
            int pivot = arrayPartition(a, start, end);
            quickSortAlgo(a, start, pivot - 1);
            quickSortAlgo(a, pivot + 1, end);
        }
    }
}