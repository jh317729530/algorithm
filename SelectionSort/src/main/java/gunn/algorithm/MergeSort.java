package gunn.algorithm;

public class MergeSort implements Sort {

    private Comparable[] aux;

    public MergeSort(int length) {
        this.aux = new Comparable[length];
    }

    /**
     * 原地归并排序
     * @param a
     * @param lo
     * @param mid
     * @param hi
     */
    public void merge(Comparable[] a, int lo, int mid, int hi) {
        int i = lo;
        int j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            this.aux[k] = a[k];
        }

        for (int k = lo; k <= hi; k++) {
            // 左边元素用尽
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                // 右边元素用尽
                a[k] = aux[i++];
            } else if (less(aux[j], aux[i])) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }
    }

    @Override
    public void sort(Comparable[] a) {
        // TODO
        // 目前此排序方法并未完成
        int mid = (a.length - 1) / 2;
        merge(a, 0, mid, a.length - 1);
    }
}
