package ARRAYLIST;

import java.util.ArrayList;

public class Permutation {
	private ArrayList<Integer> nums;
	private int upper;
	private int lower;

	public Permutation(int upperLimit, int lowerLimit) {
		nums = new ArrayList<Integer>(upperLimit - lowerLimit + 1);
		upper = upperLimit;
		lower = lowerLimit;
		fill();
	}

	private void fill() {
		ArrayList<Integer> oneToN = new ArrayList<Integer>(upper - lower + 1);
		for (int i = lower; i < upper + 1; i++) {
			oneToN.add(i);
		}
		assign(oneToN);
	}

	private void assign(ArrayList<Integer> xToN) {
		while (xToN.size() != 0) {
			int num = (int) (Math.random() * (xToN.size()));
			
			if (!nums.contains(xToN.get(num))) {
				nums.add(xToN.get(num));
				xToN.remove(num);
			}
		}

	}

	@Override
	public String toString() {
		String s = new String();

		for (int i = 0; i < nums.size(); i++) {
			s += " " + nums.get(i);
		}

		return s;
	}
}
