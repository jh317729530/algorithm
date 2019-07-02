import java.util.ArrayList;
import java.util.List;

public class Solution {

    /**
     * https://leetcode-cn.com/problems/binary-prefix-divisible-by-5/
     * @param args
     */
    public static void main(String[] args) {
        int[] A = new int[]{1,0,0,1,0,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,1,0,0,0,0,1,1,0,1,0,0,0,1};
        List<Boolean> booleans = prefixesDivBy5(A);
        System.out.println(booleans);
    }

    public static List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> result = new ArrayList();

        // 上一次结果的余数
        /**
         * i每前进一位，相当于前一位结果*2再加A[i]
         * 所以如果前一位能被5整除，那么乘2结果也能被5整除，
         * 前一位余数为1，下一位余数为 上一位余数*2
         * 判断下一位余数是否能被5整除即可
         */
        int mod = 0;
        for(int i=0;i<A.length;i++) {
            mod = (mod << 1) + A[i];
            result.add((mod = mod % 5) == 0);
        }
        return result;
    }
}