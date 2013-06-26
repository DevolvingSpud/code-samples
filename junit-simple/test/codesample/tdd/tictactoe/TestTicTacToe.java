package codesample.tdd.tictactoe;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTicTacToe {

	@Test
	public void testStartGame() {
		TTTBoard board = new TTTBoard();
		
		// Make sure the board was created
		assertNotNull(board);
		
		// Ensure that the board contains empty values
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				assertTrue(board.valueAt(i,j).equals(TTTBoard.EMPTY));
			}
		}
	}

}
