import java.util.ArrayList;
import java.util.List;

public abstract class RandomPlayer extends Player {

    public List<Move>allPossibleMoves;

    public RandomPlayer(List<Piece> pieces) {
        super(pieces);
    }

    public Move chooseMove() {
        this.allPossibleMoves = new ArrayList<>();
        for (Piece piece:this.piecesPlayer) {
            allPossibleMoves.addAll(piece.getAllPieceMoves());
        }
        int random = (int)(Math.random()*allPossibleMoves.size());
        return allPossibleMoves.get(random);
    }
}
