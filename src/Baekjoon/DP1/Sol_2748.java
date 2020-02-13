package DP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sol_2748 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] dp = new long[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-2] + dp[i-1];
        }
        System.out.println(dp[n]);
    }
}
