package ARRAYS.knight;


public class KnightClient {
	public static void main(String[] args) {

		Knight k = new Knight(0, 0);

		k.createBoard(8, 8);
		int value = 1;

		Move[] potentialMoves;

		while(value < 64) {
			potentialMoves = k.getMoves();
	
			Move m = k.getNextMove(potentialMoves, false);
			
			k.setValue(value);
			
			k.move(m);
			value++;
		}
		// The Knight has reached the last square, thus assign it 64
		k.setValue(value);
		k.print();
			

	}
}
