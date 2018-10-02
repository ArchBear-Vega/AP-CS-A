package me.robots;

import kareltherobot.Directions;
import kareltherobot.World;

public class MazeRunner implements Directions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MazeWalker thomas = new MazeWalker(3, 1, East, 0);
		while(!thomas.nextToABeeper()) {
			thomas.followWallRight();
		}
		thomas.pickBeeper();
		
		thomas.turnOff();
		System.out.print("THOMAS HAS SUCCESFULLY COMPLETED THE MAZE! WOO");
	}
	static {
		World.setDelay(1);
		World.setVisible();
		World.readWorld("Lab6.wld");
	}

}
