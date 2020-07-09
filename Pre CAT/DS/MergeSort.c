#include<stdio.h>
void merge(int *arr,int left,int right,int mid){
    int n1 = mid-left+1;
    int n2 = right-mid;   //right-(mid+1)+1
    int leftArray[n1];
    int rightArray[n2];
    int j=left;
    for(int i=0;i<n1;i++){
        leftArray[i]=arr[j];
        j++;
    }

    int l=mid+1;
    for(int k=0;k<n2;k++){
        rightArray[k]=arr[l];
        l++;
    }

    int p=0;
    int q=0;
    int r=left;
    while (p<n1 && q<n2)
    {
        if(leftArray[p]<rightArray[q]){
            arr[r]=leftArray[p];
            p++;
        }else{
            arr[r]=rightArray[q];
            q++;
        }
        r++;   
    }

    while(p<n1){
        arr[r]=leftArray[p];
        p++;
        r++;
    }

    while(q<n2){
        arr[r]=rightArray[q];
        q++;
        r++;
    }
}
void mergeSort(int *arr,int left, int right){
    if(left<right){
        int mid=left+(right-left)/2;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        merge(arr,left,right,mid);
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
    mergeSort(arr,0,size-1);
    printf("\nAfter Sort: ");
    for(int i=0;i<size;i++){
        printf("%d ",arr[i]);
    }
}