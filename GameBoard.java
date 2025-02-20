package Tic_Tac_Toe;

public class GameBoard {
    private char[] pos = new char[9];

    GameBoard(){
        for(int i=0; i<9; i++){
            pos[i] = ' ';
        }
    }
}
