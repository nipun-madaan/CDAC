package edac_data_structure;

import java.util.Scanner;

public class SelectionSort {

	 static void selectionSort(int arr[]) {
		 int small;
		for(int i=0;i<arr.length;i++) {
			small=i;
			for(int j=i;j<arr.length;j++) {
				if(arr[j]<arr[small]) {
					small=j;
				}
			}
			int swap = arr[small];
			arr[small]=arr[i];
			arr[i]=swap;
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
			selectionSort(arr);
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			sc.close();
		}
}
