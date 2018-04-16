package tictactoe;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Creates and sets up the JPanel for the Mine sweeper game.
 * 
 */
public class TTCpanel {
    /** Creates new instance of Tic Tac Toe. */
	private TTCgame game = new TTCgame();
	/** Creates JFrame. */
	private JFrame frame = new JFrame("Tic Tac Toe");
	/** Jbutton 2D Array. */
	private JButton[][] buttons = new JButton[3][3];
	/** Container for Layout. */
	private Container grid = new Container();
	/** Amount of unexposed cells. */
	private int notExposed = 9;
	/** Turncount of players O and X. */
	private int turnCount = 1;

    /**
     * Creates GUI for board.
     */
	public TTCpanel() {
		frame.setSize(600, 600);
		frame.setLayout(new BorderLayout());
		// button grid
		grid.setLayout(new GridLayout(3, 3));

		for (int i = 0; i < buttons.length; i++) {
			for (int j = 0; j < buttons.length; j++) {
				buttons[i][j] = new JButton();
				buttons[i][j].addMouseListener(
				        new CustomMouseListener());

				grid.add(buttons[i][j]);
			}
		}
		frame.add(grid, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}	
    /**
     * 
     * Mouse listener for selecting cells when left clicked and sets cell icon.
     * Also keeps track of turncount and unexposed cells.
     *
     */
	class CustomMouseListener implements MouseListener {
        /**
         * Mouse pressed listener.
         * 
         * @param e event.
         */
		public void mousePressed(final MouseEvent e) {
			for (int x = 0; x < buttons.length; x++) {
				for (int y = 0; y < buttons[0].length; y++) {
					if (e.getSource().
					        equals(buttons[x][y])) {
						if (e.getButton() 
						        == MouseEvent.BUTTON1) {
						    if (!buttons[x][y].isEnabled()) {
						        return;
						    }
							if (turnCount % 2 == 0) {
								game.getCell(x, y).
								setExposed(true);
								game.getCell(x, y).
								setX(true);
								buttons[x][y].setIcon(
								new ImageIcon("C:\\Users\\michael\\"
								        + "git\\"
								        + "TicTacToe-350\\images"
								        + "\\player-x.png"));
								buttons[x][y].
								setEnabled(false);
								buttons[x][y].
								setDisabledIcon(new ImageIcon(
								"C:\\Users\\michael\\git\\"
								 + "TicTacToe-350\\images"
								 + "\\player-x.png"));

								game.getCell(x, y).
								setExposed(true);
								notExposed--;
								turnCount++;
								game.checkWin();
							
						 } else {
								game.getCell(x, y).
								setExposed(true);
								game.getCell(x, y).setO(true);
								buttons[x][y].setIcon(
								new ImageIcon("C:\\Users\\"
								 + "michael\\git\\TicTacToe-350\\"
								 + "images\\player-o.png"));
								buttons[x][y].setEnabled(false);
								buttons[x][y].setDisabledIcon(
								new ImageIcon("C:\\Users\\michael\\"
								+ "git\\TicTacToe-350\\images"
								+ "\\player-o.png"));
								game.getCell(x, y).
								setExposed(true);
								notExposed--;
								turnCount++;
								game.checkWin();
								
							}
							if (notExposed == 0 
							    && !game.checkWin()) {
								JOptionPane.showMessageDialog(
								null, "Scratch game! "
								+ "It's a draw!");
								game.
								resetGame();
							}
						}
					}
				}
			}
		}
		

		@Override
		public void mouseClicked(final MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(final MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(final MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(final MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}

} 
