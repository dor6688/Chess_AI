import java.util.ArrayList;

public class King extends Piece {
    public King(char pieceColor, int pieceRow, int pieceCol, int pieceValue, Board board) {
        super(pieceColor, pieceRow, pieceCol, pieceValue, board);
    }

    @Override
    protected void allPossibleMoves() {
        moves = new ArrayList<>();
        checkKingMove(row+1,col+1);
        checkKingMove(row+1,col);
        checkKingMove(row+1,col-1);
        checkKingMove(row,col+1);
        checkKingMove(row,col-1);
        checkKingMove(row-1,col+1);
        checkKingMove(row-1,col);
        checkKingMove(row-1,col-1);
    }

    private void checkKingMove(int checkRow, int checkCol){
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
