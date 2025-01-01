package Level.Bronze4.Day09;

import java.util.Scanner;

public class BOJ2845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int P = sc.nextInt();


        for (int i = 0; i < 5; i++) {
            int count = sc.nextInt();
            System.out.println(count-L*P);
        }
    }
}
