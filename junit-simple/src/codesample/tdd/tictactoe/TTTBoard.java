package codesample.tdd.tictactoe;

public class TTTBoard {

	public enum Marks {X, O}

	private Marks[][] board = new Marks[3][3];
	
	public TTTBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = null;
			}
		}
	}
	
	public Marks valueAt(int i, int j) {
		return board[i][j];
	}

}
