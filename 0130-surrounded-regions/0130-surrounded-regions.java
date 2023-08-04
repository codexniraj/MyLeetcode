 class Solution {

    public void dfs(int row,int col, int[] delrow,int[] delcol,int[][] vis, char[][] board, int n,int m){
        vis[row][col] = 1;

        for(int i=0;i<4;i++){
            int nrow = row + delrow[i];
            int ncol = col + delcol[i];

            if(nrow>=0 && ncol>=0 && nrow<n && ncol < m && board[nrow][ncol] == 'O' && vis[nrow][ncol] == 0){
                dfs(nrow,ncol,delrow,delcol,vis,board,n,m);
            }
        }
    }

    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        int[][] vis = new int[n][m];
        int[] delrow = {0,-1,0,+1};
        int[] delcol = {-1,0,+1,0}; 

        for(int i =0;i<n; i++){
            if(vis[i][0]== 0 && board[i][0] == 'O'){
                dfs(i,0,delrow,delcol,vis,board,n,m);
            } 

            if(vis[i][m-1]== 0 && board[i][m-1] =='O'){
                dfs(i,m-1,delrow,delcol,vis,board,n,m);
            }
        }
        for(int j =0;j<m; j++){
            if(vis[0][j]== 0 && board[0][j] == 'O'){
                dfs(0,j,delrow,delcol,vis,board,n,m);
            } 

            if(vis[n-1][j]== 0 && board[n-1][j] == 'O'){
                dfs(n-1,j,delrow,delcol,vis,board,n,m);
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j] == 'O' && vis[i][j] != 1){
                    board[i][j] = 'X';
                }
            }
        }
    }
}