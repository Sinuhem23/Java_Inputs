package Java_Inputs.Java_Inputs;

import java.util.Scanner;
public class Inputs {

	
	public static void main(String[] args) {
		int inum;
		float fnum;
		double dnum;
		long lnum;
		boolean choice;
		String str;
		String address;
		// declare the new scanner as a class -> System.in
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an integer number: ");
		// different methods for accepting inputs
		inum = scan.nextInt();
		
		System.out.println("Enter another longer integer number: ");
		lnum = scan.nextLong();
		
		System.out.println("Enter another integer number with a decimal: ");
		fnum = scan.nextFloat();
		
		System.out.println("Enter another integer number with a decimal: ");
		dnum = scan.nextDouble();
		
		System.out.println("Enter a boolean true or false ");
		choice = scan.nextBoolean();
		
		System.out.println("Enter a single word ");
		// only takes first word, it will stop after the space bar is entered
		str = scan.next();
		// Allows for you to remain entering the address after a single entry (scan.next() )
		scan.nextLine();
		System.out.println("Enter an address: ");
		// takes a sentence
		address= scan.nextLine();
		
		System.out.println(inum);
		System.out.println(lnum);
		System.out.println(fnum);
		System.out.println(dnum);
		System.out.println(choice);
		System.out.println(str);
		System.out.println(address);
		
		// close scanner when done
		scan.close();
		
	}
}
 






 
















