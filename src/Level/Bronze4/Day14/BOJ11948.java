package Level.Bronze4.Day14;

import java.util.Scanner;

public class BOJ11948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();
        int F = sc.nextInt();
        int sum = A+B+C+D;
        System.out.println(sum - (Math.min(D,Math.min(C,Math.min(A,B)))) + Math.max(E,F));
    }
}
