import java.util.Scanner;

public class Board {
	
	public enum Cell{EMPTY, S_PLACEMENT ,O_PLACEMENT}
	private static final int TOTALROWS =4; // total rows 
	private static final int TOTALCOLUMNS =4; // total columns
	private Cell[][] grid;
	private char turn;
	private String gameMode;
	
	public Board() { //constructor	
		grid = new Cell [TOTALROWS][TOTALCOLUMNS]; //initialization
		initBoard();
	}
	
	//initialize the game
	public void initBoard() {
		for(int row =0;row<TOTALROWS;row++) {
			for(int column=0;column<TOTALCOLUMNS;column++) {
				grid[row][column] = Cell.EMPTY;
			}
		}
		turn ='S'; 
		gameMode="simple_mode";	
	}
	
	public int getTotalRows() {
		return TOTALROWS;
	}
	
	public int getTotalColumns() {
		return TOTALCOLUMNS;
	}
	
	// return the content of that cell
	public Cell getCell(int row, int column) {
		if(row>=0 && row<TOTALROWS && column>=0 && column<TOTALCOLUMNS) {
			return grid[row][column];		
		}else {
			return null;
		}
	}
		
	// getTurn returns the current turn 
	public char getTurn() {
		return turn;
	}
		
	// getGameMode function returns the gameMode 
	public String getGameMode() {
		Scanner obj = new Scanner(System.in);
		System.out.println("Choose the game mode: ");
		String gameMode = obj.next();
		return gameMode;
	}
	
	// make A VALID move 
	public void makeMove(int row, int column) {
		if(row>=0 && row<TOTALROWS && column>=0 && column< TOTALCOLUMNS && grid[row][column]== Cell.EMPTY) {	
			grid[row][column]=(turn =='S')?Cell.S_PLACEMENT:Cell.O_PLACEMENT;
			turn=(turn == 'S')? 'O':'S'; 		
			
		}	
	}	
}


