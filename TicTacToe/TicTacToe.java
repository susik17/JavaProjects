
import java.util.Scanner;
import java.util.Random;
public class TicTacToe {
      static char[][] board;
      public TicTacToe() {
    	  board = new char[3][3];
    	  initBoard();
      }
      static void initBoard() {
    	  for(int i = 0;i<board.length;i++) {
    		  for(int j=0;j<board[i].length;j++) {
    			  board[i][j] = ' ';
    		  }
    		  
    	  }
      }
      void DisplayBoard() {
    	  System.out.println("-------------");
    	  for(int i = 0;i<board.length;i++) {
    		  System.out.print("| ");
    		  for(int j=0;j<board[i].length;j++) {
    			  System.out.print(board[i][j]+" | ");

    		  }
    		  System.out.println();
    		  System.out.println("-------------");
    		  
    	  }
    	  
      }
      static void PlaceBoard(int row,int col,char mark) {
    	  if(row>=0 && row<=2 && col>=0 && col<=2) {
    		  board[row][col] = mark;
    		  
    	  }
    	  else {
    		  System.out.println("Invalid position");
    	  }
    	  
      }
      static boolean checkColWin() {
    	  for(int j = 0;j<=2;j++) {
    		  if(board[0][j]!=' ' && board[0][j] == board[1][j] && board[1][j] == board[2][j] ) {
    			  return true;
    		  }
    	  }
    	  return false;
    	  
      }
      static boolean checkRowWin() {
    	  for(int i = 0;i <=2;i++) {
    		  if(board[i][0]!=' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2] ) {
    			  return true;
    		  }
    	  }
    	  return false;
    	  
      }
      static boolean checkDiagonalWin() {
    	  if(board[0][0]!=' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]
    			  ||board[0][2]!=' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0] ) {
    		  return true;
    	  }
    	  else {
    		  return false;
    	  }
      }
      static boolean checkDraw() {
    	  for(int i=0;i<=2;i++) {
    		  for(int j=0;j<=2;j++) {
    			  if(board[i][j] == ' ') {
    				  return false;
    			  }
    		  }
    	  }
    	  return true;
      }
	
}
abstract class Player{
	String name;
	Character mark;
	abstract void makeMove();
	boolean isValidMove(int row,int col) {
		if(row>=0 && row<=2 && col>=0 && col<=2) {
			if(TicTacToe.board[row][col]==' ') {
				return true;
			}
			
		}
		return false;
	}	
	
}
class HumanPlayer extends Player{
	Scanner scan = new Scanner(System.in);
	public HumanPlayer(String name,Character mark){
		this.name = name;
		this.mark = mark;
		
	}
	void makeMove() {
		int row,col;
		do {
		System.out.println("Enter row & column :");
		row = scan.nextInt();
		col = scan.nextInt();
		System.out.println("Invalid position");
		}while(!isValidMove(row,col));
		TicTacToe.PlaceBoard(row,col,mark);
     	
	}
	
	
}
class AIPlayer extends Player{
	Scanner scan = new Scanner(System.in);
	public AIPlayer(String name,Character mark){
		this.name = name;
		this.mark = mark;
		
	}
	void makeMove() {
		int row,col;
		Random r = new Random();
		do {
		row = r.nextInt(3);
		col = r.nextInt(3);
		}while(!isValidMove(row,col));
		TicTacToe.PlaceBoard(row,col,mark);
		
	}
	
}
