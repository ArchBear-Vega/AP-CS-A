package ARRAYS;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class SearchArray {
	private int[] myNumList;
	private int myLength;

	public SearchArray() {
		myLength = 100;
		myNumList = new int[myLength];
		fillArray();
	}

	private void fillArray() {
		try {
			int i = 0;
			File inFile = new File("\\\\\\\\busd.local\\\\instruction\\\\Student-Home-Directories\\\\19vtovmasian\\\\git\\\\AP-CS-A\\\\AP CS PER 0 2018\\\\Review\\\\ARRAYS\\\\numfile1.txt");
			Scanner sc = new Scanner(inFile);
			while (sc.hasNextLine()) {
				int num = sc.nextInt();
				myNumList[i] = num;
				i++;
			}
			sc.close();
		} catch (FileNotFoundException fnf) {
			System.out.println("Input File not Found: " + fnf.getMessage());
		} 
	} // prints the elements of myNumList with a space between each element and //
		// prints 10 elements on each line, then prints myLength on its own line

	public void print() {
		String s = "";
		for(int count = 0; count < 100; count++) {
			s += myNumList[count] + " ";
			if((count % 10) == 9 && count != 0) {
				s += "\n";
			}
		}
		System.out.print(s);
	}

	// searches for item in myNumList, returns the index of where item first occurs
	// // if item is not in myNumList, returns -1
	public int linSearch(int item) {
		int i = 0;
		while(i < myNumList.length && item != myNumList[i]) {
			i++;
		}
		return i == myLength ? -1 : i;
		
	}
}