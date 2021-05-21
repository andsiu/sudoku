public class sudoku {

    int[][] board = {
            { 8, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 3, 6, 0, 0, 0, 0, 0 },
            { 0, 7, 0, 0, 9, 0, 2, 0, 0 },
            { 0, 5, 0, 0, 0, 7, 0, 0, 0 },
            { 0, 0, 0, 0, 4, 5, 7, 0, 0 },
            { 0, 0, 0, 1, 0, 0, 0, 3, 0 },
            { 0, 0, 1, 0, 0, 0, 0, 6, 8 },
            { 0, 0, 8, 5, 0, 0, 0, 1, 0 },
            { 0, 9, 0, 0, 0, 0, 4, 0, 0 }
    };
    //sudoku board is a 9x9 board.
    int boardDimension = 9;

    public boolean isValid(int[][] board, int rowIndex, int columnIndex, int value) {
        return (!checkBox(board, rowIndex, columnIndex, value) &&
                !checkRow(board, rowIndex, value) &&
                !checkColumn(board, columnIndex, value));
    }

    public boolean checkBox(int[][] board, int rowIndex, int columnIndex, int value) {
        int row = rowIndex - (rowIndex % 3);
        int column = columnIndex - (columnIndex % 3);

        for (int i = row; i < row + 3; i++)
            for (int j = column; j < column + 3; j++) {
                if (board[i][j] == value)
                    return true;
            }

        return false;
    }

    public boolean checkRow(int[][] board, int rowIndex, int value) {
        for (int i = 0; i < boardDimension; i++ ) {
            if (board[rowIndex][i] == value)
                return true;
        }
        return false;
    }

    public boolean checkColumn(int[][] board, int columnIndex, int value) {
        for (int i = 0; i < boardDimension; i++ ) {
            if (board[i][columnIndex] == value)
                return true;
        }
        return false;
    }

    public boolean solve() {
        for (int row = 0; row < boardDimension; row++) {
            for (int col = 0; col < boardDimension; col++) {
                if (board[row][col] == 0) {
                    for (int value = 1; value < boardDimension + 1; value++) {
                        if (isValid(board, row, col, value)) {
                            board[row][col] = value;
                            if (solve()) {
                                return true;
                            } else {
                                board[row][col] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public void display() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(" " + board[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

}
