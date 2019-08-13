public class Game {

    public static void main(String[] args) {
        System.out.println("Start create Board");
        Board board = new Board();
        board.initializeBoard();
        board.printBoard();
        System.out.println("Done Created Board");

        Player p1 = new WhitePlayer(board.whitePiece, board);
        Player p2 = new BlackPlayer(board.blackPiece, board);

        Move move;
        int counter = 1;
        boolean whiteMove = true;
        while(true){
            // white move
            if (whiteMove) {
                move = p1.chooseMove();
                p1.movePiece(move);
                whiteMove = false;
            }
            // black move
            else {
                move = p2.chooseMove();
                p2.movePiece(move);
                whiteMove = true;
            }
            System.out.println("Move "+counter++);
            board.printBoard();
            System.out.println();
        }

    }

}
