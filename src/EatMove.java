public class EatMove extends Move {

    Piece dead;

    public EatMove(int fromR, int fromC, int toR, int toC, Piece pieceM, Piece dead) {
        super(fromR, fromC, toR, toC, pieceM);
        this.dead = dead;
    }
}
