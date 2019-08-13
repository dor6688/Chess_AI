public class MovePawnToEnd extends Move {

    private Piece queen;

    public MovePawnToEnd(int fromR, int fromC, int toR, int toC, Piece oldPawn, Piece newQueen) {
        super(fromR, fromC, toR, toC, oldPawn);
        this.queen = newQueen;
    }

    public Piece getQueen(){
        return queen;
    }

}
