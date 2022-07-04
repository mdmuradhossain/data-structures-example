package io.murad.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Array {


	static void searchElement(int arr[], int n, int key) {
		for (int i = 0; i < n; i++) {
			if (arr[i] == key) {
				System.out.println("The input element found on index: " + i);
			}else {
				System.out.println("The input element not found");
			}
		}
	}

	static int findElement(int arr[], int n, int key) {
		for (int i = 0; i < n; i++) 
			if (arr[i] == key) 
				return i;
		
		return -1;
	}
	// Function to insert a given key in
	// the array. This function returns n+1
	// if insertion is successful, else n.
	static int insertSorted(int arr[], int n, int key, int capacity) {

		// Cannot insert more elements if n
		// is already more than or equal to
		// capacity
		if (n >= capacity)
			return n;

		arr[n] = key;

		return (n + 1);
	}

	// Function to delete an element
	static int deleteElement(int arr[], int n, int key) {
		// Find position of element to be deleted
		int pos = findElement(arr, n, key);
		if (pos == -1) {
			System.out.println("Element not found");
			return n;
		}
		// Deleting element
		int i;
		for (i = pos; i < n - 1; i++)
			arr[i] = arr[i + 1];

		return n - 1;
	}

	static void sortArray(int arr[],int size) {
		int temp;
		for(int i=0; i<size; i++) {
			for(int j=i+1; j<size; j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int sortedArr : arr) {
			System.out.println("Sorted Array: "+ sortedArr);
		}
		
	}
	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		/* Declaring an array
	     * int arr1[] = new int[] { 1, 3, 4, 7, 8, 9 };
		 * int arr2[] = new int[5];
		 * int arr3[] = { 2, 7, 4, 5, 3, 1 };
		 */
		int arr[]; 
		
		System.out.println("Insert Array Size: ");
		int arrayLength = userInput.nextInt();
		
		// Allocating memory to the array
		arr = new int[arrayLength];

		// Inserting an array
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Insert the array: ");
			arr[i] = userInput.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Traverse Array: " + arr[i]);
		}

		Array.searchElement(arr, arrayLength, 5);
		
		Array.sortArray(arr, arrayLength);
		
		userInput.close();
	}

}
