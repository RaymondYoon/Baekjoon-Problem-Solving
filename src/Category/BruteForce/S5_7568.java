package Category.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//덩치
public class S5_7568 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        String[] str;
        for (int i=0; i<N; i++){
            str = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(str[0]);  //  [i][0] : 몸무게
            arr[i][1] = Integer.parseInt(str[1]);  //  [i][1] : 키
        }

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<N; i++){
            int rank = 1;

            for (int j=0; j<N; j++){
                if (i == j) continue;
                else if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    rank++;
                }
            }
            sb.append(rank).append(' ');
        }
        System.out.println(sb);
    }
}









/* Scanner로 문제풀이
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int [][] arr = new int[N][2];
    for (int i=0; i<N; i++){
        arr[i][0] = sc.nextInt();  // [i][0] : 몸무게
        arr[i][1] = sc.nextInt();  // [i][1] : 키
    }

    for (int i=0; i<N; i++){
        int rank = 1;
        for (int j=0; j<N; j++){
            if (i==j) continue;
            if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                rank++;
            }
        }
        System.out.print(rank + " ");
    }
}
*/