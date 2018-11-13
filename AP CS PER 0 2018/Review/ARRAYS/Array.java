package ARRAYS;


import java.util.Scanner;

public class Array {
	private int[] myList;
	public int length;
	public Array(int length) {
		myList = new int[length];
		this.length = length;
	}

	public void fillArray() {
		Scanner input = new Scanner(System.in);
		for(int i = 1; i <= length; i++) {
			System.out.print("# " + i + " = ");
			myList[i-1] = input.nextInt();
		}
		
		input.close();
		
	}

	public void print() {
		for(int i = 0; i < myList.length; i++) {
			System.out.print(" " + myList[i]);
		}
	}

	public void reversePrint() {
		for(int i = myList.length-1; i >= 0; i--) {
			System.out.print(" " + myList[i]);
		}
	}

	public int getNth(int num) {
		return myList[num];
	}

	public double average() {
		double average = 0;
		for (int i = 0; i < myList.length; i++) {
			average += myList[i];
		}

		return average / myList.length;
	}

	public int highest() {
		int max = 0;

		for (int i = 0; i < myList.length; i++) {
			if (max < myList[i]) {
				max = myList[i];
			}
		}
		return max;
	}

	public int lowest() {
		int min = 0;
		min = myList[0];
		for (int i = 0; i < myList.length; i++) {
			if (min > myList[i]) {
				min = myList[i];
			}
		}
		return min;
	}
}
