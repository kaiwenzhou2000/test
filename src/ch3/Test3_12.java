package ch3;

/**
 * @author kaiwen zhou
 * @create 2020-04-05-11:26 上午
 */

public class Test3_12 {
    public static void main(String[] args) {
        String id = "321181200006090031";
        System.out.print("birthday: ");
        for (int i = 6; i <= 9; i++) {
            System.out.print(id.charAt(i));
        }
        System.out.println();
        System.out.println("lenth: " + id.length());
    }
}
