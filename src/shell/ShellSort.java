package shell;

import java.util.Random;

/**
 * @author 陶波利
 */
public class ShellSort {
    private static void shellInsert(int[] arr, int d) {
        for (int i = d; i < arr.length; i++) {
            int j = i - d;
            //记录要插入的数据
            int temp = arr[i];
            //从后向前，找到比其小的数的位置
            while (j >= 0 && arr[j] > temp) {
                //向后挪动
                arr[j + d] = arr[j];
                j -= d;
            }
            //存在比其小的数
            if (j != i - d) {
                arr[j + d] = temp;
            }
        }
    }

    public static void shellSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int d = arr.length / 2;
        while (d >= 1) {
            shellInsert(arr, d);
            d /= 2;
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[1000000];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(Integer.MAX_VALUE);
        }
        shellSort(array);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] < array[i]) {
                throw new IllegalArgumentException("希尔排序写错了");
            }
        }
        System.out.println("Test complete.");
    }
}
