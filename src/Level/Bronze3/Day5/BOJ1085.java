package Level.Bronze3.Day5;

import java.util.Scanner;

public class BOJ1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int minDt = Math.min(Math.min(x, w-x),Math.min(y, h-y));

        System.out.println(minDt);
        sc.close();
    }
}
