#include<stdio.h>
void insertionSort(int* arr,int size){
    for(int i=1;i<size;i++){
        int key = arr[i];
        int j;
        for(j=i-1;j>=0;j--){
            if(arr[j]<key){
                break;
            }
            arr[j+1]=arr[j];
        }
        arr[j+1]=key;
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
    insertionSort(arr,size);
    printf("\nAfter Sort: ");
    for(int i=0;i<size;i++){
        printf("%d ",arr[i]);
    }
}