#include<iostream>
#include<stdlib.h>
using namespace std;

class Stack{
    private:
        int *arr;
        int top;
        int size;
    public:
        Stack(int size){
            arr = new int[size];
            top = -1;
            this->size = size;
        }

        bool isEmpty(){
            if(top == -1){
                return true;
            }else{
                return false;
            }
        }

        bool isFull(){
            if(top == size-1){
                return true;
            }else{
                return false;
            }
        }

        void push(int data){
            if(!isFull()){
                top++;
                arr[top] = data;   //arr[++top]=data
            }else{
                cout<<"Stack is full!!!"<<endl;
            }
        }

        void pop(){
            if(!isEmpty()){
                int popedEle = arr[top];   
                top--;
                cout<<"Poped element is "<<popedEle<<endl;
                //cout<<"Poped element is "<<arr[top--]<<endl;
            }else{
                cout<<"Stack is empty!!!"<<endl;
            }
        }

        void print(){
            if(!isEmpty()){
                cout<<"Stack elements: ";
                for(int i=0;i<= top;i++){
                    cout<<arr[i]<<" ";
                }
                cout<<endl;
            }else{
                cout<<"Stack is empty!!!"<<endl;
            }
        }

        void peek(){
            if(!isEmpty()){
                cout<<"Element at top: "<<arr[top]<<endl;
            }else{
                cout<<"Stack is empty!!!"<<endl;
            }
        }

        ~Stack(){
            delete[] arr;
        }
};
int main(){
    int size,choice,data;
    cout<<"Enter the size of stack: ";
    cin>>size;
    Stack s(size);
    while(1){
        cout<<"1. Push\n2. Pop\n3. Peek\n4. Display\n5. Exit"<<endl;
        cout<<"Enter your choice: ";
        cin>>choice;
        switch(choice){
            case 1:
                cout<<"Enter the data: ";
                cin>>data;
                s.push(data);
                break;
            case 2:
                s.pop();
                break;
            case 3:
                s.peek();
                break;
            case 4:
                s.print();
                break;
            case 5:
                exit(0);
            default:
                cout<<"Please enter the correct choice!!!"<<endl;
        }
    }
}