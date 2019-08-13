import java.util.ArrayList;
import java.util.List;

public abstract class RandomPlayer extends Player {

    public List<Move>allPossibleMoves;

    public RandomPlayer(List<Piece> pieces, Board board) {
        super(pieces, board);
    }

    public Move chooseMove() {
        this.allPossibleMoves = new ArrayList<>();
        if (!inChess) {
            for (Piece piece : this.piecesPlayer) {
                allPossibleMoves.addAll(piece.getAllPieceMoves());
            }
            int random = (int) (Math.random() * allPossibleMoves.size());
//            Move tmp = allPossibleMoves.get(random);
//            while (!board.isEmpty(tmp.toRow, tmp.toCol)) { // check there is not make a chess !
//                random = (int) (Math.random() * allPossibleMoves.size());
//                tmp = allPossibleMoves.get(random);
//            }
            return allPossibleMoves.get(random);

        }
        // in chess so he need to protect the king
        else{
            return null;
        }
    }
}
