package gunn.algorithm;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class Main {

    private static Sort sort = new InsertSort();

    public static void main( String[] args ) {
        String a[] = {"B", "A", "E", "D", "C"};
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
