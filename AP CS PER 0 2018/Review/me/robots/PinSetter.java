package me.robots;

import kareltherobot.Directions;
import kareltherobot.World;

public class PinSetter implements Directions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MrRobot r = new MrRobot(1, 5, North, 10);
		
		r.turnLeft();
		r.sprint(4);
		r.turnRight();
		r.sprint(4);
		r.turnRight();
		r.sprintDrop(4, 1);
		r.uTurn(false);
		r.sprintDrop(3, 1);
		r.uTurn(true);
		r.sprintDrop(2, 1);
		r.uTurn(false);
		r.move();
		r.putBeeper();
		r.sprint(3);
		r.turnLeft();
		r.move();
		r.turnRight();
		r.move();
		r.turnRight();
		r.turnOff();
	}
	static {
		World.setVisible();
		World.setDelay(10);
	}
	

}
