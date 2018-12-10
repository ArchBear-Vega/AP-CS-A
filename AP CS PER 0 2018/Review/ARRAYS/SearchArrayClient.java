package ARRAYS;

public class SearchArrayClient {

	public static void main(String[] args) {

		SearchArray a = new SearchArray();

		a.print();
		System.out.println();
		System.out.println("Linear Search");

		System.out.println("182 occurs at index " + a.linSearch(182));
		System.out.println("39 occurs at index " + a.linSearch(39));
		System.out.println("20 occurs at index " + a.linSearch(20));

		System.out.println("Sort the Array");
		a.selectionSort();

		a.print();
		System.out.println(a.getLength());

		System.out.println("Binary Search");

		System.out.println("Searching for 10, 150, and 97...");

		System.out.println("10 occurs at " + a.binSearch(10));
		System.out.println("150 occurs at " + a.binSearch(150));
		System.out.println("97 occurs at " + a.binSearch(97));

		System.out.println("Remove 150");
		a.remove(150);
		a.print();

		System.out.println("Insert 30");
		a.insert(30);
		a.print();

		System.out.println("Remove 60");
		a.remove(60);
		a.print();

		System.out.println("Remove 38"); 
		a.remove(38);
		a.print();
		
		System.out.println("Insert 313"); 
		a.insert(313);
		a.print();
		System.out.println("Insert 0"); 
		a.insert(0);
		a.print();
		System.out.println("Remove 12"); 
		a.remove(12);
		a.print();
		System.out.println("Insert 87"); 
		a.insert(87);
		a.print();
	}
}