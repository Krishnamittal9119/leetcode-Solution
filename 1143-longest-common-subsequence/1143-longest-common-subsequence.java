class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
//         int m = text1.length();
//         int n = text2.length();
        
//         int[][] check = new int[m + 1][n + 1];
        
//         for(int[] i : check)
//         {
//             Arrays.fill(i , -1);
//         }
        
//         return common(text1, text2, m , n, check);
//     }
    
//     public int common(String str1, String str2, int m, int n, int[][] check)
//     {
//         if(check[m][n] != -1)
//             return check[m][n];
        
//         if(m == 0 || n == 0)
//             return check[m][n] = 0;
        
//         if(str1.charAt(m - 1) == str2.charAt(n - 1))
//             check[m][n] =  1 + common(str1, str2, m-1, n-1, check);
//         else
//             check[m][n] = Math.max(common(str1, str2, m - 1, n, check), common(str1, str2, m, n - 1, check));
        
//         return check[m][n];
        int m = text1.length();
        int n = text2.length();
        
        int[][] dp = new int[m + 1][n + 1];
        for(int i = 0; i < m; i++)
        {
            dp[i][0] = 0;
        }
        
        for(int j = 0; j < n; j++)
        {
            dp[0][j] = 0;
        }
        
        for(int i = 1; i <= m; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(text1.charAt(i - 1) == text2.charAt(j - 1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[m][n];
    }
}