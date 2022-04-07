package io.murad.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array {

	public static int sumArray(List<Integer> arr) {
		int sum = 0;
		for (Integer a : arr) {
			sum = sum + a;
//		     0 = 0 + 1;
//		     1 = 1 + 2;
//		     3 = 3 + 3;
//		     6 = 6 + 4;
//		     10 = 10 + 10;
//		     20 = 20 + 11;
//		     sum = 31
		}
		System.out.println(sum);
		return sum;
	}

	static void searchElement(int arr[], int n, int key) {
		for (int i = 0; i < n; i++) {
			if (arr[i] == key) {
				System.out.println("The input element found on index: " + i);
			}
			;
		}
	}

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		int arr[] = new int[] { 1, 3, 4, 7, 8, 9 };
		int arr2[] = new int[5];
		int arr3[] = { 2, 7, 4, 5, 3, 1 };
		int arr4[]; // Declaring an array
		System.out.println("Insert Array Size: ");
		int arrayLength = userInput.nextInt();

		arr4 = new int[arrayLength];// Allocating memory to the array

		// Inserting an array
		for (int i = 0; i < arr4.length; i++) {
			System.out.println("Insert the array: ");
			arr4[i] = userInput.nextInt();
		}

		for (int i = 0; i < arr4.length; i++) {
			System.out.println("Traverse Array: " + arr4[i]);
		}

		Array.searchElement(arr4, arrayLength, 5);
		List<Integer> arrSum = new ArrayList<Integer>();
		arrSum.add(0, 1);
		arrSum.add(1, 2);
		arrSum.add(2, 3);
		arrSum.add(3, 4);
		arrSum.add(4, 10);
		arrSum.add(5, 11);
		Array.sumArray(arrSum);
//		userInput.close();
	}

}
