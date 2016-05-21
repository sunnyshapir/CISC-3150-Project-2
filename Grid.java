import java.awt.Font;
import java.util.concurrent.TimeUnit;

public class Grid {
	public static void displayGame (String board, String result) {
		drawG();
		drawBoard (board);
		printStatus(result);
		try {
			TimeUnit.SECONDS.sleep((long) 2.5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		StdDraw.clear();
	}
	
	public static void drawG () {
		StdDraw.setPenRadius();
		StdDraw.setPenColor();
		StdDraw.setScale(0,4);

		int[][] grid = new int [4][4];

		for (int x = 0; x < grid.length; x++)
		{
		  for (int y = 0; y < grid.length; y++)
		  {
		    grid[x][y] = 255;
		  }
		}

		for (int x = 0; x < grid.length; x++)
		{
		  for (int y = 0; y <grid.length; y++)
		  {
		    StdDraw.square(x, y, 1);
		  }
		}
	}
	public static void drawBoard (String board) {
		for (int i=1; i<board.length(); i++) {
			if (i==1 || i==2 || i==3 || i==4){
				if (board.charAt(i)=='O') {
					double y=3.5;
					if (i==1)
						drawO(.5, y);
					else if (i==2)
						drawO(1.5, y);
					else if (i==3)
						drawO(2.5, y);
					else if (i==4)
						drawO(3.5, y);
				}
				else if (board.charAt(i)=='X') {
					double y1=3.8, y2=3.2;
					if (i==1)
						drawX(.2, y1, .8, y2, .2, y2, .8, y1);
					else if (i==2)
						drawX(1.2, y1, 1.8, y2, 1.2, y2, 1.8, y1);
					else if (i==3)
						drawX(2.2, y1, 2.8, y2, 2.2, y2, 2.8, y1);
					else if (i==4)
						drawX(3.2, y1, 3.8, y2, 3.2, y2, 3.8, y1);
				}
				else if (board.charAt(i)=='T') {
					double y1=3.8, y2=3.2;
					if (i==1)
						drawT(.8, y1, .2, y1, .5, y1, .5, y2);
					else if (i==2)
						drawT(1.8, y1, 1.2, y1, 1.5, y1, 1.5, y2);
					else if (i==3)
						drawT(2.8, y1, 2.2, y1, 2.5, y1, 2.5, y2);
					else if (i==4)
						drawT(3.8, y1, 3.2, y1, 3.5, y1, 3.5, y2);
					}
				else if (board.charAt(i)=='.') {
					double y=3.5;
					if (i==1)
						drawDot (.5, y);
					else if (i==2)
						drawDot(1.5, y);
					else if (i==3)
						drawDot(2.5, y);
					else if (i==4)
						drawDot(3.5, y);
				}
				
			}
			if (i==5 || i==6 || i==7 || i==8){
				if (board.charAt(i)=='O') {
					double y=2.5;
					if (i==5)
						drawO(.5, y);
					else if (i==6)
						drawO(1.5, y);
					else if (i==7)
						drawO(2.5, y);
					else if (i==8)
						drawO(3.5, y);
				}
				else if (board.charAt(i)=='X') {
					double y1=2.2, y2=2.8;
					if (i==5)
						drawX(.2, y2, .8, y1, .2, y1, .8, y2);
					else if (i==6)
						drawX(1.2, y2, 1.8, y1, 1.2, y1, 1.8, y2);
					else if (i==7)
						drawX(2.2, y2, 2.8, y1, 2.8, y2, 2.2, y1);
					else if (i==8)
						drawX(3.2, y2, 3.8, y1, 3.8, y2, 3.2, y1);
				}
				else if (board.charAt(i)=='T') {
					double y1=2.8, y2=2.2;
					if (i==5)
						drawT(.8, y1, .2, y1, .5, y1, .5, y2);
					else if (i==6)
						drawT(1.8, y1, 1.2, y1, 1.5, y1, 1.5, y2);
					else if (i==7)
						drawT(2.8, y1, 2.2, y1, 2.5, y1, 2.5, y2);
					else if (i==8)
						drawT(3.8, y1, 3.2, y1, 3.5, y1, 3.5, y2);
					}
				else if (board.charAt(i)=='.') {
					double y=2.5;
					if (i==5)
						drawDot (.5, y);
					else if (i==6)
						drawDot(1.5, y);
					else if (i==7)
						drawDot(2.5, y);
					else if (i==8)
						drawDot(3.5, y);
				}
			}
			if (i==9 || i==10 || i==11 || i==12){
				if (board.charAt(i)=='O') {
					double y=1.5;
					if (i==9)
						drawO(.5, y);
					else if (i==10)
						drawO(1.5, y);
					else if (i==11)
						drawO(2.5, y);
					else if (i==12)
						drawO(3.5, y);
				}
				else if (board.charAt(i)=='X') {
					double y1=1.2, y2=1.8;
					if (i==9)
						drawX(.2, y2, .8, y1, .2, y1, .8, y2);
					else if (i==10)
						drawX(1.2, y2, 1.8, y1, 1.2, y1, 1.8, y2);
					else if (i==11)
						drawX(2.2, y2, 2.8, y1, 2.8, y2, 2.2, y1);
					else if (i==12)
						drawX(3.2, y2, 3.8, y1, 3.8, y2, 3.2, y1);
				}
				else if (board.charAt(i)=='T') {
					double y1=1.8, y2=1.2;
					if (i==9)
						drawT(.8, y1, .2, y1, .5, y1, .5, y2);
					else if (i==10)
						drawT(1.8, y1, 1.2, y1, 1.5, y1, 1.5, y2);
					else if (i==11)
						drawT(2.8, y1, 2.2, y1, 2.5, y1, 2.5, y2);
					else if (i==12)
						drawT(3.8, y1, 3.2, y1, 3.5, y1, 3.5, y2);
					}
				else if (board.charAt(i)=='.') {
					double y=1.5;
					if (i==9)
						drawDot (.5, y);
					else if (i==10)
						drawDot(1.5, y);
					else if (i==11)
						drawDot(2.5, y);
					else if (i==12)
						drawDot(3.5, y);
				}
			}
			if (i==13 || i==14 || i==15 || i==16){
				if (board.charAt(i)=='O') {
					double y=.5;
					if (i==13)
						drawO(.5, y);
					else if (i==14)
						drawO(1.5, y);
					else if (i==15)
						drawO(2.5, y);
					else if (i==16)
						drawO(3.5, y);
				}
				else if (board.charAt(i)=='X') {
					double y1=.2, y2=.8;
					if (i==13)
						drawX(.2, y2, .8, y1, .2, y1, .8, y2);
					else if (i==14)
						drawX(1.2, y2, 1.8, y1, 1.2, y1, 1.8, y2);
					else if (i==15)
						drawX(2.2, y2, 2.8, y1, 2.8, y2, 2.2, y1);
					else if (i==16)
						drawX(3.2, y2, 3.8, y1, 3.8, y2, 3.2, y1);
				}
				else if (board.charAt(i)=='T') {
					double y1=.8, y2=.2;
					if (i==13)
						drawT(.8, y1, .2, y1, .5, y1, .5, y2);
					else if (i==14)
						drawT(1.8, y1, 1.2, y1, 1.5, y1, 1.5, y2);
					else if (i==15)
						drawT(2.8, y1, 2.2, y1, 2.5, y1, 2.5, y2);
					else if (i==16)
						drawT(3.8, y1, 3.2, y1, 3.5, y1, 3.5, y2);
					}
				else if (board.charAt(i)=='.') {
					double y=.5;
					if (i==13)
						drawDot (.5, y);
					else if (i==14)
						drawDot(1.5, y);
					else if (i==15)
						drawDot(2.5, y);
					else if (i==16)
						drawDot(3.5, y);
				}
			}
			}
		}
	
	public static void drawO (double x, double y) {
		StdDraw.setPenRadius(0.025);
	    StdDraw.setPenColor(StdDraw.BOOK_BLUE);
		StdDraw.circle(x, y, .3);
	}
	public static void drawX (double x0, double y0, double x1, double y1, double x2, double y2,
			double x3, double y3) {
		StdDraw.setPenRadius(0.025);
	    StdDraw.setPenColor(StdDraw.PINK);
	    StdDraw.line(x0, y0, x1, y1);
		StdDraw.line(x2, y2, x3, y3);
	}
	public static void drawT (double x0, double y0, double x1, double y1, 
			double x2, double y2, double x3, double y3) {
		StdDraw.setPenRadius(0.025);
	    StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.line(x0, y0, x1, y1);
		StdDraw.line(x2, y2, x3, y3);
	}
	public static void drawDot (double x, double y) {
		StdDraw.setPenRadius(0.025);
	    StdDraw.setPenColor(StdDraw.DARK_GRAY);
		StdDraw.filledCircle(x, y, .1);
	}
	public static void printStatus (String s) {
		 Font font = new Font("Arial", Font.BOLD, 40);
		 StdDraw.setPenColor(StdDraw.RED);
		 StdDraw.setFont(font);
		 StdDraw.text(2, 2, s);
	}
	public static void endGame() {
		System.exit(0);
	}
}
