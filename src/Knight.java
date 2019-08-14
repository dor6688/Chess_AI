import java.util.ArrayList;

public class Knight extends Piece {
    public Knight(char pieceColor, int pieceRow, int pieceCol, int pieceValue, Board board) {
        super(pieceColor, pieceRow, pieceCol, pieceValue, board);
    }

    @Override
    protected void allPossibleMoves() {
        moves = new ArrayList<>();
        // row+2, col+1
        checkKnightMove(row+2,col+1);
        // row+2, col-1
        checkKnightMove(row+2,col-1);
        // row+1, col+2
        checkKnightMove(row+1,col+2);
        // row+1, col-2
        checkKnightMove(row+1,col-2);
        // row-2, col+1
        checkKnightMove(row-2,col+1);
        // row-2, col-1
        checkKnightMove(row-2,col-1);
        // row-1, col+2
        checkKnightMove(row-1,col+2);
        // row-1, col-2
        checkKnightMove(row-1,col-2);
    }

    private void checkKnightMove(int checkRow, int checkCol){
        Move newMove;
        if (checkMove(checkRow,checkCol)){
            if (board.isEmpty(checkRow,checkCol)){
                newMove = new SimpleMove(row, col, checkRow, checkCol, this);
                moves.add(newMove);
            }
            if (board.isEnemy(checkRow,checkCol,color)){
                newMove = new EatMove(row, col, checkRow, checkCol, this, board.getPiece(checkRow, checkCol));
                moves.add(newMove);
            }
        }
    }
}
