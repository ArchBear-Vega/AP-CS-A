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
	}
}