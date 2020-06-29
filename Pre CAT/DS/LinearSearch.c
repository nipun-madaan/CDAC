#include<stdio.h>
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
    int i,flag = 0;
    for(i=0;i<size;i++){
        if(arr[i]==no){
            flag = 1;
            break;
        }    
    }
    if(flag==1)
         printf("%d is found at %dth position\n",no,i+1);
    else
        printf("%d not found",no);

    /****Another way*****/
    
    /*for(i=0;i<size;i++){
        if(arr[i]==no){
            printf("%d is found at %dth position\n",no,i+1);
            return 0;
        }    
    }
    printf("%d not found",no);
    return 0;*/
}