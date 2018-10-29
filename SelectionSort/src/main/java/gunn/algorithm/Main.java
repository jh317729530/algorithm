package gunn.algorithm;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class Main {

    private static Sort sort = null;

    public static void main( String[] args ) {
        String s = "QUICKSORTEXAMPLE";
        String[] a = s.split("");
        sort = new QuickSort();
        System.out.println("before sort:");
        Arrays.stream(a).forEach(k->{
            System.out.printf(k + "");
        });
        System.out.println();
        sort.sort(a);
        System.out.println("after sort:");
        Arrays.stream(a).forEach(k->{
            System.out.printf(k + "");
        });
    }
}
