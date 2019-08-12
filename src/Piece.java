import java.util.ArrayList;
import java.util.List;

public abstract class Piece {

    public char color;
    public int row;
    public int col;
    public int value;
    protected List<Move>moves;

    public Piece(char pieceColor, int pieceRow, int pieceCol, int pieceValue){
        this.color = pieceColor;
        this.row = pieceRow;
        this.col = pieceCol;
        this.value = pieceValue;
        this.moves = new ArrayList<>();
    }

    public List<Move> getAllPieceMoves(){
        allPossibleMoves();
        return moves;
    }

    protected abstract void allPossibleMoves();

    public String toString(){
        return value+""+color;
    }

}
