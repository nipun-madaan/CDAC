#include<stdio.h>
int linearSearch(int* arr, int data,int size){
    for(int i=0;i<size;i++){
        if(arr[i]==data){
            return i+1;
        }
    }
    return 0;
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
    int a = linearSearch(arr,no,size);
    if(a != 0)
         printf("%d is found at %dth position\n",no,a);
    else
        printf("%d not found",no);
}