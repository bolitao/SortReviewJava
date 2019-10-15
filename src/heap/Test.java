package heap;

/**
 * @author 陶波利
 */
public class Test {
    public static void main(String[] args) {
        int[] array = {37, 18, 7, 5, 24, 46, 28, 35, 11, 13, 2};
        MaxHeap<Integer> heap = new MaxHeap<>();
        for (int i = 0; i < array.length; i++) {
            heap.add(array[i]);
        }
        int[] sorted = new int[heap.size()];
        for (int i = 0; i < sorted.length; i++) {
            sorted[i] = heap.extractMax();
            System.out.print(sorted[i] + " ");
        }
    }
}
