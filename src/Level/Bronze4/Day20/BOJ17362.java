package Level.Bronze4.Day20;

import java.util.Scanner;

public class BOJ17362 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] pattern = {1,2,3,4,5,4,3,2};
        int N = sc.nextInt();
        int fingerIndex = (N-1) % pattern.length;
        System.out.println(pattern[fingerIndex]);
    }
}