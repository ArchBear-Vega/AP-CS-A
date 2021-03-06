package ARRAYS.knight;

public class Knight {
	private int x;
	private int y;

	private final Move[] moves = { new Move(-2, 1), new Move(-2, -1), new Move(2, -1), new Move(2, 1), new Move(-1, 2),
			new Move(-1, -2), new Move(1, 2), new Move(1, -2) };
	private int[][] board;

	public Knight(int x, int y) {
		this.setX(x);
		this.setY(y);

	}

	public int getNumberOfMoves() {
		int count = 0;
		for (Move m : moves) {
			if (onBoard(m.getX() + getX(), m.getY() + getY())) {
				count++;
			}
		}
		return count;
	}

	public int getNumberOfMoves(int x, int y) {
		int count = 0;
		for (Move m : moves) {
			if (onBoard(m.getX() + x, m.getY() + y)) {
				count++;
			}
		}
		return count;
	}

	public Move[] getMoves() {
		Move[] m = new Move[getNumberOfMoves()];
		int index2 = 0;
		for (int i = 0; i < moves.length; i++) {
			if (onBoard(moves[i].getX() + getX(), moves[i].getY() + getY())) {
				m[index2] = moves[i];
				index2++;

			}
		}
		return m;
	}

	public Move getNextMove(Move[] potentialMoves, boolean random) {
		if (!random) {
			int[] array = new int[potentialMoves.length];
			int i = 0;
			int index = 0;
			for (Move m : potentialMoves) {
				array[i] = getNumberOfMoves(getX() + m.getX(), getY() + m.getY());
				i++;
			}
			int val = array[0];
			for (int j = 0; j < array.length; j++) {
				if (val > array[j]) {
					val = array[j];
				}
			}

			for (int k = 0; k < array.length; k++) {
				if (array[k] == val) {
					index = k;
				}
			}
			return potentialMoves[index];
		} else {

			int i = (int) (Math.random() * potentialMoves.length);
			System.out.println(potentialMoves.length);

			return potentialMoves.length == 0 ? new Move(0, 0) : potentialMoves[i];
		}
	}

	public void move(Move m) {
		setX(getX() + m.getX());
		setY(getY() + m.getY());
	}

	public void setValue(int num) {
		board[getX()][getY()] = num;
	}

	public void print() {
		for (int[] r : board) {
			for (int e : r) {
				if(e < 10) {
					System.out.print("0"+ e + " ");
					
				} else {
					System.out.print(e + " ");
				}
				
			}
			System.out.println();
		}
	}

	public boolean onBoard(int x, int y) {
		if ((x < board.length && x >= 0) && (y < board[0].length && y >= 0) && board[x][y] == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void createBoard(int row, int column) {
		board = new int[row][column];
	}

	public int[][] getBoard() {
		return board;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

}
