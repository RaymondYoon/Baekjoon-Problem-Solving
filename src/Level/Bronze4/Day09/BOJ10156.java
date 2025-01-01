package Level.Bronze4.Day09;

import java.util.Scanner;

public class BOJ10156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt(); //가격
        int N = sc.nextInt(); //개수
        int M = sc.nextInt(); //가진 돈

        if ((K*N)>M){
        System.out.println(K * N - M);
        }
        else System.out.println(0);
    }
}
