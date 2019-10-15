package merge;

/**
 * @author 陶波利
 */
public class MergeSort {
    private static void merge(int[] arr, int l, int m, int r) {
        int leftArraySize = m - l + 1;
        // r - (m + 1) + 1
        int rightArraySize = r - m;

        // temp array
        int[] leftTempArray = new int[leftArraySize];
        int[] rightTempArray = new int[rightArraySize];

        // 把 arr 中的数据拷入两个 temp 数组
        for (int i = 0; i < leftArraySize; i++) {
            leftTempArray[i] = arr[l + i];
        }
        for (int i = 0; i < rightArraySize; i++) {
            rightTempArray[i] = arr[m + 1 + i];
        }

        // 两个 temp 数组的索引
        int i = 0, j = 0;
        // arr 数组的索引
        int k = l;

        // 将 temp 数组的数据按顺序填入 arr
        while (i < leftArraySize && j < rightArraySize) {
            if (leftTempArray[i] <= rightTempArray[j]) {
                arr[k] = leftTempArray[i];
                i++;
            } else {
                arr[k] = rightTempArray[j];
                j++;
            }
            k++;
        }

        while (i < leftArraySize) {
            arr[k] = leftTempArray[i];
            i++;
            k++;
        }

        while (j < rightArraySize) {
            arr[k] = rightTempArray[j];
            j++;
            k++;
        }
    }

    /**
     * 递归实现的归并排序
     *
     * @param arr array to be sorted
     * @param l   left
     * @param r   right
     */
    public static void mergeSort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int m = (l + r) / 2;
        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, r);
        merge(arr, l, m, r);
    }

    public static void main(String[] args) {
        int[] arr = {37, 18, 7, 5, 24, 46, 28, 35, 11, 13, 2};
        mergeSort(arr, 0, arr.length - 1);
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
