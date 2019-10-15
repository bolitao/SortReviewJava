package selection;

/**
 * @author Boli Tao
 */
public class SelectionSort {
    /**
     * 交换 arr 数组中索引为 index1 和 index2 的值
     *
     * @param arr    array
     * @param index1 index1
     * @param index2 index2
     */
    private static void swap(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            swap(arr, i, min_idx);
        }
    }

    public static void main(String[] args) {
        int[] arr = {37, 18, 7, 5, 24, 46, 28, 35, 11, 13, 2};
        selectionSort(arr);
        System.out.print("Sorted array:\n[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(" ,");
            }
        }
        System.out.print("]");
    }
}
