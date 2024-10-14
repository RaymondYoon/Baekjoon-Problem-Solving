package Category.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int Quarter = 25;
        int Dime = 10;
        int Nickel = 5;
        int Penny = 1;

        int T = Integer.parseInt(br.readLine());
        for (int i=0; i<T; i++){
            int C = Integer.parseInt(br.readLine());
            sb.append(C / Quarter).append(" ");
            C %= Quarter;

            sb.append(C / Dime).append(" ");
            C %= Dime;

            sb.append(C / Nickel).append(" ");
            C %= Nickel;

            sb.append(C / Penny).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
