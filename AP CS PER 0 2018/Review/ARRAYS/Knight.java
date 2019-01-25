package ARRAYS;

public class Knight {
	private int x;
	private int y;
	
	public static final int[][] moves = {{+1, +2, +2, +1, -1, -2, -2, -1},  {-2, -1, +1, +2, +2, +1, -1, -2}};
	
	
	public Knight(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	private void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	private void setY(int y) {
		this.y = y;
	}
	
	public void move() {
		
	}
	
	public void move(int x, int y) {
		
	}
	
	public void move(Move m) {
		
	}
	
	public boolean canMove() {
		
	}
}
