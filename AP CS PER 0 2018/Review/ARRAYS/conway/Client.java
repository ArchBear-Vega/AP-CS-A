package ARRAYS.conway;

public class Client {
	public static void main(String[] args) {
		Life game = new Life();

		game.fillBoard();
		int i = 0;
		game.display(i);
		System.out.println(game.getLiveNeighbors(1,5));
		for(int j = 0; j < 5; j++) {
			game.update();
			game.display(j+1);
			System.out.println();
		}

	}
}
