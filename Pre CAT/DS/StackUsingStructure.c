#include<stdio.h>
#include<stdlib.h>
struct Stack{
    int *arr;
    int size;
    int top;
};
typedef struct Stack stack;
int isEmpty(stack *s){
    if(s->top==-1)
        return 1;
    else
    {
        return 0;
    }
    
}

int isFull(stack *s){
    if(s->top == (s->size-1)){
        return 1;
    }else
    {
        return 0;
    }
    
}

void push(stack *s,int data){
    if(!isFull(s)){
        s->top++;
        s->arr[s->top]=data;
    }else{
        printf("Stack is full\n");
    }
}

void pop(stack *s){
    if(!isEmpty(s)){
        printf("Poped element: %d\n",s->arr[s->top]);
        s->top--;
    }else{
        printf("Stack is empty\n");
    }
}

void display(stack *s){
    if(!isEmpty(s)){
        for(int i=0;i<=s->top;i++)
            printf("%d ",s->arr[i]);
        printf("\n");
    }else{
        printf("Stack is empty\n");
    }
           
}

void elementAtTop(stack *s){
    if(!isEmpty(s))
        printf("Element at top: %d\n",s->arr[s->top]);
    else
        printf("Stack is empty\n");
}
int main(){
    int size,choice,data;
    printf("Enter the size of stack: ");
    scanf("%d",&size);
    stack s;
    s.arr = (int*)malloc(sizeof(int)*size);
    s.top=-1;
    s.size=size;
    for(int i=0;i<size;i++){
        s.arr[i]=0;
    }
     while(1){
        printf("1. Push\n2. Pop\n3. Peek\n4. Display\n5. Exit\n");
        printf("Enter the choice: ");
        scanf("%d",&choice);
        switch(choice){
            case 1:
                printf("Enter the data: ");
                scanf("%d",&data);
                push(&s,data);
                break;
            case 2:
                pop(&s);
                break;
            case 3:
                elementAtTop(&s);
                break;
            case 4:
                display(&s);
                break;
            case 5:
                exit(0);
            default:
                printf("Enter correct choice!!!\n");
        }
    }
    free(s.arr);
    s.arr=NULL;
}