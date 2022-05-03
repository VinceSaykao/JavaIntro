public class Board {
    private final int MAX_ROWS;
    private final int MAX_COLS;
    private Pieces[][] gameboard;

    public Board(int max_rows, int max_cols) {

        this.MAX_ROWS = max_rows;
        this.MAX_COLS = max_cols;

        gameboard = new Pieces[MAX_ROWS][MAX_COLS];
    }

    public int getMaxRows() {
        return MAX_ROWS;
    }

    public int getMaxCols() {
        return MAX_COLS;
    }

    public void printBoard() {
        for (int row = 0; row < MAX_ROWS; row++) {
            for (int col = 0; col < MAX_COLS; col++) {
                
            }
        }

    }
}
