package Level.Bronze3.Day7;

import java.util.Scanner;

public class BOJ11721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int len = word.length();

        for (int i=0; i<len; i+=10){
            int end = Math.min(i + 10, len);
            System.out.println(word.substring(i, end));
        }
    }
}
