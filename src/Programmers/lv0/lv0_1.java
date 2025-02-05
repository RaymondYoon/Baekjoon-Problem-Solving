package Programmers.lv0;
import java.util.*;

public class lv0_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int result = Math.max(
                Integer.parseInt(new StringBuilder().append(a).append(b).toString()),
                2 * a * b
        );

        System.out.println(result);
    }
}
