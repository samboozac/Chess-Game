package Pieces;
import Game.*;

public abstract class Piece {

    public int x, y;
    public Player player;

    // Constructor for a piece
    public Piece(int x, int y, Player player) {
        this.x = x;
        this.y = y;
        this.player = player;
    }
}
