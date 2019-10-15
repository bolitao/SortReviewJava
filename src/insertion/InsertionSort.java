package insertion;

/**
 * @author Boli Tao
 */
public class InsertionSort {
    static void insertionSort(int[] arr) {
        int n = arr.length;
        // 从索引为 1 的元素开始
        for (int i = 1; i < n; i++) {
            // 需要插入的值
            int key = arr[i];
            int j = i - 1;
            // 后移
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            // 插入
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {37, 18, 7, 5, 24, 46, 28, 35, 11, 13, 2};
        insertionSort(arr);
        StringBuilder builder = new StringBuilder();
        builder.append("Sorted array:\n[");
        for (int i = 0; i < arr.length; i++) {
            builder.append(arr[i]);
            if (i != arr.length - 1) {
                builder.append(" ,");
            }
        }
        builder.append("]");
        System.out.println(builder.toString());
    }
}
