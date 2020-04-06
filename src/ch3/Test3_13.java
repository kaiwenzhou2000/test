package ch3;

import java.util.Scanner;

/**
 * @author kaiwen zhou
 * @create 2020-04-05-11:33 上午
 */

public class Test3_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        System.out.println("====== using '==' to compare ======");
        if (s1 == s2){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        System.out.println("====== using 'equals' to compare ======");
        if (s1.equals(s2)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
