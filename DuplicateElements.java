package com.focus.arrays;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,30,20,50,60,80,50};  //with duplicate values
		//int[] arr= {10,20,30,50}; //no duplicates
		boolean flag = false;
		
		
		System.out.println("Duplicate Elements in the given array:\n");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]== arr[j]) {
					System.out.println(arr[j]);
					flag = true;
					break;
				}
			}
		}
		if(flag == false) {
			System.out.println("No Duplicate Elements in the given array");
		}
		
		
	}

}