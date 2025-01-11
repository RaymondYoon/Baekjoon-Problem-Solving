package Level.Bronze4.Day13;

import java.util.Scanner;

public class BOJ11943 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
//A=0 이되고, D가 0이되는거랑 B가 0이되고, C가 0이되는거
 //           A+D 랑 B+C중 최소인거
        System.out.println(Math.min(A+D,B+C));
    }
}
