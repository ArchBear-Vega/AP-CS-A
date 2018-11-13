package ARRAYS;

public class ArrayLab01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array array = new Array(10);

		array.fillArray();
		System.out.println();

		System.out.print("The numbers in order are:");
		array.print();
		System.out.println();
		System.out.print("The numbers in reverse are:");
		array.reversePrint();
		System.out.println("\n");

		System.out.println("The third number is " + array.getNth(2));
		System.out.println("The eight number is " + array.getNth(7));
		System.out.println();
		
		System.out.println("The average is " + array.average());
		System.out.println();
		
		System.out.println("The highest number is " + array.highest());
		System.out.println("The lowest number is " + array.lowest());
	}

}
/*
# 1 = 1
# 2 = -2
# 3 = 3
# 4 = 573
# 5 = 2
# 6 = 472
# 7 = 172
# 8 = 96
# 9 = 426
# 10 = 333

The numbers in order are: 1 -2 3 573 2 472 172 96 426 333
The numbers in reverse are: 333 426 96 172 472 2 573 3 -2 1

The third number is 3
The eight number is 96

The average is 207.6

The highest number is 573
The lowest number is -2
*/

/*
# 1 = 0
# 2 = 0
# 3 = 0
# 4 = 0
# 5 = 0
# 6 = 0
# 7 = 0
# 8 = 0
# 9 = -1
# 10 = -1

The numbers in order are: 0 0 0 0 0 0 0 0 -1 -1
The numbers in reverse are: -1 -1 0 0 0 0 0 0 0 0

The third number is 0
The eight number is 0

The average is -0.2

The highest number is 0
The lowest number is -1
*/
/*
# 1 = -1
# 2 = -2
# 3 = -3
# 4 = 4
# 5 = -5
# 6 = -6
# 7 = -7
# 8 = -6
# 9 = 3
# 10 = -3

The numbers in order are: -1 -2 -3 4 -5 -6 -7 -6 3 -3
The numbers in reverse are: -3 3 -6 -7 -6 -5 4 -3 -2 -1

The third number is -3
The eight number is -6

The average is -2.6

The highest number is 4
The lowest number is -7
*/