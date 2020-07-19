#include<stdio.h>
int partition(int *arr,int left,int right){
    int pivot = arr[right];
    int i = left-1;
    for(int j=left;j<right;j++){
        if(arr[j]<pivot){
            i++;
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    i++;
    int temp=arr[i];
    arr[i]=arr[right];
    arr[right]=temp;
    return i;
}
void quickSort(int* arr,int left,int right){
    if(left<right){
        int pi = partition(arr,left,right);
        quickSort(arr,left,pi-1);
        quickSort(arr,pi+1,right);
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
    printf("\n");
    quickSort(arr,0,size-1);
    printf("\nAfter Sort: ");
    for(int i=0;i<size;i++){
        printf("%d ",arr[i]);
    }
}