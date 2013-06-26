package codesample.tdd.tictactoe;

public class TTTBoard {

	public static final String X = "X";
	public static final String Y = "X";
	public static final String EMPTY = "";
	
	private String[][] board = new String[3][3];
	
	public TTTBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = TTTBoard.EMPTY;
			}
		}
	}
	
	public String valueAt(int i, int j) {
		return board[i][j];
	}

}
