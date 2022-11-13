//5. WAP to sort an array using Selection Sort Algorithm.

package ArrayPrograms;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter elements size of an array");
		int n = scan.nextInt();
		int arr[] = new int[n];
5

		System.out.println("Enter array elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j; //searching for lowest index
				}
			}
			//swapping elements
			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}

		System.out.println("After Selection Sort");  
        for(int i:arr){  
            System.out.print(i+" ");  
        }  
	}

}

