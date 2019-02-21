package ARRAYLIST;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list.add(1);
		list.add(8);
		list.add(9);
		list.add(10);
		
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(11);
		list2.add(12);
		list2.add(13);
		
		System.out.println(merge(list, list2));
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
	
	
	@SuppressWarnings("unchecked")
	public static ArrayList<Integer> merge(ArrayList<Integer> listA, ArrayList<Integer> listB){
		ArrayList<Integer> merged = new ArrayList<Integer>();
		ArrayList<Integer> list1 = (ArrayList<Integer>) listA.clone();
		ArrayList<Integer> list2 = (ArrayList<Integer>) listB.clone();
		while(list1.size() > 0 && list2.size() > 0) {
			if(list1.get(0) > list2.get(0)) {
				merged.add(list2.get(0));
				list2.remove(0);
			} else if(list2.get(0) > list1.get(0)) {
				merged.add(list1.get(0));
				list1.remove(0);
			} else {
				merged.add(list1.get(0));
				merged.add(list2.get(0));
				list1.remove(0);
				list2.remove(0);
			}
		}
		
		if(list1.size() == 0) {
			for(Integer e : list2) {
				merged.add(e);
			}
		} else if (list2.size() == 0) {
			for(Integer e : list1) {
				merged.add(e);
			}
		}
		
		
		
		return merged;
		
	}

}


/*
 * X
 * YX
 * YXZ
 * YAXZ
 * YABZ
 * YBCZA
 * 
 * AZCBY
 * */
