#include<stdio.h>
int isEmpty(int *top){
    if(*top == -1)
        return 1;
    else
        return 0;
}
int isFull(int *top,int size){
    if(*top==size-1){
        return 1;
    }else{
        return 0;
    }
}

void push(int *arr,int *top,int size,int data){
    if(!isFull(top,size)){
        arr[++(*top)]=data;
    }else{
        printf("Stack is full\n");
    }
}

void pop(int* arr,int* top){
    if(!isEmpty(top)){
        printf("Poped element: %d\n",arr[(*top)]);
        (*top)--;
    }else{
        printf("Stack is empty\n");
    }
}

void display(int* arr,int* top){
    if(!isEmpty(top)){
        for(int i=0;i<=(*top);i++)
            printf("%d ",arr[i]);
        printf("\n");
    }else{
        printf("Stack is empty\n");
    }
           
}

void elementAtTop(int* arr, int* top){
    if(!isEmpty(top))
        printf("Element at top: %d\n",arr[(*top)]);
    else
        printf("Stack is empty\n");
}
int main(){
    int size;
    printf("Enter the size of stack: ");
    scanf("%d",&size);
    int arr[size];
    int top = -1;
    push(arr,&top,size,5);
    push(arr,&top,size,10);
    display(arr,&top);
    push(arr,&top,size,15);
    push(arr,&top,size,20);
    display(arr,&top);
    pop(arr,&top);
    display(arr,&top);
    elementAtTop(arr,&top);
    push(arr,&top,size,25);
    display(arr,&top);
    pop(arr,&top);
    pop(arr,&top);
    pop(arr,&top);
    pop(arr,&top);
    display(arr,&top);
    elementAtTop(arr,&top);
}