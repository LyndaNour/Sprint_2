import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class TestOplayerMoves extends TestCase{
	private Board board;
	
	@Before
	public void setUp() throws Exception{
		board = new Board();
		board.makeMove(1, 1);// s move then o move	
	}
	// AC 4.5
	@Test
	public void testOplayerTurnVacantCell() {
		board.makeMove(0, 0); // o player move
		assertEquals("", board.getCell(0, 0),Board.Cell.O_PLACEMENT);
		assertEquals("", board.getTurn(),'S');
	}
	
	// acceptance criterion 4.6
		@Test
		public void testOplayerTurnMoveNonVacantCell() {
			board.makeMove(0, 0); // O player move
			board.makeMove(1, 0); // s player move
			assertEquals("", board.getTurn(), 'O');
			board.makeMove(1, 0); // invalid o player move
			assertEquals("", board.getTurn(), 'O');
		}
	
		// acceptance criterion 4.7
		@Test
		public void testOplayerTurnInvalidRowMove() {
			board.makeMove(5, 0); 
			assertEquals("", board.getTurn(), 'O');
		}
		
		// acceptance criterion 4.7
		@Test
		public void testOplayerTurnInvalidColumnMove() {
			board.makeMove(0, 5); 
			assertEquals("", board.getTurn(), 'O');
		}
}
