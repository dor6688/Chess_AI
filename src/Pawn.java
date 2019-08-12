public class Pawn extends Piece {

    public boolean firstMove;

    public Pawn(char pieceColor, int pieceRow, int pieceCol, int pieceValue) {
        super(pieceColor, pieceRow, pieceCol, pieceValue);
        this.firstMove = true;
    }

    @Override
    public void allPossibleMoves() {
        Move newMove;
        int dir = this.color == 'w' ? -1 : 1 ;
        int checkRow, checkCol;
        checkCol = col;
        // first move - can move 2 tile also
        if(firstMove){
            checkRow = row + dir*2;
            if(checkMove(checkRow, checkCol)){
                newMove = new SimpleMove(row, col, checkRow, checkCol, this);
                moves.add(newMove);
            }
        }
        checkRow = row + dir;
        if(checkMove(checkRow, checkCol)){
            newMove = new SimpleMove(row, col, checkRow, checkCol, this);
            moves.add(newMove);
        }
    }

    private boolean checkMove(int checkRow, int checkCol){
        if(checkRow < 0 || checkRow > 7 || checkCol < 0 || checkCol > 7) return false;

        return true;
    }
}
