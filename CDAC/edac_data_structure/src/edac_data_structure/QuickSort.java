package edac_data_structure;

import java.util.Scanner;

public class QuickSort {
	
	static int partition(int[] arr,int start,int end) {
		int pivot = arr[end];
		int i=start-1;
		for(int j=start;j<end;j++) {
			if(arr[j]<pivot) {
				i++;
				int swap = arr[i];
				arr[i]=arr[j];
				arr[j]=swap;
			}
		}
		int swap = arr[end];
		arr[end]=arr[i+1];
		arr[i+1]=swap;
		return i+1;
	}
	
	static void sort(int arr[],int start,int end) {
		if(start<end) {
			int pi = partition(arr,start,end);
			sort(arr,start,pi-1);  //left
			sort(arr,pi+1,end);   //right
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
		sort(arr,0,arr.length-1);   //start=0,end=length-1
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		sc.close();
	}

}
