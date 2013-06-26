package codesample.tdd.tictactoe;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestTicTacToe {
	
	TTTBoard board;

	@Before
	public void setUp() {
		board = new TTTBoard();
	}
	
	@After
	public void tearDown() {
		board = null;
	}

	@Test
	public void testInitGame() {
		
		// Make sure the board was created
		assertNotNull(board);
		
		// Ensure that the board contains empty values
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				assertNull(board.valueAt(i,j));
			}
		}
	}
	
	@Test
	public void testFirstTurn() {
		
		// The first move should only allow X, and it should only allow the user to place
		// it in an empty space
		fail("Not implemented");
	}
	
	@Test
	public void testTakeTurns() {
		
		// Turns should alternate between X and O, and it should only allow the current player
		// to place it in an empty space		
		fail("Not implemented");
		
	}
	
	@Test
	public void testGameOver() {
		
		// Make sure that the game ends appropriately (and doesn't end inappropriately)
		fail("Not implemented");
	}

}
