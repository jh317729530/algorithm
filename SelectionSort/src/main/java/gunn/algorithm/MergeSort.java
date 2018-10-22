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

    /**
     * 原地归并排序调用
     * @param a
     */
    @Deprecated
    public void inPlaceMergesort(Comparable[] a) {
        // TODO
        // 目前此排序方法并未完成
        int mid = (a.length - 1) / 2;
        merge(a, 0, mid, a.length - 1);
    }

    /**
     * 自顶向下的归并排序
     * 时间复杂度 NlgN
     * @param a
     */
    @Override
    public void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }

    private void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a,lo,mid,hi);
    }
}
