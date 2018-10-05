package gunn.algorithm;

public class SelectionSort {

    public static void sort(Comparable[] a) {
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

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
