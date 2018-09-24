package me.robots;

import kareltherobot.Directions;
import kareltherobot.World;

public class CarpetRoom implements Directions {

	private static int beepers = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carpeter c = new Carpeter(1, 1, East, beepers);

		for (int count = 0; count < beepers; count++) {
			c.move();
			if (c.isRoom()) {
				c.putBeeper();
			}
			c.exitRoom();

		}

		c.turnOff();

	}

	static {
		World.reset();
		World.readWorld("Lab04");
		World.setDelay(3);
		World.setVisible();
	}
}
