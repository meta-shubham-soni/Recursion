
public class NQueens {
	
	/**
	 * @param board - 2-D array to represent chess board
	 * @param N - number of queens
	 */
    void printSolution(int board[][],int N) 
    { 
        for (int i = 0; i < N; i++) { 
            for (int j = 0; j < N; j++) 
                System.out.print(" " + board[i][j] 
                                 + " "); 
            System.out.println(); 
        } 
    } 
  

    /**
     * @param board - 2-D array to represent chess board
     * @param row
     * @param col
     * @param N
     * @return true if board is correct if we place Queen at (row,col) else false
     */
    boolean isSafe(int board[][], int row, int col,int N) 
    { 
        int i, j; 
  

        for (i = 0; i < col; i++) 
            if (board[row][i] == 1) 
                return false; 
  

        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) 
            if (board[i][j] == 1) 
                return false; 
  

        for (i = row, j = col; j >= 0 && i < N; i++, j--) 
            if (board[i][j] == 1) 
                return false; 
  
        return true; 
    } 
  

    /**
     * @param board - 2-D array to represent chess board
     * @param col
     * @param N
     * @return boolean value , find required board settlement
     */
    boolean solveNQUtil(int board[][], int col,int N) 
    { 

        if (col >= N) 
            return true; 
  

        for (int i = 0; i < N; i++) { 

            if (isSafe(board, i, col,N)) { 

                board[i][col] = 1; 
  

                if (solveNQUtil(board, col + 1,N) == true) 
                    return true; 
  

                board[i][col] = 0; // BACKTRACK 
            } 
        } 
  

        return false; 
    } 
    
    /**
     * @param board - 2-D array to represent chess board
     * @param N
     * @return settled board with N queens
     */
    public boolean solveNQ(int N) 
    { 
    	int[][] board = new int[N][N];
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				board[i][j] = 0;
			}
		}
        if (solveNQUtil(board, 0,N) == false) { 
            System.out.print("Solution does not exist"); 
            return false; 
        } 
  
        printSolution(board,N);
        return true; 
    } 

 
}