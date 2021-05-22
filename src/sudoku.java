public class sudoku {

    public int[][] board = {
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

    public int a0, a1, a2, a3, a4, a5, a6, a7, a8, b0, b1, b2, b3, b4, b5, b6, b7, b8, c0, c1, c2, c3, c4, c5, c6, c7, c8,
            d0, d1, d2, d3, d4, d5, d6, d7, d8, e0, e1, e2, e3, e4, e5, e6, e7, e8, f0, f1, f2, f3, f4, f5, f6, f7, f8,
            g0, g1, g2, g3, g4, g5, g6, g7, g8, h0, h1, h2, h3, h4, h5, h6, h7, h8, i0, i1, i2, i3, i4, i5, i6, i7, i8;

    public int[][] customBoard = {
            { a0, a1, a2, a3, a4, a5, a6, a7, a8 },
            { b0, b1, b2, b3, b4, b5, b6, b7, b8 },
            { c0, c1, c2, c3, c4, c5, c6, c7, c8 },
            { d0, d1, d2, d3, d4, d5, d6, d7, d8 },
            { e0, e1, e2, e3, e4, e5, e6, e7, e8 },
            { f0, f1, f2, f3, f4, f5, f6, f7, f8 },
            { g0, g1, g2, g3, g4, g5, g6, g7, g8 },
            { h0, h1, h2, h3, h4, h5, h6, h7, h8 },
            { i0, i1, i2, i3, i4, i5, i6, i7, i8 }
    };
    //sudoku board is a 9x9 board.
    public int boardDimension = 9;



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
                if (customBoard[row][col] == 0) {
                    for (int value = 1; value < boardDimension + 1; value++) {
                        if (isValid(customBoard, row, col, value)) {
                            customBoard[row][col] = value;
                            if (solve()) {
                                return true;
                            } else {
                                customBoard[row][col] = 0;
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
                System.out.print(" " + customBoard[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

}
