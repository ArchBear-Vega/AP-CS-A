package ARRAYS;

import java.util.Scanner;

public class RectangleClient {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		RectangleArray r = new RectangleArray();
		
		int maxL = 0;
		int maxW = 0;
		
		System.out.print("Max length = ");
		maxL = in.nextInt();
		System.out.print("Max width = ");
		maxW = in.nextInt();
		
		r.fillArray(maxL, maxW);
		
		
		r.print();
		
		System.out.println("Search for Rectangle");
		System.out.print("Length: ");
		int l = in.nextInt();
		System.out.print("Width: ");
		int w = in.nextInt();
		
		System.out.println("The Rectangle with length " + l + " and width " + w + " occurs at index " + r.search(new Rectangle(l, w)));
		
		System.out.println("The Rectangle with the largest area is " + r.largestArea());
		System.out.println("The Rectangle with the smallest area is " + r.smallestArea());
		System.out.println("The Rectangle with the largest perimeter is " + r.largestPerimeter());
		System.out.println("The Rectangle with the smallest perimeter is " + r.smallestPerimeter());

		in.close();
	}
}
/*
RUN 1
Max length = 10
Max width = 20
1.0 by 16.0
6.0 by 2.0
1.0 by 16.0
3.0 by 12.0
10.0 by 13.0
7.0 by 12.0
4.0 by 13.0
8.0 by 10.0
2.0 by 19.0
7.0 by 2.0
7.0 by 13.0
7.0 by 4.0
9.0 by 17.0
3.0 by 15.0
6.0 by 5.0
5.0 by 17.0
6.0 by 14.0
1.0 by 20.0
8.0 by 14.0
6.0 by 13.0
Search for Rectangle
Length: 2
Width: 3
The Rectangle with length 2 and width 3 occurs at index -1
The Rectangle with the largest area is 9.0 by 17.0
The Rectangle with the smallest area is 6.0 by 2.0
The Rectangle with the largest perimeter is 9.0 by 17.0
The Rectangle with the smallest perimeter is 6.0 by 2.0

RUN 2
Max length = 100
Max width = 100
19.0 by 62.0
95.0 by 86.0
93.0 by 85.0
38.0 by 42.0
79.0 by 10.0
89.0 by 71.0
89.0 by 59.0
70.0 by 3.0
68.0 by 92.0
42.0 by 33.0
97.0 by 2.0
78.0 by 61.0
90.0 by 34.0
17.0 by 32.0
40.0 by 13.0
95.0 by 20.0
52.0 by 41.0
63.0 by 73.0
75.0 by 12.0
82.0 by 68.0
Search for Rectangle
Length: 97
Width: 2
The Rectangle with length 97 and width 2 occurs at index 10
The Rectangle with the largest area is 95.0 by 86.0
The Rectangle with the smallest area is 97.0 by 2.0
The Rectangle with the largest perimeter is 95.0 by 86.0
The Rectangle with the smallest perimeter is 17.0 by 32.0

RUN 3
Max length = 0
Max width = 100
1.0 by 87.0
1.0 by 96.0
1.0 by 22.0
1.0 by 72.0
1.0 by 41.0
1.0 by 28.0
1.0 by 86.0
1.0 by 45.0
1.0 by 72.0
1.0 by 70.0
1.0 by 69.0
1.0 by 61.0
1.0 by 72.0
1.0 by 51.0
1.0 by 28.0
1.0 by 47.0
1.0 by 80.0
1.0 by 8.0
1.0 by 42.0
1.0 by 65.0
Search for Rectangle
Length: 1
Width: 8
The Rectangle with length 1 and width 8 occurs at index 17
The Rectangle with the largest area is 1.0 by 96.0
The Rectangle with the smallest area is 1.0 by 8.0
The Rectangle with the largest perimeter is 1.0 by 96.0
The Rectangle with the smallest perimeter is 1.0 by 8.0

*/
