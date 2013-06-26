package codesample.tdd.tictactoe;

/**
 * A basic implementation of a Tic-Tac-Toe board.
 * 
 * The board is a 3x3 grid (origin in the upper left).  Empty cells are set to null.
 * Marked cells are set to X or O from the {@link Marks} enumeration
 * 
 * Intentionally incomplete; this should be built up as you complete the test cases
 * in the associated test cases.
 * 
 * @author Nate
 *
 */
public class TTTBoard {

	/**
	 * Represents the marks on the board, which can only be X or O.
	 * 
	 * @author Nate
	 *
	 */
	public enum Marks {X, O}

	private Marks[][] board = new Marks[3][3];
	
	/**
	 * Builds an empty game board.  Cells are null to begin with.
	 */
	public TTTBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = null;
			}
		}
	}
	
	/**
	 * Returns the value of the given cell on the board.
	 * 
	 * While it doesn't really matter, by convention the origin is the upper left
	 * corner of the board.
	 * 
	 * @param x x-coordinate of the cell to retrieve
	 * @param y y-coordinate of the cell to retrieve
	 * @return the {@link Mark} at the given coordinate, or null if no mark exists
	 */
	public Marks valueAt(int x, int y) {
		return board[x][y];
	}

}
