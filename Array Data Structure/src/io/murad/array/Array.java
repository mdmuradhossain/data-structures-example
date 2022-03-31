package io.murad.array;

import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		int arr[] = new int[]{1,3,4,7,8,9};
		int arr2[]= new int[5];
		int arr3[] = {2,7,4,5,3,1};
		int arr4[];  // Declaring an array
		int arrayLength = userInput.nextInt();
		
		arr4 = new int[arrayLength];// Allocating memory to the array
		
		//Inserting an array
		for(int i=0; i<arr4.length;i++) {
			System.out.println("Input number: ");
			arr4[i] = userInput.nextInt();
		}

		
		userInput.close();
	}

}
