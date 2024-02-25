package dto.enums;

import dto.creator.BoardCreator;

public enum BoardType {
    BOARD_SIZE_5X5 {
        @Override
        public String toString() {
            return BoardCreator.printBoard(5);
        }
    },
    BOARD_SIZE_7X7 {
        @Override
        public String toString() {
            return BoardCreator.printBoard(7);
        }
    },
    BOARD_SIZE_10X10 {
        @Override
        public String toString() {
            return BoardCreator.printBoard(10);
        }
    }
}
