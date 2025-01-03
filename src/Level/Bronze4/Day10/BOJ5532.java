package Level.Bronze4.Day10;

import java.util.Scanner;

public class BOJ5532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt(); //총 방학 일
        int A = sc.nextInt(); //국어 총 페이지 수
        int B = sc.nextInt(); //수학 총 페이지 수
        int C = sc.nextInt(); //하루 국어 페이지 수
        int D = sc.nextInt(); //하루 수학 페이지 수

        if (A%C!=0 & B%D!=0){
            if (A/C > B/D) {
                System.out.println(L - (A / C + 1));
            }
            else if (A/C < B/D){
                System.out.println(L - (B / D + 1));
            }
            else if (A/C == B/D){
                System.out.println(L - (A / C + 1));
            }
        }
        else if (A%C==0 & B%D!=0){
            if (A/C > B/D) {
                System.out.println(L - (A / C));
            }
            else if (A/C < B/D){
                System.out.println(L - (B / D + 1));
            }
            else if (A/C == B/D){
                    System.out.println(L - (B / D + 1));
            }
        }

        else if (A%C!=0 & B%D==0){
            if (A/C > B/D) {
                System.out.println(L - (A / C + 1));
            }
            else if (A/C < B/D){
                System.out.println(L - (B / D));
            }
            else if (A/C == B/D){
                    System.out.println(L - (A / C + 1));
            }
        }
        else if (A%C==0 & B%D==0){
            if (A/C > B/D) {
                System.out.println(L - (A / C));
            }
            else if (A/C < B/D){
                System.out.println(L - (B / D));
            }
            else if (A/C == B/D){
                System.out.println(L - (A / C));
            }
        }
    }
}
