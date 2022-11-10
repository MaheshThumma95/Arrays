//2. WAP to sort an array using Quick Sort Algorithm.

package ArrayPrograms;


public class  QuickSort {
	static void quickSort(int arr[], int low,int high){
		int mid = (low+high)/2;
		int i = low ;
		int j= high;
		int pivot = arr[high];  //here we can take any element as pivot value either low/middle/high value

		
		while(i<=j){  //start value to end value
			while(arr[i]<pivot){
				i++;
			}
			while(arr[j]>pivot){
				j--;
			}
			if(i<=j){
				//swap the values 
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		if(low<j){
			quickSort(arr, low, j);
		}
		if(high>i){
			quickSort(arr, i, high);
		}
	}

	public static void main(String[] args) {
		int[] arr = {9,2,6,4,3,7,1,9};
		//int[] arr = {77,2,16,14,3,17,1,9};
		System.out.println("Before sorting an array:");
		for(int elem : arr){
			System.out.print(elem+" ");
		}

		//call quick sort method here
		quickSort(arr,0,arr.length-1);

		System.out.println("\nAfter sorting an array:");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}

}

}