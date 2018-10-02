package me.robots;

import kareltherobot.Robot;

public class ReviewRobot extends Robot
{
   public ReviewRobot(int st, int av, Direction dir, int beep)
   {
      super(st, av, dir, beep);
   }
   
   public int countBeepers()
   {
      int b = 0;
      while(anyBeepersInBeeperBag()){
         putBeeper();
         b++;
      }
      int c = 0;
      while (c != b) {
         pickBeeper();
      	 c++;
      }
      return b;
   }
   
   public boolean backIsClear()
   {
      boolean isClear;
      turnLeft();
      turnLeft();
      isClear = frontIsClear();
      turnLeft();
      turnLeft();
      return isClear;
   }
   
   public void jump()
   {
      while(!frontIsClear()) {
    	  turnLeft();
    	  move();
    	  turnLeft();
    	  turnLeft();
    	  turnLeft();
      }
      move();
	  turnLeft();
	  turnLeft();
	  turnLeft();
	  while(frontIsClear()) {
		  move();
	  }
	  turnLeft();
   }
   
   public void harvestAllToWall()
   {
      while(frontIsClear()){
         harvest();
    	 move();
         harvest();
      }
   }
   
   public void harvest()
   {
      while(nextToABeeper()){
         pickBeeper();
      }
   }
}