public class Game {

    public static void main(String[] args) {
        System.out.println("Start create Board");
        Board board = new Board();
        board.initializeBoard();
        board.printBoard();
        System.out.println("Done Created Board");

        Player p1 = new WhitePlayer(board.whitePiece);
        Player p2 = new WhitePlayer(board.blackPiece);
        Move tmp = p1.chooseMove();
        int x = 4;
    }

}
