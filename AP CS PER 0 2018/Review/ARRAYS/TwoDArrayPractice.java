package ARRAYS;

public class TwoDArrayPractice {
	public static void main(String[] args) {
		int[][] mat1 = { { 7, 2, 9, 5 }, { 1, 4, 3, 9 }, { 6, 8, 4, 2 } };
		String[][] mat2 = { { "hello", "bye", "see ya" }, { "cat", "cat", "cat" }, { "cat", "dog", "fish" },
				{ "Burbank", "High", "School" } };
		
		printInTabularForm(mat1);
		System.out.println(countCat(mat2));
		System.out.println(sumSecondRow(mat1));
		System.out.println(sumFirstColumn(mat1));
		System.out.println(containsBurbank(mat2));
		System.out.println(containsRowOfSame(mat2));
		
	}

	// prints a 2D array of ints in a table format
	public static void printInTabularForm(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

	// return the number of times "cat" occurs in the array
	public static int countCat(String[][] mat) {
		int cats = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j].equals("cat")) {
					cats++;
				}
			}
		}
		return cats; // here to make code compile, remove when you write your code
	}

	// return the sum of the values in the second row
	// precondition: the array has at least 2 rows
	public static int sumSecondRow(int[][] mat) {
		int count = 0;
		for (int i = 0; i < mat[1].length; i++) {
			count += mat[1][i];
		}
		return count; // here to make code compile, remove when you write your code
	}

	// return the sum of the values in the first column
	// precondition: the array has at least 1 columns
	public static int sumFirstColumn(int[][] mat) {
		int count = 0;
		for(int i = 0; i < mat.length; i++) {
			count += mat[i][0];
		}
		return count; // here to make code compile, remove when you write your code
	}

	// returns true if "Burbank" occurs in mat, otherwise returns false
	public static boolean containsBurbank(String[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j].equals("Burbank")) {
					return true;
				}
			}
		}
		return false; // here to make code compile, remove when you write your code
	}

	// returns true if mat has a row where all the words are the same, otherwise
	// returns false
	public static boolean containsRowOfSame(String[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (j != 0 && mat[i][j].equals(mat[i][j-1])) {
					return true;
				}
			}
		}
		return false; 
	}

}
/*
####RUN
7 2 9 5
1 4 3 9
6 8 4 2
4
17
14
true
true
*/