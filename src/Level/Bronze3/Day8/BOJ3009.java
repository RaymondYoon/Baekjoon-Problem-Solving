package Level.Bronze3.Day8;

import java.util.Scanner;

public class BOJ3009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] x = new int[3];
        int[] y = new int[3];

        for (int i = 0; i < 3; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int answerx, answery;

        if (x[0] == x[1]) answerx = x[2];
        else if(x[0] == x[2]) answerx = x[1];
        else answerx = x[0];

        if (y[0] == y[1]) answery = y[2];
        else if(y[0] == y[2]) answery = y[1];
        else answery = y[0];

        System.out.println(answerx + " " + answery);
    }
}
