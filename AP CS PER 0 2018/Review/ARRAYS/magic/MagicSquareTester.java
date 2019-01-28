package ARRAYS.magic;

public class MagicSquareTester {
	public static void main(String[] args) {

		int[][] square = {{ 16, 3, 2, 13 }, { 5, 10, 11, 8 }, { 9, 6, 7, 12 }, { 4, 15, 14, 1 } };

		
		System.out.println(isMagicSquare(square));
	}

	public static boolean isMagicSquare(int[][] square) {

		int n = sumRow(square[0]);
		// ROWS
		for (int[] row : square) {
			int total = sumRow(row);
			if (total != n)
				return false;
		}
		int sum = 0;
		// COLUMNS
		for (int i = 0; i < square.length; i++) {

			sum = 0;
			for (int j = 0; j < square.length; j++) {
				sum += square[j][i];
			}

			if (sum != n) {
				return false;
			}
		}
		// DIAGONAL MAJOR
		sum = 0;
		for (int i = 0; i < square.length; i++) {
			sum += square[i][i];
		}
		if (sum != n) {
			return false;
		}

		// DIAGONAL MINOR
		sum = 0;
		for (int i = 0; i < square.length; i++) {
			sum += square[i][square.length - 1 - i];
		}
		if (sum != n) {
			return false;
		}
		return true;
	}

	public static int sumRow(int[] row) {
		int sum = 0;
		for (int e : row) {
			sum += e;
		}
		return sum;
	}

}
