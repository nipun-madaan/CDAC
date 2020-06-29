//binary search will only be applicable on sorted array

#include<stdio.h>
int binarySearchUsingInteration(int* arr, int beg, int end, int data){
    while(beg<=end){
        int mid = (beg+end)/2;
        if(arr[mid] == data){
            return mid;
        }

        if(data < arr[mid]){
            end = mid;   //left side
        }else{
            beg = mid+1;  //right side
        }
    }
    return -1;
}
int binarySearchUsingRecursion(int* arr, int beg, int end, int data){
    if(beg<=end){
        int mid = (beg+end)/2;
        if(arr[mid] == data){
            return mid;
        } 

        if(data < arr[mid]){
            return binarySearchUsingRecursion(arr,beg,mid,data);   //left side
        }else{ 
            return binarySearchUsingRecursion(arr,mid+1,end,data);  //right side
        }
    }
    return -1;
}
int main(){
    int size,no;
    printf("Enter the size of the array: ");
    scanf("%d",&size);
    int arr[size];
    printf("Enter the elements of array: ");
    for(int i = 0 ; i<size;i++){
        scanf("%d",&arr[i]);
    }
    printf("Enter the no. to be searched: ");
    scanf("%d",&no);
    int a = binarySearchUsingInteration(arr,0,size-1,no);
    //int a = binarySearchUsingRecursion(arr,0,size-1,no);
    if(a!=-1)
        printf("%d is found at %dth position\n",no,a+1);
    else
        printf("%d not found",no);
}