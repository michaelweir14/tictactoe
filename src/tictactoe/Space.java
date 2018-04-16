package tictactoe;
/**
 * 
 * All values and booleans instantiated.
 *
 */
public class Space {
 /** If cell is exposed. */
private boolean isExposed;
/** If cell is an X. */
private boolean isX;
/** If cell is an O. */
private boolean isO;
/**
 * Constructor that instantiates a cell's current state.
 * 
 * @param isO if cell is O.
 * @param isX if cell is X.
 * @param isExposed if the cell is exposed.
 */ 
public Space(final boolean isO, final boolean isX, final boolean isExposed) {
    this.isO = isO;
    this.isX = isX;
    this.isExposed = isExposed;

}
/**
 * sets the current cell as exposed.
 * 
 * @param isExposed if the cell is exposed.
 */
public void setExposed(final boolean isExposed) {
    this.isExposed = isExposed;
}
/**
 * checks to see if the cell is exposed.
 * 
 * @return isExposed exposed value.
 */
public boolean isExposed() {
    return isExposed;
}
/**
 * sets the cell as an X.
 * 
 * @param isX sets cell as X.
 */
public void setX(final boolean isX) {
    this.isX = isX;
}
/**
 * checks to see if the cell is an X.
 * 
 * @return isX checks if cell is X.
 */
public boolean isX() {
    return isX;

}
/**
 * Sets the cell as an O.
 * 
 * @param isO sets cell as O.
 */
public void setO(final boolean isO) {
    this.isO = isO;
}
/**
 * checks to see if the cell is an O.
 * 
 * @return isO checks cells state as O.
 */
public boolean isO() {
    return isO; 
}
}
