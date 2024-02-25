package dto.creator;

public class BoardCreator {

    public static String printBoard(int rowsColumnsAmount) {
        StringBuilder board = new StringBuilder();
        board.append("-".repeat(rowsColumnsAmount * 2 + 1)).append("\n");
        for (int i = 0; i < rowsColumnsAmount; i++) {
            board.append("|");
            for (int j = 0; j < rowsColumnsAmount; j++) {
                board.append(" ");
                if (j < rowsColumnsAmount - 1) {
                    board.append("|");
                }
            }
            board.append("|\n");
            board.append("-".repeat(rowsColumnsAmount * 2 + 1));
            if (i <= (rowsColumnsAmount - 2)) board.append("\n");
        }
        return board.toString();
    }
}
