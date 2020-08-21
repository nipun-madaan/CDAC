#include<iostream>
#include<stdlib.h>
using namespace std;
class Queue{
    private:
        int *arr;
        int front;
        int rear;
        int size;
        int count;
    public:
        Queue(int size){
            arr = new int[size];
            this->size = size;
            front = rear = -1;
            count = 0;
        }
        bool isEmpty(){
            if(count == 0){
                return true;
            }else{
                return false;
            }
        }

        bool isFull(){
            if(count == size){
                return true;
            }else{
                return false;
            }
        }

        void enqueueAtLeft(int data){
            if(!isFull()){
                if(front == -1 && rear == -1){
                    front++;
                    rear++;
                    arr[front] = data;
                }else{
                    front--;
                    if(front<0){
                        front = size-1;
                    }
                    arr[front] = data;
                }
                count++;
                cout<<data<<" enqueued successfully!!!"<<endl;
            }else{
                cout<<"Queue is full!!!"<<endl;
            }
        }

        void enqueueAtRight(int data){
            if(!isFull()){
                if(front == -1 && rear == -1){
                    front++;
                    rear++;
                    arr[rear] = data;
                }else{
                    rear++;
                    if(rear > size-1)
                        rear = 0;
                    arr[rear] = data;
                }
                count++;
                cout<<data<<" enqueued successfully!!!"<<endl;
            }else{
                cout<<"Queue is full!!!"<<endl;
            }
        }

        void dequeueFromRight(){
            if(!isEmpty()){
                cout<<"Dequeued element is "<<arr[rear]<<endl;
                rear--;
                if(rear < 0){
                    rear = size-1;
                }
                count--;
            }else{
                cout<<"Queue is empty!!!!"<<endl;
            }
        }

        void dequeueFromLeft(){
            if(!isEmpty()){
                cout<<"Dequeued element is "<<arr[front]<<endl;
                front++;
                if(front>size-1){
                    front = 0;
                }
                count--;
            }else{
                cout<<"Queue is empty!!!"<<endl;
            }
        }

        void display(){
            if(!isEmpty()){
                int j = front;
                cout<<"Elements in queue are ";
                for(int i=1;i<=count;i++){
                    if(j > size -1){
                        j = 0;
                    }
                    cout<<arr[j]<<" ";
                    j++;
                }
                cout<<endl;
            }else{
                cout<<"Queue is empty!!!"<<endl;
            }
        }
};
int main(){
    int size,choice,data;
    cout<<"Enter the size of queue: ";
    cin>>size;
    Queue q(size);
    while (1)
    {
        cout<<"1. Enqueue At Left\n2. Dequeue From Left\n3. Enqueue At Right\n4. Dequeue From Right\n5. Display\n6. Exit"<<endl;
        cout<<"Enter the choice: ";
        cin>>choice;
        switch (choice)
        {
            case 1:
                cout<<"Enter the data: ";
                cin>>data;
                q.enqueueAtLeft(data);
                break;
            case 2:
                q.dequeueFromLeft();
                break;
            case 3:
                cout<<"Enter the data: ";
                cin>>data;
                q.enqueueAtRight(data);
                break;
            case 4:
                q.dequeueFromRight();
                break;
            case 5:
                q.display();
                break;
            case 6:
                exit(0);
                break;
            default:
                cout<<"Enter the correct choice!!!"<<endl;
                break;
        }
    }
    
}