package edu.jsu.mcis;

import java.util.Scanner;

public class TicTacToeView {
    
    private final Scanner keyboard;
    
    /* CONSTRUCTOR */
	
    public TicTacToeView() {
        
        /* Initialize scanner (for console keyboard) */
        
        keyboard = new Scanner(System.in);
        
    }
	
    public TicTacToeMove getNextMove(boolean isXTurn) {
        
        /* Prompt the player to enter the row and the column of their next move.
           Return as a TicTacToeMove object. */
        
        System.out.println("Enter the row and column numbers, seperated by a space: ");
		
		
		int Myrow = keyboard.nextInt();
		
		int Mycol = keyboard.nextInt();
		
		if ((Myrow >= 0 && Mycol >= 0) && (Myrow <= 2 && Mycol <= 2)){
			TicTacToeMove Move = new TicTacToeMove(Myrow, Mycol);
				return Move;
        }
		else {
            showInputError();
            return getNextMove(isXTurn);
        }

    }

    public void showInputError() {

        System.out.println("Entered location is invalid, already marked, or out of bounds.");

    }

    public void showResult(String r) {

        System.out.println(r + "!");

    }
    
    public void showBoard(String board) {
        
        System.out.println("\n\n" + board);
        
    }
	
}
