class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int size = triangle.size();
        int dp[][] = new int[size][];
        for(int i=0;i<size;i++)
        {
            List<Integer> ls=triangle.get(i);
            int col_size=ls.size();
            dp[i]=new int[col_size];
            for(int j=0;j<col_size;j++)
            {
                dp[i][j]=ls.get(j);
            }
        }
        for(int i=size-2;i>=0;i--)
        {
            for(int j=0;j<dp[i].length;j++)
            {
               
                    int south_east=dp[i+1][j+1];
                    int south=dp[i+1][j];
                    dp[i][j]=Math.min(south,south_east) + dp[i][j];
            }
        }
        return dp[0][0];        
    }
}