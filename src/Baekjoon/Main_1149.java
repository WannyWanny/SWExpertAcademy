package Baekjoon;

import java.util.Scanner;

public class Main_1149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] map = new int[N+1][3];
        for(int r=1; r<=N; r++){
            for(int c=0; c<3; c++){
                map[r][c] = sc.nextInt();
            }
        }
        int[][] dp = new int[N+1][3];
        dp[0][0] = dp[0][1] = dp[0][2] = 0;
        map[0][0] = map[0][1] = map[0][2]=0;
        for(int i=1; i<=N; i++){
            dp[i][0] =Math.min(dp[i-1][1], dp[i-1][2])+map[i][0];
            dp[i][1] =Math.min(dp[i-1][0], dp[i-1][2])+map[i][1];
            dp[i][2] =Math.min(dp[i-1][0], dp[i-1][1])+map[i][2];
        }
        System.out.println(Math.min(Math.min(dp[N][0], dp[N][1]), dp[N][2]));

    }
}
