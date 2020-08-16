#include<iostream>
#include<stdio.h>
using namespace std;
class Queue{
    private:
        int* arr;
        int size;
        int front;
        int rear;

    public: 
        Queue(int size){
            this->size = size;
            arr = new int[size];
            front = -1;
            rear = -1;
        }

        bool isEmpty(){
            if(front == -1 || front > rear){
                return true;
            }else{
                return false;
            }
        }

        bool isFull(){
            if(rear == size-1){
                return true;
            }else{
                return false;
            }
        }

        void enqueue(int data){
            if(!isFull()){
                if(front == -1)
                    front++;
                rear++;
                arr[rear] = data;
                cout<<data<<" enqueued sucessfully!!!"<<endl;
            }else{
                cout<<"Queue is full!!!"<<endl;
            }
        }

        void dequeue(){
            if(!isEmpty()){
                cout<<"Dequeued element is "<<arr[front++]<<endl;
            }else{
                cout<<"Queue is empty!!!"<<endl;
            }
        }

        void display(){
            if(!isEmpty()){
                cout<<"Elements in the queue : ";
                for(int i=front;i<=rear;i++){
                    cout<<arr[i]<<" ";
                }
                cout<<endl;
            }else{
                cout<<"Queue is empty!!!"<<endl;
            }
        }
};
int main(){
    int size,data,choice;
    cout<<"Enter the size of data: ";
    cin>>size;
    Queue q(size);
    while(1){
        cout<<"1. Enqueue\n2. Dequeue\n3. Display\n4. Exit"<<endl;
        cout<<"Enter your choice: ";
        cin>>choice;
        switch(choice){
            case 1:
                cout<<"Enter the data: ";
                cin>>data;
                q.enqueue(data);
                break;
            case 2:
                q.dequeue();
                break;
            case 3:
                q.display();
                break;
            case 4:
                exit(0);
            default:
                cout<<"Enter the correct choice!!!"<<endl;
        }
    }
}