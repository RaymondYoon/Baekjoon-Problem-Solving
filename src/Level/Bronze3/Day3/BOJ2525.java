package Level.Bronze3.Day3;

import java.util.Scanner;

public class BOJ2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int a = A * 60;
        int time = a + B + C;
        int hour = time/60;
        int minute = time%60;
        if (hour > 23){
            hour %= 24;
        }
        System.out.println(hour+" "+minute);
    }
}
