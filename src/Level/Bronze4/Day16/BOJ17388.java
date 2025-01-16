package Level.Bronze4.Day16;

import java.util.Scanner;

public class BOJ17388 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int K = sc.nextInt();
        int H = sc.nextInt();
        int smallest = Math.min(S,Math.min(K,H));

        if (S+K+H>=100){
            System.out.println("OK");
        } else if (S+K+H<100) {
            if (smallest == S){
                System.out.println("Soongsil");
            }
            if (smallest == K){
                System.out.println("Korea");
            }
            if (smallest == H){
                System.out.println("Hanyang");
            }
        }
    }
}
