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
			File inFile = new File(
					"\\\\\\\\busd.local\\\\instruction\\\\Student-Home-Directories\\\\19vtovmasian\\\\git\\\\AP-CS-A\\\\AP CS PER 0 2018\\\\Review\\\\ARRAYS\\\\numfile1.txt");
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
		for (int count = 0; count < myNumList.length; count++) {
			s += myNumList[count] + " ";
			if ((count % 10) == 9 && count != 0) {
				s += "\n";
			}
		}
		System.out.print(s);
	}

	// searches for item in myNumList, returns the index of where item first occurs
	// // if item is not in myNumList, returns -1
	public int linSearch(int item) {
		int i = 0;
		while (i < myNumList.length && item != myNumList[i]) {
			i++;
		}
		return i == myLength ? -1 : i;

	}

	public void selectionSort() {
		int inner = 0;
		int outer = 0;
		int index = 0;
		for (outer = 0; outer < myNumList.length; outer++) {
			index = outer;
			for (inner = outer + 1; inner < myNumList.length; inner++) {
				if (myNumList[inner] < myNumList[index]) {
					index = inner;
				}
			}
			swap(index, outer);
		}
	}

	public int getLength() {
		return myLength;
	}

	private void swap(int a, int b) {
		int temp;
		temp = myNumList[a];
		myNumList[a] = myNumList[b];
		myNumList[b] = temp;
	}

	public int binSearch(int x) {
		int low = 0;
		int high = myNumList.length - 1;

		while (low <= high) {
			int m = (low + high) / 2;
		
			if (myNumList[m] == x) {
				return m;
			} else if (myNumList[m] < x) {
				low = m + 1;
			} else {
				high = m - 1;
			}
		}

		return -1;

	}

	public void remove(int num) {
		if (binSearch(num) != -1) {
			for (int i = binSearch(num); i < myNumList.length - 1; i++) {
				myNumList[i] = myNumList[i + 1];
			}
			myNumList[myNumList.length - 1] = 0;
		} else {
			System.out.println("Item Not Found!");
		}

		myLength--;
	}

	public void insert(int num) {
		if (myNumList[myNumList.length - 1] == 0) {

			if (num != 0) {
				int index = 0;
				int i = myNumList.length - 1;
				boolean found = false;
				int replaced = 0;
				while (i > index) {
					if (myNumList[i] != 0 && myNumList[i] < num && !found) {
						index = i + 1;
						i = myNumList.length - 1;
						found = true;
						replaced = myNumList[index];
					}
					if (found)
						myNumList[i] = myNumList[i - 1];
					i--;
				}
				myNumList[index] = num;
				myNumList[index + 1] = replaced;
			} else {
				int replaced = 0;
				for (int i = myNumList.length - 1; i > 0; i--) {
					myNumList[i] = myNumList[i - 1];
				}
				myNumList[0] = replaced;

			}
		} else {
			System.out.println("Cannot be inserted!");
		}
		myLength++;
	}

}