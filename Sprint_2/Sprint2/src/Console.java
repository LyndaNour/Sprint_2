import java.util.Scanner;

public class Console {
	private Board board;

	public Console(Board board) {
		this.board = board;
	}
	
	public void displayBoard() {
		for(int row=0;row<board.getTotalRows();row++) {
			System.out.println("---------");
			System.out.print("|"+ symbol(board.getCell(row, 0)));
			System.out.print("|"+ symbol(board.getCell(row, 1)));
			System.out.print("|"+ symbol(board.getCell(row, 2)));
			System.out.print("|"+ symbol(board.getCell(row, 3)));
			System.out.println("|");
		}
		System.out.println("---------");
	}
	
	private static char symbol(Board.Cell cell) {
		if(cell == Board.Cell.S_PLACEMENT) {
			return 'S';

		}
		else
			if(cell == Board.Cell.O_PLACEMENT) {
				return 'O';
			}else
				return ' ';
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to SOS Game !");
		new Console(new Board()).displayBoard();
		Board board = new Board();
		Scanner obj =new Scanner(System.in);
		
		board.getGameMode();
		boolean continueGame = true;		
		while(continueGame) {
		System.out.println("it's " + board.getTurn() +" turn");
		System.out.print("choose row to make a move: ");
		int row =obj.nextInt();
		System.out.print("choose column to make a move: ");
		int column =obj.nextInt();
		
		board.getCell(row, column); // check if row and column valid
		board.makeMove(row, column);
		new Console(board).displayBoard();
		
	}
	}
}
