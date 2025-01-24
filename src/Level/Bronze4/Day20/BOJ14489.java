package Level.Bronze4.Day20;

import java.util.Scanner;

public class BOJ14489 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if (2*C>A+B){
            System.out.println(A+B);
        }else System.out.println((A+B)-2*C);
    }
}
