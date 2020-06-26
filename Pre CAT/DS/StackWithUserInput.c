#include<stdio.h>
#include<stdlib.h>
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
    int choice,data;
    int top = -1;
    while(1){
        printf("1. Push\n2. Pop\n3. Peek\n4. Display\n5. Exit\n");
        printf("Enter the choice: ");
        scanf("%d",&choice);
        switch(choice){
            case 1:
                printf("Enter the data: ");
                scanf("%d",&data);
                push(arr,&top,size,data);
                break;
            case 2:
                pop(arr,&top);
                break;
            case 3:
                elementAtTop(arr,&top);
                break;
            case 4:
                display(arr,&top);
                break;
            case 5:
                exit(0);
            default:
                printf("Enter correct choice!!!\n");
        }
    }
}
