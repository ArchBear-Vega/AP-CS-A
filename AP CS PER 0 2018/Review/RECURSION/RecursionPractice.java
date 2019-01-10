package RECURSION;

public class RecursionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(5));
		print1ToN(10);
	}

	public static int sum(int n) {

		if (n == 1) {
			return 1;
		}
		if (n % 2 != 0) {
			return n + sum(n - 1);
		} else {
			return sum(n - 1);
		}
	}
	
	
	public static void print1ToN(int n) {
		if(n >= 1) {
			System.out.print(n + " ");
			n--;
			print1ToN(n);
		}
		
		
	}
}
