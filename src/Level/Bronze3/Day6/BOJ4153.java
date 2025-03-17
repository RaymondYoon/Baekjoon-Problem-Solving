package Level.Bronze3.Day6;

import java.util.Scanner;

public class BOJ4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a==0 && b==0 && c==0) break;

            int x = Math.min(a, Math.min(b,c));
            int z = Math.max(a, Math.max(b,c));
            int y = a + b + c - x - z;

            if (x*x + y*y == z*z){
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
        sc.close();
    }
}
