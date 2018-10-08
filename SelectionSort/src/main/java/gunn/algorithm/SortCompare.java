package gunn.algorithm;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

public class SortCompare {

    public static double time(Sort sort, Comparable[] comparables) {
        Stopwatch timer = new Stopwatch();
        sort.sort(comparables);
        return timer.elapsedTime();
    }

    public static double timeRandomInput(Sort sort, int N, int T) {
        double total = 0.0;
        Double[] a = new Double[N];
        for (int t = 0; t < T; t++) {
            for (int i = 0; i < N; i++) {
                a[i] = StdRandom.uniform();
            }
            total += time(sort, a);
        }
        return total;
    }

    public static void main(String[] args) {
        Sort insertionSort = new InsertionSort();
        Sort selectionSort = new SelectionSort();
        double t1 = timeRandomInput(insertionSort, 1000, 10000);
        double t2 = timeRandomInput(selectionSort, 1000, 10000);
        System.out.println("长度1000数组排序100次，插入排序耗时为：" + t1);
        System.out.println("长度1000数组排序100次，选择排序耗时为：" + t2);
    }
}
