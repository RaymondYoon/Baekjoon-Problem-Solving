package Level.Bronze3.Day1;

import java.util.Scanner;

public class BOJ2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        String two = sc.next();

        for (int i = 2; i>=0; i--){
            System.out.println(one * (two.charAt(i) - '0'));
        }
        System.out.println(one * Integer.parseInt(two));
    }
}




/*
package Level.Bronze3.Day1;

import java.util.Scanner;

public class BOJ2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = one * (two%10);
        int four = one * ((two/10)%10);
        int five = one * (two/100);
        int six = three + 10*four + 100*five;

        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
    }
}

 */