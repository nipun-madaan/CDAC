package edac_data_structure;

import java.util.Scanner;

public class InsertionSort {
	public static void insertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int key = arr[i];
			int j=i-1;
			while(j>=0 &&arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the size of array: ");
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		insertionSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		sc.close();
	}
}
