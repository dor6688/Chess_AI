import java.util.ArrayList;
import java.util.List;

public class Board {

    public Piece[][] board;
    public List<Piece> blackPiece;
    public List<Piece> whitePiece;

    public Board(){
        blackPiece = new ArrayList<>();
        whitePiece = new ArrayList<>();
        board = new Piece[8][8];
        for(int i=0;i<8;i++){
            this.board[i] = new Piece[8];
            for(int j=0;j<8;j++){
                this.board[i][j] = new Empty('e', i,j,0);
            }
        }
    }

    public void initializeBoard(){
        initPawns();
        initKnight();
        initBishop();
        initRock();
        initQueen();
        initKing();
        for (Piece p : blackPiece){
            board[p.row][p.col] = p;
        }
        for (Piece p : whitePiece){
            board[p.row][p.col] = p;
        }
    }

    private void initPawns(){
        Piece pawn1B = new Pawn('b',1,0,1);
        Piece pawn2B = new Pawn('b',1,1,1);
        Piece pawn3B = new Pawn('b',1,2,1);
        Piece pawn4B = new Pawn('b',1,3,1);
        Piece pawn5B = new Pawn('b',1,4,1);
        Piece pawn6B = new Pawn('b',1,5,1);
        Piece pawn7B = new Pawn('b',1,6,1);
        Piece pawn8B = new Pawn('b',1,7,1);

        blackPiece.add(pawn1B);
        blackPiece.add(pawn2B);
        blackPiece.add(pawn3B);
        blackPiece.add(pawn4B);
        blackPiece.add(pawn5B);
        blackPiece.add(pawn6B);
        blackPiece.add(pawn7B);
        blackPiece.add(pawn8B);

        Piece pawn1W = new Pawn('w',6,0, 1);
        Piece pawn2W = new Pawn('w',6,1, 1);
        Piece pawn3W = new Pawn('w',6,2, 1);
        Piece pawn4W = new Pawn('w',6,3, 1);
        Piece pawn5W = new Pawn('w',6,4, 1);
        Piece pawn6W = new Pawn('w',6,5, 1);
        Piece pawn7W = new Pawn('w',6,6, 1);
        Piece pawn8W = new Pawn('w',6,7, 1);

        whitePiece.add(pawn1W);
        whitePiece.add(pawn2W);
        whitePiece.add(pawn3W);
        whitePiece.add(pawn4W);
        whitePiece.add(pawn5W);
        whitePiece.add(pawn6W);
        whitePiece.add(pawn7W);
        whitePiece.add(pawn8W);
    }
    private void initKnight(){
        Piece knight1B = new Knight('b',0,1,4);
        Piece knight2B = new Knight('b',0,6,4);

        blackPiece.add(knight1B);
        blackPiece.add(knight2B);

        Piece knight1W = new Knight('w',7,1,4);
        Piece knight2W = new Knight('w',7,6,4);

        whitePiece.add(knight1W);
        whitePiece.add(knight2W);
    }
    private void initBishop(){
        Piece bishop1B = new Bishop('b',0,2,3);
        Piece bishop2B = new Bishop('b',0,5,3);

        blackPiece.add(bishop1B);
        blackPiece.add(bishop2B);

        Piece bishop1W = new Bishop('w',7,2,3);
        Piece bishop2W = new Bishop('w',7,5,3);

        whitePiece.add(bishop1W);
        whitePiece.add(bishop2W);
    }
    private void initRock(){
        Piece rock1B = new Rock('b',0,0,5);
        Piece rock2B = new Rock('b',0,7,5);

        blackPiece.add(rock1B);
        blackPiece.add(rock2B);

        Piece rock1W = new Rock('w',7,0,5);
        Piece rock2W = new Rock('w',7,7,5);

        whitePiece.add(rock1W);
        whitePiece.add(rock2W);
    }
    private void initQueen(){
        Piece queen1B = new Queen('b',0,3,8);
        blackPiece.add(queen1B);

        Piece queen1W = new Queen('w',7,3,8);
        whitePiece.add(queen1W);
    }
    private void initKing(){
        Piece king1B = new King('b',0,4,9);
        blackPiece.add(king1B);

        Piece king1W = new King('w',7,4,9);
        whitePiece.add(king1W);
    }

    public void printBoard(){
        for(int i=0;i<8;i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("["+board[i][j]+"]");
            }
            System.out.println();
        }
    }
}
