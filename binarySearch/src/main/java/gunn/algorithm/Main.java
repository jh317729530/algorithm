package gunn.algorithm;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class Main {

    public static void main(String[] args) {
        int[] whitelist = {1, 2, 3, 4, 6, 7, 8};
        Arrays.sort(whitelist);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (BinarySearch.rank(key, whitelist) < 0) {
                StdOut.println(key);
            }
        }
    }
}
