package me.robots;

import kareltherobot.Directions;
import kareltherobot.World;

public class WalkMaze implements Directions {

	public static void main(String[] args) {

		MazeWalker m = new MazeWalker(5, 5, North, 0);
		
		m.followWallRight();
		m.turnOff(); 
	}
	static {
		World.readWorld("Lab05.wld");
		World.setVisible();
	}

}
