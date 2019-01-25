package ARRAYS;

import java.util.Scanner;
import java.io.File;
public class Life
{
	private String[][] myBoard;
	// other additional instance variables?
	
	public Life()
	{
		
	}
	
	// DO NOT MODIFY THIS METHOD!!
	public void fillBoard()
	{
		try
    	{
    		File inFile = new File("life.txt");
   		Scanner sc = new Scanner(inFile);
   		while (sc.hasNext())
   		{
     			int row = sc.nextInt();
				int column = sc.nextInt();
				myBoard[row-1][column-1] = "*";
   		}
   	}
    	
   	catch (java.io.FileNotFoundException fnf) 
   	{
			System.out.println("Input File not Found: " + fnf.getMessage());
		}
		
	}
	
	// more methods
}