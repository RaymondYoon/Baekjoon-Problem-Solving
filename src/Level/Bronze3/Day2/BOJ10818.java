package Level.Bronze3.Day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10818 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i<N; i++){
            int num = Integer.parseInt(st.nextToken());
            if (num < min) min = num;
            if (num > max) max = num;
        }
        System.out.println(min +" "+ max);
    }
}








/*
public class BOJ10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println(Arrays.stream(numbers).min().getAsInt()
                +" "+Arrays.stream(numbers).max().getAsInt());
    }
}
*/