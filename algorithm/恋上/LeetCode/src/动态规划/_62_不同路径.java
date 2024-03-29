package 动态规划;

/**
 * https://leetcode-cn.com/problems/unique-paths/
 * @author Qitong!!
 * @Date 2020/6/26
 */
public class _62_不同路径 {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        //初始化
        dp[0][0] = 1;
        for (int i = 1; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < n; i++) {
            dp[0][i] =1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j] +dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }

}
