package com.dhruv.Scanner;

import java.util.Scanner;

public class ScannerMethodInput {

	public static void main(String[] args) {
		System.out.println("This method take any Integer as Input and prints it");
		System.out.println("Enter any Integer");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		System.out.println("Input Integer is "+ x);
	}

}
