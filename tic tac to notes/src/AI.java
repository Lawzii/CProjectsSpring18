import java.util.Random;

public class AI {
	
		static String[][] game = new String[3][3];
		
	public static void main(String[] args) {
		
		fillBoard();
		printBoard();
		System.out.println();
		System.out.println("The AI is going to play");
		aI();
		printBoard();
	}
	
	public static void fillBoard() {
		
		for (int row = 0; row < game.length; row++) {
			for (int col = 0; col < game[row].length; col++) {
				game[row][col] = "_";
				
			}
		}
	}
	
	public static void aI () {
		Random r = new Random();
		int row = r.nextInt(3);
		int col = r.nextInt(3);
		while (!checkBoard(row, col)) {
			 row = r.nextInt(3);
			 col = r.nextInt(3);
		}
			updateBoard(row, col);
	}
	
	public static boolean checkBoard(int row, int col) {
		if (game[row][col].equals("_")) {
			return true;
		}else {
			return false;
		}
		}
	
	public static void updateBoard (int row, int col) {
		game[row][col] = "X";
	}
	
	public static void printBoard() {
		for (int row = 0; row < game.length; row++) {
			System.out.println();
			for (int col = 0; col < game[row].length; col++) {
				game[row][col] = "_";
				System.out.print(game[row][col] + " | ");
				
				}
			}
		}
	}

