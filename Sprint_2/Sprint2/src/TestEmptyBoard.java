import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
public class TestEmptyBoard extends TestCase {
	private Board board = new Board(); // context test, create object board

	@Before
	public void setUp() throws Exception{
		
	}
	
	@After
	public void tearDown() throws Exception{
	
	}
	
	@Test // AC test empty board

	public void testNewBoard() {
		for(int row=0;row< board.getTotalRows();++row) {
			for(int column=0;column<board.getTotalColumns();++column) {
				assertEquals("",board.getCell(row,column),Board.Cell.EMPTY);
			}
		}// test if the board is empty
		assertEquals("", board.getTurn(),'S'); // should be blue player's turn
	}
	//AC 3.1 < invalid row index>
	@Test
	public void testInvalidRow() {
		assertEquals("", board.getCell(4, 0), null);	
	}
	
	//AC 3.2 <invalid column index>
	@Test
	public void testInvalidColumn() {
		assertEquals("", board.getCell(0, 4), null);
	}
	
	// acceptance criterion 2.1
	@Test 
	public void testGameModeChoice() {
		assertEquals("", board.getGameMode(), "simple_mode");
		assertEquals("", board.getTurn(), 'S');
	}
}
