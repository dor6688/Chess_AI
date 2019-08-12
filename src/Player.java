import java.util.List;

public abstract class Player {

    public List<Piece>piecesPlayer;
    public boolean inChess;


    public Player(List<Piece>pieces){
        this.piecesPlayer = pieces;
        inChess = false;
    }

    public abstract Move chooseMove();
}
