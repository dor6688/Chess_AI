import java.util.ArrayList;

public class Pawn extends Piece {

    public boolean firstMove;

    public Pawn(char pieceColor, int pieceRow, int pieceCol, int pieceValue, Board board) {
        super(pieceColor, pieceRow, pieceCol, pieceValue, board);
        this.firstMove = true;
    }

    @Override
    public void allPossibleMoves() {
        moves = new ArrayList<>();
        Move newMove;
        int dir = this.color == 'w' ? -1 : 1 ;
        int checkRow, checkCol;
        checkCol = col;
        // first move - can move 2 tile also
        if(firstMove){
            checkRow = row + dir*2;
            if(checkMove(checkRow, checkCol) && board.isEmpty(checkRow, checkCol)){
                if(board.isEmpty(checkRow, checkCol)) {
                    newMove = new SimpleMove(row, col, checkRow, checkCol, this);
                    moves.add(newMove);
                }
            }
        }
        checkRow = row + dir;
        if(checkMove(checkRow, checkCol) && board.isEmpty(checkRow, checkCol)){
            if(checkRow == 0 || checkRow == 7){
                Piece newQueen = new Queen(color, checkRow, checkCol, 8, board); // update row and col to the queen here
                newMove = new MovePawnToEnd(row, col, checkRow, checkCol, this, newQueen);
            }else {
                newMove = new SimpleMove(row, col, checkRow, checkCol, this);
            }
            moves.add(newMove);
        }

        checkRow = row + dir;
        checkCol = col + 1;
        if(checkMove(checkRow, checkCol) && board.isEnemy(checkRow, checkCol, color)){
            newMove = new EatMove(row, col, checkRow, checkCol, this, board.getPiece(checkRow, checkCol));
            moves.add(newMove);
        }
        checkCol = col - 1;
        if(checkMove(checkRow, checkCol) && board.isEnemy(checkRow, checkCol, color)){
            newMove = new EatMove(row, col, checkRow, checkCol, this, board.getPiece(checkRow, checkCol));
            moves.add(newMove);
        }


    }
}
