package Bronze5.Day19;

import java.util.Scanner;

public class BOJ27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int i = sc.nextInt();
        char answer = S.charAt(i-1);
        System.out.println(answer);
    }
}
