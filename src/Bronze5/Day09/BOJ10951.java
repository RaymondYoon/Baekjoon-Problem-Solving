package Bronze5.Day09;

import java.util.Scanner;

public class BOJ10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A+B);
        }
    }
}
//sc.hasNext() 가 끝을 알 수 없을때 입력이 더 이상 들어오지 않을 때
// 자동으로 종료되는 방식.