package ARRAYLIST;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(7);
		list.add(5);
		list.add(6);
		list.add(3);
		list.add(11);
		list.add(8);
		list.add(2);
		list.add(10);
		list.add(8);
		list.add(8);

		
		incrementOdds(list);
		//insertZeros(list);
		System.out.println(list);
		remove8(list);
		
		System.out.println(list);
	}
	
	public static void incrementOdds(ArrayList<Integer> nums) {
		
		
		for(int i = 0; i < nums.size(); i++) {
			int num = nums.get(i);
			if(num % 2 != 0) {
				num++;
				nums.set(i, num);
			}
		}
	}
	
	public static void insertZeros(ArrayList<Integer> nums) {
		for(int i = 0; i < nums.size(); i++) {
			if(i % 2 != 0) {
				nums.add(i, 0);
			}
		}
	}
	
	public static void remove8(ArrayList<Integer> nums) {
		for(int i = 0; i < nums.size(); i++) {
			int num = nums.get(i);
			if(num == 8) {
				nums.remove(i);
				i = 0;
			}
			
			
		}
	}

}
