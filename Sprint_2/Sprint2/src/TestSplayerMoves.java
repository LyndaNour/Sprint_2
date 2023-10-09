import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import Board.Cell;
import junit.framework.TestCase;

public class TestSplayerMoves extends TestCase {
	
	private Board board;
	
	@Before
	public void setUp() throws Exception{
		board = new Board();
	}
	
/*	@After
	public void tearDows() throws Exception{
		
	}*/
	// acceptance criterion 4.1
	@Test
	public void testSplayerTurnMoveVacantCell() {
		board.makeMove(0, 0);
		assertEquals("", board.getCell(0, 0), Board.Cell.S_PLACEMENT);
		assertEquals("", board.getTurn(), 'O');
	}
	
	// acceptance criterion 4.2 illegal move
	@Test
	public void testSplayerTurnMoveNonVacantCell() {
		board.makeMove(0, 0);
		board.makeMove(1, 0);
		assertEquals("", board.getCell(1,0),Board.Cell.O_PLACEMENT);
		assertEquals("", board.getTurn(), 'S');
		board.makeMove(0, 0);
		assertEquals("", board.getTurn(), 'S');
	}
	
	//acceptance criterion 4.3 move outside the board, invalid row
	@Test
	public void testSplayerTurnInvalidRowMove() {
		board.makeMove(5, 0);
		assertEquals("", board.getTurn(), 'S');	
	}
	
	//acceptance criterion 4.3 move outside the board, invalid column
		@Test
		public void testSplayerTurnInvalidColumnMove() {
			board.makeMove(0, 5);
			assertEquals("", board.getTurn(), 'S');	
		}
	
	

}
