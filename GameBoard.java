package Tic_Tac_Toe;

public class GameBoard {
    private char[] pos = new char[9];

    Player xPlayer = new Player('X');
    Player oPlayer = new Player('O');

    public void display(){
        System.out.println(pos[0]+"\t|\t"+pos[1]+"\t|\t"+pos[2]);
        System.out.println(pos[3]+"\t|\t"+pos[4]+"\t|\t"+pos[5]);
        System.out.println(pos[6]+"\t|\t"+pos[7]+"\t|\t"+pos[8]);
        
    }

    GameBoard(){
        for(int i=0; i<9; i++){
            pos[i] = ' ';
        }
    }
}
