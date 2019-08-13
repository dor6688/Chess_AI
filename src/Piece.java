import java.util.ArrayList;
import java.util.List;

public abstract class Piece {

    public char color;
    public int row;
    public int col;
    public int value;
    public boolean alive;
    protected List<Move>moves;

    public Piece(char pieceColor, int pieceRow, int pieceCol, int pieceValue){
        this.color = pieceColor;
        this.row = pieceRow;
        this.col = pieceCol;
        this.value = pieceValue;
        this.moves = new ArrayList<>();
        this.alive = true;
    }

    public List<Move> getAllPieceMoves(){
        allPossibleMoves();
        return moves;
    }

    protected abstract void allPossibleMoves();

    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Piece p = (Piece) obj;
        return this.row == p.row && this.col == p.col && this.color == p.color && this.value == p.value;
    }

    public String toString(){
        return value+""+color;
    }

}
