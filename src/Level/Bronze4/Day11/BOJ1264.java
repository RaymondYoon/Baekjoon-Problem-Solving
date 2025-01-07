package Level.Bronze4.Day11;

import java.util.Scanner;

public class BOJ1264 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        int count = 0;
        for (char c : input.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }

        System.out.println(count);
    }
}
