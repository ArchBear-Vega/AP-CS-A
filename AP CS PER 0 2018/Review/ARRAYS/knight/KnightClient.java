package ARRAYS.knight;


public class KnightClient {
	public static void main(String[] args) {

		Knight k = new Knight(0, 0);

		k.createBoard(8, 8);
		int value = 0;

		Move[] potentialMoves;


		while (value < 64) {
			try {
			potentialMoves = k.getMoves();
			
			System.out.println(potentialMoves[0]);
			
			Move m = k.getNextMove(potentialMoves);
			
			k.setValue(value);
			
			k.move(m);
			k.print();
			value++;
			} catch(NullPointerException e) {
				System.out.print(e.getStackTrace());
			}
			
		}
	}
}
