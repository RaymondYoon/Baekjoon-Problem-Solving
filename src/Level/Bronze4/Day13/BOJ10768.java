package Level.Bronze4.Day13;

import java.util.Scanner;

public class BOJ10768 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        if (m==2 && d<18 || m<2){
            System.out.println("Before");
        }
        else if (m==2 && d==18){
            System.out.println("Special");
        }
        else if (m==2 && d>18 || m>2) {
            System.out.println("After");
        }
    }
}
