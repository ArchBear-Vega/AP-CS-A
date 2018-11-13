package ARRAYS;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] list = { "kosbab", "fish", "hello", "dog", "fellokosbab" };

		int[] nums = { 4, 3, 7, 9, 5 };

		System.out.println(countKosbabs(list));
		System.out.println(average(nums));
		
		increment(nums);
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
		
	}

	public static int countKosbabs(String[] array) {

		int num = 0;
		for (int i = 0; i < array.length; i++) {

			if (array[i].equalsIgnoreCase("Kosbab")) {
				num++;
			}

		}

		return num;
	}

	public static double average(int[] nums) {
		double average = 0;

		for (int i = 0; i < nums.length; i++) {
			average += nums[i];
		}

		average /= nums.length;
		return average;
	}

	public static void increment(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			nums[i]++;
		}

	}
}
