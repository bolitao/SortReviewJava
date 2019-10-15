package quick;

import java.util.Random;

/**
 * @author 陶波利
 */
public class QuickSort {
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

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        int pivotIndex = left;
        while (left < right) {
            // 从右侧开始寻找比基准数小的元素的索引
            while (left < right && arr[right] >= pivot) {
                right--;
            }
            //从左侧开始寻找比基准数大的元素的索引
            while (left < right && arr[left] <= pivot) {
                left++;
            }
            // 把大数移到右边，小数移到左边
            swap(arr, left, right);
        }
        // 把 pivot 移到中间
        swap(arr, pivotIndex, left);
        return left;
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int pi = partition(arr, left, right);
        quickSort(arr, left, pi - 1);
        quickSort(arr, pi + 1, right);
    }

    public static void sort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        quickSort(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[1000000];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(Integer.MAX_VALUE);
        }
        sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] < array[i]) {
                throw new IllegalArgumentException("快排写错了");
            }
        }
        System.out.println("Test complete.");
    }
}
