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
            size=0;
            front=-1;
            rear=-1;
        }

        Queue(int size){
            this->size=size;
            arr = new int[size];
            front=-1;
            rear=-1;
        }

        bool isEmpty(){
            if((front == -1 && rear == -1) || front>rear){
                return true;
            }else
            {
                return false;
            }
        }

        bool isFull(){
            if(front == 0 && rear >= size-1)
                return true;
            else
            {
                return false;
            }
            
        }

        void enqueueAtEnd(int data){
            if(!isFull()){
                if(rear >= size-1){
                    cout<<"Insertion is not possible at end"<<endl;
                }else{
                    if(front == -1){
                    front = 0;
                    }
                    rear++;
                    arr[rear]=data;
                }
                
            }else
            {
                cout<<"Queue is full"<<endl;
            }
            
        }

        void enqueueAtStart(int data){
            if(!isFull()){
                if(front == -1)
                {
                    front = 0;
                    rear++;
                    arr[rear]=data;
                }else if(front != 0){
                    front--;
                    arr[front]=data;
                }else{
                    cout<<"Insertion is not possible at start"<<endl;
                }
            }else{
                cout<<"Queue is full"<<endl;
            }
        }

        void dequeueAtStart(){
            if(!isEmpty()){
                if(front <= rear){
                    cout<<"Dequeued element: "<<arr[front]<<endl;
                    front++;
                }else{
                    cout<<"Deletion is not possible from start"<<endl;
                }
            }else{
                cout<<"Queue is empty"<<endl;
            }
        }

        void dequeueAtEnd(){
            if(!isEmpty()){
                if(front <= rear){
                    cout<<"Dequeued element: "<<arr[rear]<<endl;
                    rear--;
                }else{
                    cout<<"Deletion is not possible from end"<<endl;
                }
            }else{
                cout<<"Queue is empty"<<endl;
            }
        }

        void display(){
            if(!isEmpty()){
                for(int i=front;i<=rear;i++)
                    cout<<arr[i]<<" ";
                cout<<endl;
            }else{
                cout<<"Queue is empty"<<endl;
            }
            
        }
};
int main(){
    int size,data,choice;
    cout<<"Enter the size of queue: "<<endl;
    cin>>size;
    Queue q(size);
    while(1){
        cout<<"1. Enqueue at start\n2. Dequeue from start\n3. Enqueue at end\n4. Dequeue at end\n5. Display\n6. Exit"<<endl;
        cout<<"Enter the choice: ";
        cin>>choice;
        switch(choice){
            case 1:
                cout<<"Enter the data: ";
                cin>>data;
                q.enqueueAtStart(data);
                break;
            case 2:
                q.dequeueAtStart();
                break;
            case 3:
                cout<<"Enter the data: ";
                cin>>data;
                q.enqueueAtEnd(data);
                break;
            case 4:
                q.dequeueAtEnd();
                break;
            case 5:
                q.display();
                break;
            case 6:
                exit(0);
            default:
                 cout<<"Please enter correct choice"<<endl;
                break;
        }
    }
}