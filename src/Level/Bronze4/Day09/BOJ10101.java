package Level.Bronze4.Day09;

import java.util.Scanner;

public class BOJ10101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        int r3 = sc.nextInt();

        if(r1 == 60 & r2 == 60 & r3 == 60){
            System.out.println("Equilateral");
        }
        else if (r1 + r2 + r3 == 180 & (r1==r2 | r2==r3 | r1==r3)){
            System.out.println("Isosceles");
        }
        else if (r1 + r2 + r3 == 180 & (r1!=r2 | r2!=r3 | r1!=r3)){
            System.out.println("Scalene");
        }
        else if (r1 + r2 + r3 != 180){
            System.out.println("Error");
        }

    }
}
