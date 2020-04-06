package ch3;

import java.util.Scanner;

/**
 * @author kaiwen zhou
 * @create 2020-04-06-1:42 下午
 */

public class Test3_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;
        System.out.println("Please enter some letters, numbers or other special symbols");
        str = scan.nextLine();
        int charNnm = 0;
        int numNum = 0;
        int otherNum = 0;
        char[] arr = str.toCharArray();
        for (char a: arr) {
            if ((a > 'a' && a < 'z') || a > 'A' && a < 'Z'){
                charNnm++;
            }else if (a > '0' && a < '9' ){
                numNum++;
            }else {
                otherNum++;
            }
        }
        System.out.println("character : " + charNnm);
        System.out.println("number : " + numNum);
        System.out.println("other : " + otherNum);
    }
}
