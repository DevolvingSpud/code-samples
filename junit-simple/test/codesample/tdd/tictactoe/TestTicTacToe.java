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
				assertNull(board.getMarkAt(i,j));
			}
		}
	}
	
	@Test
	public void testSetValidMarks() {
		// Test setting marks in valid places on the board
		fail("Not implemented");
	}
	
	@Test
	public void testSetInvalidMarks() {
		
		// Test setting marks that are invalid
		fail("Not implemented");
	}
	
	@Test
	public void testFirstTurnIsX() {
		
		// X goes first	
		fail("Not implemented");
	}
	
	@Test
	public void testFirstTurnIsO() {
		
		// X goes first; trying to put O in first should fail
		fail("Not implemented");
	}
	
	@Test
	public void testXGoesThenO() {
		
		// X goes first; then O should be able to go
		fail("Not implemented");
	}
	
	@Test
	public void testOGoesThenX() {
		
		// X goes first; trying to put O in first should fail, but then X should
	    // be able to go.
		fail("Not implemented");
	}
	
	@Test
	public void testXThenOThenX() {
		
		// Test that alternating turns works
		fail("Not implemented");
	}
	
	@Test
	public void testXWinsGameAcross() {
		
		// Make sure that the game ends appropriately (and doesn't end inappropriately)
		fail("Not implemented");
	}

	@Test
	public void testXWinsGameDown() {
		
		// Make sure that the game ends appropriately (and doesn't end inappropriately)
		fail("Not implemented");
	}
	
	@Test
	public void testXWinsGameDiagonal() {
		
		// Make sure that the game ends appropriately (and doesn't end inappropriately)
		fail("Not implemented");
	}
	
	@Test
	public void testXStalemates() {
		
		// Make sure that the game ends appropriately (and doesn't end inappropriately)
		fail("Not implemented");
	}

	@Test
	public void testOWinsGameAcross() {
		
		// Make sure that the game ends appropriately (and doesn't end inappropriately)
		fail("Not implemented");
	}

	@Test
	public void testOWinsGameDown() {
		
		// Make sure that the game ends appropriately (and doesn't end inappropriately)
		fail("Not implemented");
	}
	
	@Test
	public void testOWinsGameDiagonal() {
		
		// Make sure that the game ends appropriately (and doesn't end inappropriately)
		fail("Not implemented");
	}
	
	@Test
	public void testOStalemates() {
		
		// Make sure that the game ends appropriately (and doesn't end inappropriately)
		fail("Not implemented");
	}
	
}
