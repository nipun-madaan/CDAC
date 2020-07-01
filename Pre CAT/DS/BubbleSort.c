#include<stdio.h>
void bubbleSort(int *arr,int size){
    for(int i=0;i<size;i++){
        for(int j=0;j<size-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
}
int main(){
    int size;
    printf("Enter the size of array: ");
    scanf("%d",&size);
    int arr[size];
    printf("Enter the elements of array: ");
    for(int i=0;i<size;i++){
         scanf("%d",&arr[i]);
    }
    printf("Before Sort:");
    for(int i=0;i<size;i++){
        printf("%d ",arr[i]);
    }
    bubbleSort(arr,size);
    printf("\nAfter Sort: ");
    for(int i=0;i<size;i++){
        printf("%d ",arr[i]);
    }
}