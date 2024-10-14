package Level.Bronze4.Day01;

import java.util.Scanner;

public class BOJ2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i=1; i <= N; i++){
            for (int j=N-i; j>0; j--) {
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
for(int i=N; i>0; i--){      5 4 3 2 1
    for(int j=1; j<=N; j++){ 1 2 3 4 5
        if(j<=i) System.out.print("*");
        else System.out.print(" ");
    }
    System.out.println();
}
 */