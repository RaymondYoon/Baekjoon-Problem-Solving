package Level.Bronze4.Day19;

import java.util.Scanner;

public class BOJ4299 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int add = sc.nextInt();
       int minus = sc.nextInt();
       if ((add + minus) % 2 != 0 || (add - minus) % 2 !=0 || add < minus){
           System.out.println(-1);
       } else {
           int a = (add + minus) / 2;
           int b = (add - minus) / 2;

           if (a>=0 && b>=0) {
               if (a > b) {
                   System.out.println(a + " " + b);
               } else if (b > a) {
                   System.out.println(b + " " + a);
               } else System.out.println(b + " " + a);
           }
       }
    }
}
