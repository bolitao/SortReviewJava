package bubble;

import java.util.Random;

/**
 * @author Boli Tao
 */
public class BubbleSort {
    /**
     * 交换 arr 数组中索引为 index1 和 index2 的值
     *
     * @param arr    array
     * @param index1 index1
     * @param index2 index2
     */
    public static void swap(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }

    /**
     * bubble sort
     *
     * @param arr the array to be sorted
     */
    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(Integer.MAX_VALUE);
        }
        bubbleSort(array);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] < array[i]) {
                throw new IllegalArgumentException("冒泡排序写错了");
            }
        }
        System.out.println("Test complete.");
    }
}
