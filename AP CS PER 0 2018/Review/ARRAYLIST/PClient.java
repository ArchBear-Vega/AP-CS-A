package ARRAYLIST;

public class PClient {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println("List " + (i + 1) + ": " + new Permutation(10, 1));
		}

	}
}

/* RUNS
List 1:  4 6 8 5 10 3 7 1 2 9
List 2:  10 9 3 2 7 4 5 6 1 8
List 3:  4 10 5 3 6 1 2 9 8 7
List 4:  9 1 7 5 8 2 10 4 6 3
List 5:  4 7 8 2 1 6 5 10 9 3
List 6:  9 6 10 3 7 1 8 4 5 2
List 7:  7 8 3 6 5 9 2 1 10 4
List 8:  1 7 10 8 3 6 2 4 9 5
List 9:  7 9 5 4 8 3 6 2 10 1
List 10:  9 4 1 2 5 3 7 6 8 10

List 1:  1 3 9 4 2 8 10 6 5 7
List 2:  9 5 10 4 3 7 8 1 2 6
List 3:  5 1 7 9 6 3 2 10 4 8
List 4:  9 10 7 5 1 4 6 8 3 2
List 5:  9 10 8 2 6 4 3 5 7 1
List 6:  10 7 6 2 9 4 1 8 3 5
List 7:  8 5 10 4 1 7 3 9 2 6
List 8:  2 9 1 8 10 3 4 6 5 7
List 9:  5 9 3 1 4 10 7 2 6 8
List 10:  5 4 3 2 6 7 1 8 9 10

List 1:  6 4 5 9 2 10 7 1 8 3
List 2:  8 9 10 1 2 4 3 6 7 5
List 3:  10 6 9 2 4 3 5 1 7 8
List 4:  5 6 9 7 8 4 3 1 10 2
List 5:  3 7 6 10 4 9 2 5 1 8
List 6:  6 8 5 3 2 10 9 7 4 1
List 7:  8 3 5 6 2 10 4 7 9 1
List 8:  6 4 7 10 3 1 5 2 8 9
List 9:  6 7 3 1 4 2 5 8 10 9
List 10:  9 4 10 8 6 5 1 3 2 7

*/
