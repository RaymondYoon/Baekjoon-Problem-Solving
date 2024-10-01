package Bronze5.Day06;

import java.util.Scanner;

public class BOJ10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();


        for (int i = 1; i<=T; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A+B);
        }
    }
}

/*
import java.util.Scanner;
    public class Main{
         public static void main(String[] args){
             Scanner in = new Scanner(System.in);
             int c = in.nextInt();
             int arr[] = new int[c];

             for(int i = 0; i < c; i++){
                 int a = in.nextInt();
                 int b = in.nextInt();
                 arr[i] = a+b;
             }
             in.close();
             for (int k : arr) {
			System.out.println(k);
             }
         }
     }
 */