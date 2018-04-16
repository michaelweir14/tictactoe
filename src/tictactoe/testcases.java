package tictactoe;



import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;


class testcases {
        @Test
        public void testSetX() {
            Space cell = new Space(false, false, false);
            cell.setX(true);
            assertTrue(cell.isX() == true);
        }
        @Test
        public void testsetExposed() {
            Space cell = new Space(false, false, false);
            cell.setExposed(true);
            assertTrue(cell.isExposed() == true);
        }
        @Test
        public void testSetO() {
            Space cell = new Space(false, false, false);
            cell.setO(true);
            assertTrue(cell.isO() == true);
        }
        @Test
        public void testGetCell() {
            TTCgame game = new TTCgame();
            game.getCell(1,1);
            assertTrue(game.getCell(1, 1) == game.getCell(1, 1));
        }
        @Test
        public void testReset() {
            TTCgame game = new TTCgame();
            Space cell = new Space(false,false,false);
            cell.setExposed(true);
            game.resetGame();
            game.checkWin();
            assertTrue(game.checkWin() == false);
        }
        @Test
        public void ORowWin() {
            TTCgame test = new TTCgame();
            Space[][] board = new Space[3][3];
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    board[row][col] = new Space(false, false, false);
                }
            }
            test.getCell(2, 0).setO(true);
            test.getCell(2, 1).setO(true);
            test.getCell(2, 2).setO(true);

            test.checkWin();
            assertTrue(test.getWinsO() >= 1);
        }
        @Test
        public void ORowWin2() {
            TTCgame test = new TTCgame();
            Space[][] board = new Space[3][3];
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    board[row][col] = new Space(false, false, false);
                }
            }
            test.getCell(1, 0).setO(true);
            test.getCell(1, 1).setO(true);
            test.getCell(1, 2).setO(true);

            test.checkWin();
            assertTrue(test.getWinsO() >= 1);
        }
        @Test
        public void ORowWin3() {
            TTCgame test = new TTCgame();
            Space[][] board = new Space[3][3];
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    board[row][col] = new Space(false, false, false);
                }
            }
            test.getCell(0, 0).setO(true);
            test.getCell(0, 1).setO(true);
            test.getCell(0, 2).setO(true);

            test.checkWin();
            assertTrue(test.getWinsO() >= 1);
        }
        @Test
        public void OColumnWin(){
            TTCgame test = new TTCgame();
            Space[][] board = new Space[3][3];
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    board[row][col] = new Space(false, false, false);
                }
            }
            test.getCell(0, 2).setO(true);
            test.getCell(1, 2).setO(true);
            test.getCell(2, 2).setO(true);

            test.checkWin();
            assertTrue(test.getWinsO() >= 1);
        }
        @Test
        public void OColumnWin2(){
            TTCgame test = new TTCgame();
            Space[][] board = new Space[3][3];
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    board[row][col] = new Space(false, false, false);
                }
            }
            test.getCell(0, 1).setO(true);
            test.getCell(1, 1).setO(true);
            test.getCell(2, 1).setO(true);

            test.checkWin();
            assertTrue(test.getWinsO() >= 1);
        }
        @Test
        public void OColumnWin3(){
            TTCgame test = new TTCgame();
            Space[][] board = new Space[3][3];
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    board[row][col] = new Space(false, false, false);
                }
            }
            test.getCell(0, 0).setO(true);
            test.getCell(1, 0).setO(true);
            test.getCell(2, 0).setO(true);

            test.checkWin();
            assertTrue(test.getWinsO() >= 1);
        }
        @Test
        public void ODiagonalWins(){
            TTCgame test = new TTCgame();
            Space[][] board = new Space[3][3];
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    board[row][col] = new Space(false, false, false);
                }
            }
            test.getCell(0, 2).setO(true);
            test.getCell(1, 1).setO(true);
            test.getCell(2, 0).setO(true);

            test.checkWin();
            assertTrue(test.getWinsO() >= 1);
        }
        @Test
        public void ODiagonalWins2(){
            TTCgame test = new TTCgame();
            Space[][] board = new Space[3][3];
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    board[row][col] = new Space(false, false, false);
                }
            }
            test.getCell(0, 0).setO(true);
            test.getCell(1, 1).setO(true);
            test.getCell(2, 2).setO(true);

            test.checkWin();
            assertTrue(test.getWinsO() >= 1);
        }
        @Test
        public void XRowWin() {
            TTCgame test = new TTCgame();
            Space[][] board = new Space[3][3];
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    board[row][col] = new Space(false, false, false);
                }
            }
            test.getCell(2, 0).setX(true);
            test.getCell(2, 1).setX(true);
            test.getCell(2, 2).setX(true);

            test.checkWin();
            assertTrue(test.getWinsX() >= 1);
        }
        @Test
        public void XRowWin2() {
            TTCgame test = new TTCgame();
            Space[][] board = new Space[3][3];
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    board[row][col] = new Space(false, false, false);
                }
            }
            test.getCell(1, 0).setX(true);
            test.getCell(1, 1).setX(true);
            test.getCell(1, 2).setX(true);

            test.checkWin();
            assertTrue(test.getWinsX() >= 1);
        }
        @Test
        public void XRowWin3() {
            TTCgame test = new TTCgame();
            Space[][] board = new Space[3][3];
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    board[row][col] = new Space(false, false, false);
                }
            }
            test.getCell(0, 0).setX(true);
            test.getCell(0, 1).setX(true);
            test.getCell(0, 2).setX(true);

            test.checkWin();
            assertTrue(test.getWinsX() >= 1);
        }
        @Test
        public void XColumnWin(){
            TTCgame test = new TTCgame();
            Space[][] board = new Space[3][3];
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    board[row][col] = new Space(false, false, false);
                }
            }
            test.getCell(0, 2).setX(true);
            test.getCell(1, 2).setX(true);
            test.getCell(2, 2).setX(true);

            test.checkWin();
            assertTrue(test.getWinsX() >= 1);
        }
        @Test
        public void XColumnWin2(){
            TTCgame test = new TTCgame();
            Space[][] board = new Space[3][3];
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    board[row][col] = new Space(false, false, false);
                }
            }
            test.getCell(0, 1).setX(true);
            test.getCell(1, 1).setX(true);
            test.getCell(2, 1).setX(true);

            test.checkWin();
            assertTrue(test.getWinsX() >= 1);
        }
        @Test
        public void XColumnWin3(){
            TTCgame test = new TTCgame();
            Space[][] board = new Space[3][3];
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    board[row][col] = new Space(false, false, false);
                }
            }
            test.getCell(0, 0).setX(true);
            test.getCell(1, 0).setX(true);
            test.getCell(2, 0).setX(true);

            test.checkWin();
            assertTrue(test.getWinsX() >= 1);
        }
        @Test
        public void XDiagonalWins(){
            TTCgame test = new TTCgame();
            Space[][] board = new Space[3][3];
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    board[row][col] = new Space(false, false, false);
                }
            }
            test.getCell(0, 2).setX(true);
            test.getCell(1, 1).setX(true);
            test.getCell(2, 0).setX(true);

            test.checkWin();
            assertTrue(test.getWinsX() >= 1);
        }
        @Test
        public void XDiagonalWins2(){
            TTCgame test = new TTCgame();
            Space[][] board = new Space[3][3];
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    board[row][col] = new Space(false, false, false);
                }
            }
            test.getCell(0, 0).setX(true);
            test.getCell(1, 1).setX(true);
            test.getCell(2, 2).setX(true);

            test.checkWin();
            assertTrue(test.getWinsX() >= 1);
        }
    }
        



