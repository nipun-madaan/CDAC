#include<iostream>
#include<stdlib.h>
using namespace std;
class Stack{
    private:
        char* arr;
        int size;
        int top;
    public:
        Stack(int size){
            this->size=size;
            arr = new char[size];
            top=-1;
        }

        bool isEmpty(){
            if(top==-1){
                return true;     
            }else
            {
                return false;
            }
        }

        bool isFull(){
            if(top==size-1){
                return true;
            }else
            {
                return false;
            }
            
        }
        void push(){
            if(isFull()){
                cout<<"Stack is full"<<endl;
            }else
            {
                cout<<"Enter the charcter:";
                char ch;
                cin>>ch;
                arr[++top]=ch;
            }
            
        }

        void pop(){
            if(isEmpty()){
                cout<<"Stack is empty"<<endl;
            }else
            {
                cout<<"Pop out character is "<<arr[top--]<<endl;
            }
            
        }

        void valueAtTop(){
            if(isEmpty()){
                cout<<"Stack is empty"<<endl;
            }else
            {
                cout<<"Value at top of stack is "<<arr[top]<<endl;
            }
        }

        void display(){
            if(isEmpty()){
                cout<<"Stack is empty"<<endl;
            }else
            {
                for(int i=0;i<=top;i++){
                    cout<<arr[i]<<" ";
                }
                cout<<endl;
            }          
        }
};
int main(){
    int size,choice;
    cout<<"Enter the size of stack:";
    cin>>size;
    Stack s(size);
    while (1)
    {
        cout<<"1. Push\n2. Pop\n3. Value at top\n4. Display\n5. Exit"<<endl;
        cout<<"Enter your choice:";
        cin>>choice;
        switch (choice)
        {
        case 1:
            s.push();
            break;
        case 2:
            s.pop();
            break;
        case 3:
            s.valueAtTop();
            break;
        case 4:
            s.display();
            break;
        case 5:
            exit(0);
        default:
            cout<<"Please enter correct choice"<<endl;
            break;
        }
    }
}