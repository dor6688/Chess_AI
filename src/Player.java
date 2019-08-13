import java.util.List;

public abstract class Player {

    public List<Piece>piecesPlayer;
    public boolean inChess;
    public Board board;


    public Player(List<Piece>pieces, Board board){
        this.piecesPlayer = pieces;
        this.inChess = false;
        this.board = board;
    }

    public abstract Move chooseMove();

    public void movePiece(Move move) {
        Piece currentPiece = null;
        for (Piece piece : piecesPlayer) {
            if (piece.equals(move.piece)) {
                currentPiece = move.piece;
                break;
            }
        }

        if (move instanceof SimpleMove) {
            int[] oldPiece = {currentPiece.row, currentPiece.col};
            currentPiece.row = move.toRow;
            currentPiece.col = move.toCol;
            if (currentPiece instanceof Pawn) {
                ((Pawn) currentPiece).firstMove = false;
            }
            board.updateMove(oldPiece, currentPiece, null);
        }

        if(move instanceof MovePawnToEnd){
            Piece newQueen = ((MovePawnToEnd) move).getQueen();

        }
    }
}
