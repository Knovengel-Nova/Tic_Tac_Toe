package Tic_Tac_Toe;

public class Player {
    private char playerMove;
    private int playerScore;


    public char getPlayerMove(){
        return this.playerMove;
    }

    public void setPlayerMove(char move){
        this.playerMove = move;
    }

    public int getPlayerScore(){
        return this.playerScore;
    }

    public void setPlayerScore(int score){
        this.playerScore = score;
    }

    Player(char c){
        this.playerMove = c;
    }
}