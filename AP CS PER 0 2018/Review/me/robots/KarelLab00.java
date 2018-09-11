package me.robots;

import kareltherobot.*;


public class KarelLab00 implements Directions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UrRobot robot = new UrRobot(1,2, East , 1);
		
		robot.move();
		robot.turnLeft();
		robot.move();
		robot.move();
		turnRight(robot);
		robot.move();
		robot.turnLeft();
		robot.move();
		turnRight(robot);
		robot.move();
		robot.putBeeper();
		robot.move();
		turnRight(robot);
		robot.move();
		robot.turnLeft();
		robot.move();
		turnRight(robot);
		robot.move();
		robot.move();
		robot.turnLeft();
		robot.turnOff();
		
	}
	
	static {
		World.reset();
		World.setDelay(20);
		World.readWorld("Lab0.wld");
		World.setVisible();

	}
	
	public static void turnRight(UrRobot robot) {
		robot.turnLeft();
		robot.turnLeft();
		robot.turnLeft();
	}

}
