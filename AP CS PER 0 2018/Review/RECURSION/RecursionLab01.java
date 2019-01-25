package RECURSION;

import java.util.Scanner;

public class RecursionLab01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s1 = "", s2;
		
		
		
		while(!s1.equalsIgnoreCase("q")) {
			
			System.out.print("Enter a String (\"Q\" or \"q\") to stop:  ");
			s1 = in.nextLine();
			if(!s1.equalsIgnoreCase("q")) {
				s2 = reverse(s1, s1.length());
			
				System.out.println("The reverse of " + s1 + " is " + s2);
			}
		}
		
		in.close();
	}

	public static String reverse(String s1, int n) {
		
		if(s1.length() == 1) {
			return s1;
		} else {
			return s1.substring(n - 1, n) + reverse(s1.substring(0, n-1), n-1);
		}
		
	}

}
/*
Enter a String ("Q" or "q") to stop:  Hello, I can speak in reverse!
The reverse of Hello, I can speak in reverse! is !esrever ni kaeps nac I ,olleH
Enter a String ("Q" or "q") to stop:  Oh, so can I!
The reverse of Oh, so can I! is !I nac os ,hO
Enter a String ("Q" or "q") to stop:  Lets think of palindromes!
The reverse of Lets think of palindromes! is !semordnilap fo kniht steL
Enter a String ("Q" or "q") to stop:  mom
The reverse of mom is mom
Enter a String ("Q" or "q") to stop:  tot
The reverse of tot is tot
Enter a String ("Q" or "q") to stop:  lol
The reverse of lol is lol
Enter a String ("Q" or "q") to stop:  dad
The reverse of dad is dad
Enter a String ("Q" or "q") to stop:  tacocat
The reverse of tacocat is tacocat
Enter a String ("Q" or "q") to stop:  q
*/ 
