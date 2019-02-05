package ARRAYS.conway;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Life {
	private String[][] board;

	public Life() {
		board = new String[20][20];

	}

	public void fillBoard() {
		try {
			File inFile = new File("C:\\Users\\vega1\\git\\AP-CS-A\\AP CS PER 0 2018\\Review\\ARRAYS\\conway\\life.txt");
			Scanner sc = new Scanner(inFile);
			while (sc.hasNext()) {
				int row = sc.nextInt();
				int column = sc.nextInt();
				board[row - 1][column - 1] = "X";
			}

			sc.close();
		}

		catch (FileNotFoundException fnf) {
			System.out.println("Input File not Found: " + fnf.getMessage());
		}

	}

	public void update() {
		String[][] boardNew = new String[20][20];

		for (int i = 0; i < boardNew.length; i++) {
			for (int j = 0; j < boardNew[0].length; j++) {

				if (isAlive(board[i][j])) {
					if (getLiveNeighbors(i, j) > 3) {
						boardNew[i][j] = null;
					} else if (getLiveNeighbors(i, j) < 2) {
						boardNew[i][j] = null;
					} else {
						boardNew[i][j] = board[i][j];
					}
				} else {
					if (getLiveNeighbors(i, j) == 3) {
						boardNew[i][j] = "X";
					} else {
						boardNew[i][j] = null;
					}
				}

			}
		}

		board = boardNew;

	}

	public int getLiveNeighbors(int i, int j) {
		int count = 0;
		for (int x = -1; x <= 1; x++) {
			for (int y = -1; y <= 1; y++) {
				if (onBoard(x + i, y + j)) {
					if(isAlive(board[x+i][y+j])) {
						count++;
					} 

				}
			}
		}
		return board[i][j] == null ? count : count - 1;
		
	}

	public boolean isAlive(String string) {
		return string != null;
	}

	public void display(int value) {

		System.out.println("Gen " + value + ": Number of Bacteria --" + getLiveBacteria());

		System.out.println(" 12345678901234567890");
		int num = 1;
		for (String[] c : board) {
			System.out.print(num);

			for (String e : c) {
				if (e == null) {
					System.out.print(" ");
				} else {
					System.out.print(e);
				}
			}
			num++;
			if (num >= 10) {
				num = 0;
			}
			System.out.println();
		}

		System.out.println("Bacteria in 10th row:" + getLiveBacteria(10, false));
		System.out.println("Bacteria in 10th column:" + getLiveBacteria(9, true));
	}

	private int getLiveBacteria() {
		int count = 0;
		for (String[] c : board) {
			for (String e : c) {
				if (e != null) {
					count++;
				}
			}
		}
		return count;
	}

	private int getLiveBacteria(int rc, boolean isColumn) {
		int count = 0;
		if (isColumn) {
			for (int i = 0; i < board.length; i++) {
				if (board[i][rc] != null) {
					count++;
				}
			}

		} else {

			String[] row = board[rc - 1];
			for (String e : row) {
				if (e != null) {
					count++;
				}
			}

		}
		return count;
	}

	public boolean onBoard(int x, int y) {
		if ((x < board.length && x >= 0) && (y < board[0].length && y >= 0)) {
			return true;
		} else {
			return false;
		}
	}

}
