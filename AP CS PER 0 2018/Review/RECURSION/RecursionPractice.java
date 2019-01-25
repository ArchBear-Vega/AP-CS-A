package RECURSION;

public class RecursionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(oddSum(5) + " " + sum(5));
		print1ToN(10);
		System.out.println();
		System.out.println(count3s(933454443));
		System.out.println(power(2, 6));
		System.out.println(countHi("hihihi"));
		//System.out.println(everyOtherLetter("Kosbab4"));
		System.out.println(containsAll5(555));
	}

	public static int sum(int n) {

		if (n == 1) {
			return 1;
		} else {
			return n + oddSum(n - 1);
		}
	}
	
	public static int oddSum(int n) {

		if (n == 1) {
			return 1;
		}
		if (n % 2 != 0) {
			return n + oddSum(n - 1);
		} else {
			return oddSum(n - 1);
		}
	}
	
	
	public static void print1ToN(int n) {
		if (n >= 1) {
			System.out.print(n + " ");
			n--;
			print1ToN(n);
		}

	}

	public static int count3s(int n) {
		if (n == 0) {
			return 0;
		} else if (n % 10 == 3) {
			return 1 + count3s(n / 10);
		} else {
			return count3s(n / 10);
		}

	}

	public static long power(int b, int n) {

		if (n == 0) {
			return 1;
		}
		return b * (power(b, n - 1));
	}

	public static int countHi(String s) {
		s = s.toLowerCase();
		if (s.indexOf("hi") == -1) {
			return 0;
		} else {
			return 1 + countHi(s.substring(s.indexOf("hi") + 2));
		}
	}

	public static String everyOtherLetter(String s) {
		if (s.length() == 0) {
			return "";
		} else {
			return s.charAt(0) + everyOtherLetter(s.substring(2));
		}

	}

	public static boolean contains5(int n) {
		if (n % 10 == 5) {
			return true;
		} else if (n == 0) {
			return false;
		} else {
			return contains5(n / 10);
		}
	}
	
	public static boolean containsAll5(int n) {
		if (n % 10 == 5) {
			return true && containsAll5(n / 10);
		} else if (n == 0) {
			return true;
		} else {
			return false;
		}
		
	}


}

/*
 * RECURSION WORKSHEET 1. E 2. B 3. E 4. D 5. A 6. D 7. E 8. A 9. F 10. E
 * 
 */
