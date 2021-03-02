
public class KnightTour {

	/**
	 * @param x
	 * @param y
	 * @param sol
	 * @param N
	 * @return boolean - true if solution board can handle (x,y)
	 */
	static boolean isSafe(int x, int y, int sol[][],int N){
			
		return (x >= 0 && x < N && y >= 0 && y < N && sol[x][y] == -1);
	
	}

	/**
	 * @param sol - 2D array to represent solution board
	 * @param N
	 */
	static void printSolution(int sol[][],int N){
		
		for (int x = 0; x < N; x++) {
			for (int y = 0; y < N; y++)
				System.out.print(sol[x][y] + " ");
			System.out.println();
		}
	}
	
	/**
	 * @param N - N*N dimension of board
	 * @return boolean value if there is a solution exits
	 */
	static boolean solveKT(int sizeOfArr){
			
		int[][] sol = new int[sizeOfArr][sizeOfArr];
		for(int i=0;i<sizeOfArr;i++){
			for(int j=0;j<sizeOfArr;j++){
				sol[i][j] = -1;
			}
		}
		int xMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
		int yMove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

		sol[0][0] = 0;

		if (!solveKTUtil(0, 0, 1, sol, xMove, yMove,sizeOfArr)) {
			System.out.println("Solution does not exist");
			return false;
		}
		else
			printSolution(sol,sizeOfArr);

		return true;
	}

	/**
	 * @param x
	 * @param y
	 * @param movei
	 * @param sol
	 * @param xMove
	 * @param yMove
	 * @param N
	 * @return 
	 */
	static boolean solveKTUtil(int x, int y, int movei,int sol[][], int xMove[],int yMove[],int N){
		int k, next_x, next_y;
		if (movei == N * N)
			return true;

		for (k = 0; k < 8; k++) {
			next_x = x + xMove[k];
			next_y = y + yMove[k];
			if (isSafe(next_x, next_y, sol,N)) {
				sol[next_x][next_y] = movei;
				if (solveKTUtil(next_x, next_y, movei + 1,
								sol, xMove, yMove,N))
					return true;
				else
					sol[next_x][next_y]	= -1; // backtracking
			}
		}

		return false;
	}

	
}
