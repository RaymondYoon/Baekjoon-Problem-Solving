package Level.Bronze4.Day04;

import java.util.Scanner;

public class BOJ2440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i=1; i <= N; i++){
            for (int k=N-i; k>=0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}