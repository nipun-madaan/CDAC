package edac_data_structure;

import java.util.Scanner;

public class BubbleSort {

	void bubbleSort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int swap = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=swap;
				}
			}
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
		BubbleSort b = new BubbleSort();
		b.bubbleSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		sc.close();
	}
}
