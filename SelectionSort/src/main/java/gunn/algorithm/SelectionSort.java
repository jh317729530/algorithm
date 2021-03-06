package gunn.algorithm;

/**
 * 选择排序
 *
 * 命题A 对于长度为N的数组，选择排序需要大约N²/2次比较和N次交换
 * 证明。可以通过算法的排序轨迹来证明这一点。我们用一张 N×N 的表格来表示排序的轨迹(见
 * 算法 2.1 下部的表格),其中每个非灰色字符都表示一次比较。表格中大约一半的元素不是灰
 * 色的——即对角线和其上部分的元素。对角线上的每个元素都对应着一次交换。通过查看代码
 * 我们可以更精确地得到,0 到 N-1 的任意 i 都会进行一次交换和 N-1-i 次比较,因此总共有 N
 * 次交换以及 (N-1)+(N-2)+...+2+1=N(N-1)/2 ~ N2/2 次比较。
 */
public class SelectionSort implements Sort {

    @Override
    public void sort(Comparable[] a) {
        int lenght = a.length;
        for (int i = 0; i < lenght; i++) {
            int min = i;
            for (int j = i + 1; j < lenght; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }

}
