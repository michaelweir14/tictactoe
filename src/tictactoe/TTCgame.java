package tictactoe;
import javax.swing.JOptionPane;

/**
 * This class creates the game and all instructions along with win conditions.
 * 
 * @author Michael Weir
 *
 */
public class TTCgame {
    /**
     * Main method to start the game, shows welcome messsage.
     * @param args arguement.
     */
    public static void main(final String[] args) {
        new TTCpanel();
        JOptionPane.showMessageDialog(null, "Welcome to Tic Tac Toe!"
                + " O goes First, Good Luck!");
        }
    /** Creates a 2D cell array to instantiate the board. */
	private Space[][] board;
    /** Number of wins for player X. */
	private int winsX = 0;
    /** Number of wins for player O. */
	private int winsO = 0;
	
    /**
     * Constructor that instantiates the board with new cells with all false boolean conditions.
     */

	public TTCgame() {

		board = new Space[3][3];
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				board[row][col] = new Space(false, false, false);
			}
		}
}
    /**
     * A getCell method that returns the currently selected cell.
     * @param row for cell row
     * @param col for cell column
     * @return the current cell
     */
	public Space getCell(final int row, final int col) {
		return board[row][col];
	}
    /**
     * A checkWin method to check if player O or player X have won the game.
     * @return true if the game has been won, false if not.
     */
	public boolean checkWin() {
		checkRowWinX();
		checkColumnWinX();
		checkDiagonalWinX();
		if (getWinsX() == 1) {
			JOptionPane.showMessageDialog(null, "X Wins!");
            resetGame();
			return true;
		
	 } else {
			checkRowWinO();
			checkColumnWinO();
			checkDiagonalWinO();
			if (getWinsO() == 1) {
				JOptionPane.showMessageDialog(null, "O Wins!");
                resetGame();
				return true;
			}
		}
		return false;
	}
	
    /**
     * Check's to see if X has won due to 3 in a row along a row of the board.
     */
	public void checkRowWinX() {
		if (board[0][0].isX() && board[0][1].isX() && board[0][2].isX()) {
			winsX = 1;
	}
		if (board[1][0].isX() && board[1][1].isX() && board[1][2].isX()) {
			winsX = 1;
	}
		if (board[2][0].isX() && board[2][1].isX() && board[2][2].isX()) {
			winsX = 1;
		}
	}
    /**
     * Check's to see if O has won due to 3 in a row along a row of the board.
     */
	public void checkRowWinO() {
		if (board[0][0].isO() && board[0][1].isO() && board[0][2].isO()) {
			winsO = 1;
	}
		if (board[1][0].isO() && board[1][1].isO() && board[1][2].isO()) {
			winsO = 1;
	}
		if (board[2][0].isO() && board[2][1].isO() && board[2][2].isO()) {
			winsO = 1;
		}
	}
    /**
     * Check's to see if X has won due to 3 in a row along a column of the board.
     */
	public void checkColumnWinX() {
		if (board[0][0].isX() && board[1][0].isX() && board[2][0].isX()) {
			winsX = 1;
	}
		if (board[0][1].isX() && board[1][1].isX() && board[2][1].isX()) {
			winsX = 1;
	}
		if (board[0][2].isX() && board[1][2].isX() && board[2][2].isX()) {
			winsX = 1;
		}
	}
    /**
     * Check's to see if O has won due to 3 in a row along a column of the board.
     */
	public void checkColumnWinO() {
		if (board[0][0].isO() && board[1][0].isO() && board[2][0].isO()) {
			winsO = 1;
	}
		if (board[0][1].isO() && board[1][1].isO() && board[2][1].isO()) {
			winsO = 1;
	}
		if (board[0][2].isO() && board[1][2].isO() && board[2][2].isO()) {
			winsO = 1;
		}
	}
    /**
     * Check's to see if X has won due to 3 in a row along a diagonal of the board.
     */
	public void checkDiagonalWinX() {
		if (board[0][0].isX() && board[1][1].isX() && board[2][2].isX()) {
			winsX = 1;
	}
		if (board[0][2].isX() && board[1][1].isX() && board[2][0].isX()) {
			winsX = 1;
	}
	}
    /**
     * Check's to see if O has won due to 3 in a row along a diagonal of the board.
     */
	public void checkDiagonalWinO() {
		if (board[0][0].isO() && board[1][1].isO() && board[2][2].isO()) {
			winsO = 1;
	}
		if (board[0][2].isO() && board[1][1].isO() && board[2][0].isO()) {
			winsO = 1;
	}
	}
	
    /**
     * Resets the game, called when a game has been won or a scratch game has happened.
     */
	public void resetGame() {
	        for (int row = 0; row < 3; row++) {
	            for (int col = 0; col < 3; col++) {
	                board[row][col] = new Space(false, false, false);
	                board[row][col].setExposed(false);
	                
	      //          new TTCpanel();
	                }
	            }
		
	}
    /**
     * Getter method to return number of X wins.
     * @return winsX (1 or 0).
     */
	public int getWinsX() {
	    return winsX;
	}
    /**
     * Getter method to return number of O wins.
     * @return winsO (1 or 0).
     */
	public int getWinsO() {
	    return winsO;
	}
}
