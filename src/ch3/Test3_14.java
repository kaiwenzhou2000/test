package ch3;

import java.util.Scanner;

/**
 * @author kaiwen zhou
 * @create 2020-04-05-11:40 上午
 */

public class Test3_14 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the names of five cities：");
        for (int i = 0; i < 5; i++) {
            s.append(scan.nextLine());
            s.append(" ");
        }
        System.out.println("The names of the five cities are: " + s);
    }
}
