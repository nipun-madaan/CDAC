#include<stdio.h>
void selectionSort(int *arr,int size){
    int min;
    for(int i=0;i<size;i++){
        min = i;
        for(int j=i+1;j<size;j++){
            if(arr[min]>arr[j])
                min=j;
        }
        int temp=arr[i];
        arr[i]=arr[min];
        arr[min]=temp;
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
    selectionSort(arr,size);
    printf("\nAfter Sort: ");
    for(int i=0;i<size;i++){
        printf("%d ",arr[i]);
    }
}