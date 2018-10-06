package gunn.algorithm;

/**
 * 插入排序
 * 对于随机排列的长度为 N 且主键不重复的数组,平均情况下插入排序需要 N²/4 次比
 * 较以及 N²/4 次交换。最坏情况下需要 N²/2 次比较和 N²/2 次交换,最好情况下需要 N-1
 * 次比较和 0 次交换。
 */
public class InsertSort implements Sort {

    @Override
    public void sort(Comparable[] a) {
        int length = a.length;
        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }
}
