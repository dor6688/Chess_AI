import java.util.ArrayList;

public class Rock extends Piece {
    public Rock(char pieceColor, int pieceRow, int pieceCol, int pieceValue, Board board) {
        super(pieceColor, pieceRow, pieceCol, pieceValue, board);
    }

    @Override
    protected void allPossibleMoves() {
        moves = new ArrayList<>();
        int checkRow, checkCol;
        Move newMove;
        for (int i=-1; i<2; i+=2){
            checkRow = this.row + i;
            checkCol = this.col;
            while(checkMove(checkRow, checkCol) && board.isEmpty(checkRow, checkCol)){
                newMove = new SimpleMove(row, col, checkRow, checkCol, this);
                moves.add(newMove);
                checkRow += i;
            }
            // check here if can to eat here EatMove
            if(checkMove(checkRow, checkCol) && board.isEnemy(checkRow, checkCol, color)){
                newMove = new EatMove(row, col, checkRow, checkCol, this, board.getPiece(checkRow,checkCol));
                moves.add(newMove);
            }
        }
        for (int i=-1; i<2; i+=2){
            checkRow = this.row;
            checkCol = this.col + i;
            while(checkMove(checkRow, checkCol) && board.isEmpty(checkRow, checkCol)){
                newMove = new SimpleMove(row, col, checkRow, checkCol, this);
                moves.add(newMove);
                checkCol += i;
            }
            // check here if can to eat here EatMove
            if(checkMove(checkRow, checkCol) && board.isEnemy(checkRow, checkCol, color)){
                newMove = new EatMove(row, col, checkRow, checkCol, this, board.getPiece(checkRow,checkCol));
                moves.add(newMove);
            }
        }
    }
}
