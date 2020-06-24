#include<iostream>
#include<stdlib.h>
using namespace std;
class Queue{
    private:
        int size;
        int *arr;
        int front;
        int rear;
    public:
        Queue(){
            front=-1;
            rear=-1;
        }

        Queue(int size){
            this->size=size;
            arr = new int[size];
            front = -1;
            rear = -1;
        }

        bool isEmpty(){
            if(front == -1 || front > rear)
                return true;
            else
                return false;
        }

        bool isFull(){
            if(rear==size-1){
                return true;
            }else
            {
                return false;
            }
            
        }

        void enqueue(int a){
            if(!isFull()){
                if(front==-1)
                    front = 0;
                rear++;
                arr[rear]=a;
            }else
            {
                cout<<"Queue is full"<<endl;
            } 
        }

        void dequeue(){
            if(!isEmpty()){
                int a=arr[front];
                front++; 
                cout<<"Dequeued element: "<<a<<endl;             
            }else{
                cout<<"Queue is Empty"<<endl;
            }
        }

        void display(){
            for(int i=front;i<=rear;i++){
                cout<<arr[i]<<" ";
            }
            cout<<endl;
        }
};
int main(){
    int size, choice,data,a;
    cout<<"Enter the size of array: ";
    cin>>size;
    Queue q(size);
    while(1){
        cout<<"1. Enqueue\n2. Dequeue\n3. Display\n4. Exit"<<endl;
        cout<<"Enter your choice: ";
        cin>>choice;
        switch(choice){
            case 1:
                cout<<"Enter the data to be enqueued: ";
                cin>>data;
                q.enqueue(data);
                break;
            case 2:
                q.dequeue();
                //cout<<"Dequeued element: "<<a<<endl;
                break;
            case 3:
                q.display(); 
                break;
            case 4:
                exit(0);
            default:
                cout<<"Please enter correct choice"<<endl;
                break;
        }
    }
}