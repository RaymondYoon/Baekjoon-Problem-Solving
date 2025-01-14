package Level.Bronze4.Day15;

import java.util.Scanner;

public class BOJ5575 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i<3; i++){
            int startH = sc.nextInt();
            int startM = sc.nextInt();
            int startS = sc.nextInt();
            int endH = sc.nextInt();
            int endM = sc.nextInt();
            int endS = sc.nextInt();

            int startTimeInSeconds = startH * 3600 + startM * 60 + startS;
            int endTimeInSeconds = endH * 3600 + endM * 60 + endS;

            int workTimeInSeconds = endTimeInSeconds - startTimeInSeconds;

            int workH = workTimeInSeconds / 3600;
            workTimeInSeconds %= 3600;
            int workM = workTimeInSeconds / 60;
            int workS = workTimeInSeconds % 60;

            System.out.println(workH + " " + workM + " " + workS);
        }
        sc.close();
    }
}

/*
if(starts<ends){
    ends+=60;
    endm--;
}
ends-=starts;

if(startm<endm){
    endm+=60;
    endh--;
}
endm-=startm;
endh-=starth;



 */