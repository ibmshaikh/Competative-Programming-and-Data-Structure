package com.ibm.cp.string;

public class DecodeWay {

    public static long numDecodings(String s) {
        int n = s.length();
        long[] dp = new long[n + 1];
        dp[n] = 1;
        //if the last chararcter is not zero then we have one way to decode it

        if (s.charAt(n - 1) != '0') {
            dp[n - 1] = 1;
        }
        for (int i = n - 2; i >= 0; i--) {
            dp[i] = 0;
            if (s.charAt(i) != '0') {
                dp[i] += dp[i + 1];
            }
            if (s.charAt(i) == '1') {
                dp[i] += dp[i + 2];
            }
            if (s.charAt(i) == '2') {
                if (s.charAt(i + 1) <= '6') {
                    dp[i] += dp[i + 2];
                }
            }
        }
        return dp[0];
    }

    public static void main(String[] args) {
        String s = "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111";
        System.out.println("The number of ways to decode the given string is: " + numDecodings(s));
    }
}
