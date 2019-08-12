public abstract class Move {

    private int fromRow;
    private int fromCol;
    private int toRow;
    private int toCol;
    private Piece piece;

    public Move(int fromR, int fromC, int toR, int toC, Piece pieceM){
        this.fromRow = fromR;
        this.fromCol = fromC;
        this.toRow = toR;
        this.toCol = toC;
        this.piece = pieceM;
    }

}
