package ch3;

import javax.crypto.spec.PSource;

/**
 * @author kaiwen zhou
 * @create 2020-04-05-11:15 上午
 */

public class Test3_11 {
    public static void main(String[] args) {
        char c = 'a';
        String s = "Java Language";
        int cnt = 0;
        char[] s1 = s.toCharArray();
        for (char i : s1) {
            if (i == c) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
