//3. WAP to sort an array using Bubble Sort Algorithm.
package ArrayPrograms;

public class  BubbleSort {
	public static void main(String[] args) {

		int[] arr = {5,1,3,4,2};

		System.out.println("The Given Array is: ");
		for(int elem : arr){
			System.out.print(elem+" ");
		}
		

		for(int i=0;i<arr.length;i++){
			for(int j=1;j<arr.length-i;j++){
				if(arr[j]>
				arr[j-1]){
					//if the condition is true swap the elements
					int temp = arr[j];
					arr[j] = arr[j-1];

					arr[j-1]= temp;
				}
			}

		}

		System.out.println("\nThe Bubble sort array is:");
		//using for loop
		for(int k=0;k<arr.length;k++){
			System.out.print(arr[k]+" ");
		}

		//for each loop
		/*for(int elem : arr){
			System.out.print(elem+" ");
		}*/

}

}
