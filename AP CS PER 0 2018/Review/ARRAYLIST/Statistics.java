package ARRAYLIST;

import java.util.*;
import java.io.File;

public class Statistics {
	private ArrayList<Integer> myNumList;

	// constructs myNumList and calls the fillList method
	public Statistics() {
		myNumList = new ArrayList<Integer>(1000);
		fillList();
		mergeSort(myNumList);
	}

	// fills myNumList with Integers that are read from numbers.txt
	// you should not modify this method
	public void fillList() {
		try {
			File inFile = new File("Z:\\git\\AP-CS-A\\AP CS PER 0 2018\\Review\\ARRAYLIST\\numbers1.txt");

			Scanner sc = new Scanner(inFile);
			while (sc.hasNext()) {
				int num = sc.nextInt();
				myNumList.add(num);
			}
			sc.close();
		} catch (java.io.IOException ioe) {
			System.out.println("Problems Reading File:" + ioe.getMessage());
		}
	}

	// returns the average of all the numbers in myNumList
	public double average() {
		double average = 0;

		for (Integer e : myNumList) {
			average += e;
		}

		return average / myNumList.size();

	}

	// returns the standard deviation of all the numbers in myNumList
	public double standardDeviation() {
		double standard = 0;
		double average = average();
		for(Integer e : myNumList) {
			standard += Math.pow(e - average, 2);
		}
		
		standard /= (myNumList.size() - 1);
		
		
		return Math.sqrt(standard);
	}

	// returns an ArrayList of the modes of the numbers in myNumList
	// THERE IS MORE THAN ONE MODE!!!
	public ArrayList<Integer> modes() {
		ArrayList<Integer> modes = new ArrayList<Integer>(100);
		ArrayList<Integer> values = new ArrayList<Integer>();

		for (int i = 0; i <= myNumList.size(); i++) {
			int rep = 0;
			for (Integer e : myNumList) {
				if (i == e) {
					rep++;
				}
			}
			modes.add(i, rep);

		}
		
		for(int i = 0; i < modes.size();i++) {
			if(modes.get(i) == findMax(modes)) {
				values.add(i);
			}
		}
		
		return values;

	}

	private int findMax(ArrayList<Integer> modes) {
		int num = modes.get(0);
		for (Integer e : modes) {
			if (num < e) {
				num = e;
			}
		}
		return num;
	}

	public ArrayList<Integer> mergeSort(ArrayList<Integer> a) {
		int mid = (a.size() - 1) / 2;
		ArrayList<Integer> half1;
		ArrayList<Integer> half2;
		if (a.size() == 1 || a.size() == 0) {
			return a;
		} else {

			half1 = new ArrayList<Integer>(a.subList(0, mid));
			half2 = new ArrayList<Integer>(a.subList(mid, a.size() - 1));

			return merge(mergeSort(half1), mergeSort(half2));
		}
	}

	private ArrayList<Integer> merge(ArrayList<Integer> listA, ArrayList<Integer> listB) {
		ArrayList<Integer> merged = new ArrayList<Integer>();
		ArrayList<Integer> list1 = listA;
		ArrayList<Integer> list2 = listB;
		while (list1.size() > 0 && list2.size() > 0) {
			if (list1.get(0) > list2.get(0)) {
				merged.add(list2.get(0));
				list2.remove(0);
			} else if (list2.get(0) > list1.get(0)) {
				merged.add(list1.get(0));
				list1.remove(0);
			} else {
				merged.add(list1.get(0));
				merged.add(list2.get(0));
				list1.remove(0);
				list2.remove(0);
			}
		}

		if (list1.size() == 0) {
			for (Integer e : list2) {
				merged.add(e);
			}
		} else if (list2.size() == 0) {
			for (Integer e : list1) {
				merged.add(e);
			}
		}

		return merged;

	}

	// You should include private helper methods
	public void print() {
		System.out.println("Average:" + average());
		System.out.println("Standard Deviation:" + standardDeviation());
		String s = "";
		for(Integer e : modes()) {
			s += " " + e;
		}
		System.out.println("Modes:" + s);
	}

}
