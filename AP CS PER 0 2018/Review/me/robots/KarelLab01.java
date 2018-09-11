package me.robots;

import kareltherobot.*;
public class KarelLab01 implements Directions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UrRobot robot = new UrRobot(3, 5, North, 1);
		
		robot.turnLeft();
		robot.turnLeft();
		robot.turnLeft();
		robot.move();
		turnLeftMove(robot);
		turnLeftMove(robot);
		turnRightMove(robot);
		turnRightMove(robot);
		turnRightMove(robot);
		turnRightMove(robot);
		turnLeftMove(robot);
		robot.turnLeft();
		robot.move();
		robot.turnLeft();
		robot.turnOff();
	}
	
	public static void turnLeftMove(UrRobot robot) {
		robot.turnLeft();
		robot.move();
		robot.move();
	}
	
	public static void turnRightMove(UrRobot robot) {
		robot.turnLeft();
		robot.turnLeft();
		robot.turnLeft();
		robot.move();
		robot.move();
	}
	
	static {
		World.reset();
		World.setDelay(20);
		World.readWorld("Lab1.wld");
		World.setVisible(true);
	}

}
