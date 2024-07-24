package io.murad.hashtable;

import java.util.Arrays;

public class HashTable {
    String[] theArray;
    int arraySize;
    int itemsInArray = 0;

    public HashTable(int size) {
        arraySize = size;
        theArray = new String[size];
        Arrays.fill(theArray, "-1");
    }

    public void displayTheStack() {
        int increment = 0;
        for (int m = 0; m < 3; m++) {
            increment += 10;
            for (int n = 0; n < 71; n++) {
                System.out.print("-");
            }

            System.out.println();

            for (int n = increment - 10; n < increment; n++) {
                System.out.format("| %3s " + " ", n);
            }

            System.out.println("|");

            for (int n = 0; n < 71; n++) {
                System.out.print("-");
            }

            System.out.println();

            for (int n = increment - 10; n < increment; n++) {

                if (theArray[n].equals("-1")) {
                    System.out.print("|      ");
                } else {
                    System.out.print(String.format("| %3s " + " ", theArray[n]));
                }
                System.out.println("|");
            }

            for (int n = 0; n < 71; n++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }

    public String findKey(String key) {
        // Find the keys original hash key
        int arrayIndexHash = Integer.parseInt(key) % 29;

        while (theArray[arrayIndexHash] != "-1") {
            if (theArray[arrayIndexHash] == key) {
                // Found the key so return it
                System.out.println(key + " was found in index " + arrayIndexHash);
                return theArray[arrayIndexHash];
            }
            // Look in the next index
            ++arrayIndexHash;
            // If we get to the end of the array go back to index 0
            arrayIndexHash %= arraySize;
        }
        // Couldn't locate the key
        return null;
    }

    public void hashFunction1(String[] stringsForArray, String[] theArray) {
        for (int n = 0; n < stringsForArray.length; n++) {
            String newElementVal = stringsForArray[n];
            theArray[Integer.parseInt(newElementVal)] = newElementVal;
        }
    }

    public void hashFunction2(String[] stringsForArray, String[] theArray) {
        for (int n = 0; n < stringsForArray.length; n++) {
            String newElementVal = stringsForArray[n];
            // Create an index to store the value in by taking the modulus
            int arrayIndex = Integer.parseInt(newElementVal) % 29;
            System.out.println("Modulus Index= " + arrayIndex + " for value " + newElementVal);
            // Cycle through the array until we find an empty space
            while (theArray[arrayIndex] != "-1") {
                ++arrayIndex;
                System.out.println("Collision Try " + arrayIndex + " Instead");
                // If we get to the end of the array go back to index 0
                arrayIndex %= arraySize;
            }
            theArray[arrayIndex] = newElementVal;
        }
    }

    public static void main(String[] args) {
        HashTable hT = new HashTable(30);
        String[] elementsToAdd = {"1", "5", "17", "21", "26"};

        hT.hashFunction1(elementsToAdd, hT.theArray);
        hT.displayTheStack();
    }
}
