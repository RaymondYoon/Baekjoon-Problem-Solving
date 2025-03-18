package Level.Bronze3.Day6;

import java.util.Scanner;

public class BOJ2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i<N; i++){
            for (int j = 0; j < N-i-1; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < 2*i+1; k++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = N-1; i >0; i--){
            for (int j = 0; j < N-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}

/*
import java.util.Scanner;

public class BOJ2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 마름모 출력
        for (int i = 1; i <= 2 * N - 1; i++) {
            int stars = (i <= N) ? (2 * i - 1) : (2 * (2 * N - i) - 1); // 별 개수
            int spaces = (i <= N) ? (N - i) : (i - N); // 공백 개수

            System.out.print(" ".repeat(spaces));
            System.out.println("*".repeat(stars));
        }

        sc.close();
    }
}
 */