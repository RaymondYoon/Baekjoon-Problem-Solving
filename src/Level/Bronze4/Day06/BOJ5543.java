package Level.Bronze4.Day06;

import java.util.Scanner;

public class BOJ5543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int J = sc.nextInt();
        int H = sc.nextInt();
        int min_buger = Math.min(S,Math.min(J, H));

        int cola = sc.nextInt();
        int cider = sc.nextInt();
        int min_drink = Math.min(cola,cider);

        System.out.println(min_buger + min_drink - 50);
    }
}
