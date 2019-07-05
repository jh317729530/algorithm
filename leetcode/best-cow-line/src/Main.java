import java.util.ArrayList;
import java.util.List;

public class Main {

    // 字典序最小问题
    public static void main(String[] args) {
        char[] s = new char[]{'A', 'C', 'D', 'B', 'C', 'B'};

        List<Character> result = new ArrayList<>();

        int a = 0, b = s.length - 1;

        while (a <= b) {
            boolean left = false;
            for (int i = 0; a + i <= b; i++) {
                if (s[a + i] < s[b - i]) {
                    left = true;
                    break;
                } else if (s[a + i] > s[b - i]) {
                    left = false;
                    break;
                }
            }
            if (left) {
                result.add(s[a++]);
            } else {
                result.add(s[b--]);
            }

        }
        System.out.println(result);

    }


}
