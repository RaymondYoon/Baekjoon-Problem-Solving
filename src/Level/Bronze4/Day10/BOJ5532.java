package Level.Bronze4.Day10;

import java.util.Scanner;

public class BOJ5532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt(); // 총 방학 일
        int A = sc.nextInt(); // 국어 총 페이지 수
        int B = sc.nextInt(); // 수학 총 페이지 수
        int C = sc.nextInt(); // 하루 국어 페이지 수
        int D = sc.nextInt(); // 하루 수학 페이지 수

        int koreanDays = (int) Math.ceil((double) A / C);
        int mathDays = (int) Math.ceil((double) B / D);

        int maxDays = Math.max(koreanDays, mathDays);
        System.out.println(L - maxDays);
    }
}

