package Category.Greedy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S5_14916 {
    public static void main (String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int five = N / 5;

        while(five>=0){
            int remainder = N - (five * 5);
            if (remainder % 2 == 0){
                int two = remainder / 2;
                System.out.println(five+two);
                return;
            }
            five--;
        }
        System.out.println(-1);
    }
}
