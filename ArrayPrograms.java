package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		GIVE INPUT AS [1,2,3,4,5,6];
		int[]arr=new int[6];
		int[] arr2= {6,8,2,7,3,5};
		System.out.println("ENTER THE ARRAY ELEMENTS...");
		Scanner input=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=input.nextInt();	
		}
		
		System.out.println("THE ARRAY ELEMENTS ARE...");
		System.out.println(Arrays.toString(arr));
		System.out.println("****************************************************************");
		sum(arr);
		reverse(arr);
		search(arr);
		countOddEven(arr);
		arrayMethods(arr2);

	}

	private static void arrayMethods(int[] arr2) {
		// TODO Auto-generated method stub
		System.out.println("ARRAY IN-BUILD METHODS ");
		System.out.println(Arrays.toString(arr2));
		System.out.println("SORTING ARRAY");
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		int s=Arrays.binarySearch(arr2, 3);
		System.out.println(s);
		Arrays.fill(arr2, 9);
	int[] arr3=	Arrays.copyOf(arr2, 15);
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr2));
		String word="HI";
		System.out.println(Arrays.toString(arr2)+word);
	}

	private static void countOddEven(int[] arr) {
		// TODO Auto-generated method stub
		int oddCount=0;
		int evenCount=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		System.out.println("oddCount:"+oddCount+","+"evenCount:"+evenCount);
		System.out.println("********************************************************");
	}

	private static void search(int[] arr) {
		// TODO Auto-generated method stub
		int target=3;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				System.out.println("TARGET INDEX IS:"+i);
	}
		}
		System.out.println("****************************************************************");
	}

	private static void reverse(int[] arr) {
		// TODO Auto-generated method stub
		 int n=arr.length; 
		 System.out.println("REVERSE AN ARRAY..");
		 for(int i=n-1;i>=0;i--) { 
			 System.out.println(arr[i]);
			 }
			System.out.println("***************************************************************");
	}

	private static void sum(int[] arr) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("SUM OF THE ELEMENTS ARE :"+sum);	
		int n=arr.length;
		int avg=sum/n;
		System.out.println("AVG OF THE ELEMENT IS "+avg);
		System.out.println("***********************************************************************");
	}

}
