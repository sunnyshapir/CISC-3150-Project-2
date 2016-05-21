import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TicTacToeTomek {
	public static void main (String[] args) {
		char b[][] = new char [4][4]; 
		String boardstring="", result="";
		char r;
		Scanner in;
    		try
		{
        		in = new Scanner(new FileReader("A-small-practice.in"));    
		}
        	catch(FileNotFoundException String)
        	{
            		System.out.println("File doesn't exist");
            		return;
        	}
    	
		int n = in.nextInt();
		Grid g=new Grid ();
		for (int i=0; i<n; i++) {
			boardstring=inputBoard(in, b, boardstring);
			r = findWinner(b);
			result = getResult(r);
		    System.out.println("Case #"+(i+1)+": "+result);
		    g.displayGame(boardstring, result);
		}
		in.close();
		g.endGame();
	}
	
	public static String inputBoard (Scanner in, char[][] board, String s){
		s="S";
		for (int i=0; i<4; i++)
			for (int j=0; j<4; j++) {
				board[i][j]=in.next().charAt(0);
				char c=board[i][j];
				s+=c;
			}
		return s;
	}
	
	public static char findWinner (char[][] board) {
		boolean oWinner, xWinner, notComplete=false, draw=false; 
		oWinner=findMatch ('O', board[0][0], board[0][1], board[0][2], board[0][3]) ||
				findMatch ('O', board[1][0], board[1][1], board[1][2], board[1][3]) ||
				findMatch ('O', board[2][0], board[2][1], board[2][2], board[2][3]) ||
				findMatch ('O', board[3][0], board[3][1], board[3][2], board[3][3]) ||
				findMatch ('O', board[0][0], board[1][0], board[2][0], board[3][0]) ||
				findMatch ('O', board[1][1], board[2][1], board[3][1], board[0][1]) ||
				findMatch ('O', board[0][2], board[1][2], board[2][2], board[3][2]) ||
				findMatch ('O', board[0][3], board[1][3], board[2][3], board[3][3]) ||
				findMatch ('O', board[0][0], board[1][1], board[2][2], board[3][3]) ||
				findMatch ('O', board[0][3], board[2][1], board[1][2], board[3][0]);
		xWinner=findMatch ('X', board[0][0], board[0][1], board[0][2], board[0][3]) ||
				findMatch ('X', board[1][0], board[1][1], board[1][2], board[1][3]) ||
				findMatch ('X', board[2][0], board[2][1], board[2][2], board[2][3]) ||
				findMatch ('X', board[3][0], board[3][1], board[3][2], board[3][3]) ||
				findMatch ('X', board[0][0], board[1][0], board[2][0], board[3][0]) ||
				findMatch ('X', board[1][1], board[2][1], board[3][1], board[0][1]) ||
				findMatch ('X', board[0][2], board[1][2], board[2][2], board[3][2]) ||
				findMatch ('X', board[0][3], board[1][3], board[2][3], board[3][3]) ||
				findMatch ('X', board[0][0], board[1][1], board[2][2], board[3][3]) ||
				findMatch ('X', board[0][3], board[2][1], board[1][2], board[3][0]);
		if (!oWinner && !xWinner) {
			if (findDraw(board)) {
				draw=true; 
			}
			else 
				notComplete=true; 
		}
		
		if (oWinner)
			return 'O';
		else if (xWinner)
			return 'X';
		else if (draw)
			return 'D';
		else if (notComplete)
			return 'N';
		return 'T';
		
	}
	public static boolean findMatch (char testing, char one, char two, char three, char four)
	{
		if (one == testing || one == 'T')
			if (two == testing || two == 'T')
				if (three == testing || three == 'T')
					if (four == testing || four == 'T')
						return true; 
		return false; 
	}
	public static boolean findDraw (char[][] board) {
		for (int i=0; i<4; i++)
			for (int j=0; j<4; j++)
				if (board[i][j]=='.')
					return false;
		return true;
	}
	
	public static String getResult (char r) {
		if (r=='O')
			return "O Won";
		if (r=='X')
			return "X Won";
		if (r=='D')
			return "Draw";
		if (r=='N')
			return "Game has not completed";
		return null; 
	}
}
