public abstract class Move {

    public int fromRow;
    public int fromCol;
    public int toRow;
    public int toCol;
    public Piece piece;

    public Move(int fromR, int fromC, int toR, int toC, Piece pieceM){
        this.fromRow = fromR;
        this.fromCol = fromC;
        this.toRow = toR;
        this.toCol = toC;
        this.piece = pieceM;
    }

}
