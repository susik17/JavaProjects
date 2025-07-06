
public class LaunchGame {

	public static void main(String[] args) {
		TicTacToe t = new TicTacToe();
		HumanPlayer p1 = new HumanPlayer("Alice",'X');
		AIPlayer p2 = new AIPlayer("AI",'O');
		Player cp;
		cp = p1;
		while(true) {
			System.out.println(cp.name+" turn");
			cp.makeMove();
			t.DisplayBoard();
			if(TicTacToe.checkColWin() || TicTacToe.checkRowWin() || TicTacToe.checkDiagonalWin()) {
				System.out.println(cp.name+" has Won");
				break;
			}
			else if(TicTacToe.checkDraw()) {
				System.out.println("Game is Draw");
			}
			else {
				if(cp == p1) {
					cp = p2;
				}
				else {
					cp = p1;
				}
				
			}
			
		}		

	}

}
