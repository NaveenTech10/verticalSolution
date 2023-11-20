package collectionpack;

import java.util.ArrayList;
import java.util.Arrays;

public class AList {

	public static void main(String[] args) {
		 // Creating an ArrayList
        ArrayList arrayList = new ArrayList();

        // Adding elements to the ArrayList
        arrayList.add("Element 1");
          arrayList.add("Element 5");
        arrayList.add("Element 2");
        arrayList.add("Element 3");

        // Displaying the elements of the ArrayList
        System.out.println("Elements in the ArrayList: " + arrayList);

        // Getting the size of the ArrayList
        System.out.println("Size of the ArrayList: " + arrayList.size());

        // Accessing elements by index
        System.out.println("Element at index 1: " + arrayList.get(1));

        // Checking if the ArrayList contains a specific element
        System.out.println("Contains 'Element 2': " + arrayList.contains("Element 2"));

        // Removing an element by index
        arrayList.remove(0);
        System.out.println("After removing element at index 0: " + arrayList);

        // Checking if the ArrayList is empty
        System.out.println("Is the ArrayList empty? " + arrayList.isEmpty());

        // Clearing all elements from the ArrayList
        arrayList.clear();
        System.out.println("After clearing all elements: " + arrayList);
    }
}