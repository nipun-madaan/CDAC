#include<iostream>
#include<stdio.h>
using namespace std;
class Data{
    private:
        int data;
        int priority;
    public:
        Data(){
            data = 0;
            priority = 0;
        }

        Data(int data, int priority){
            this->data = data;
            this->priority = priority;
        }

        void setData(int data){
            this->data = data;
        }

        int getData(){
            return data;
        }

        void setPriority(int priority){
            this->priority = priority;
        }

        int getPriority(){
            return priority;
        }
};
typedef Data D;
class Queue{
    private:
        int size;
        D *arr;
        int front;
        int rear;
    public:
        Queue(int size){
            this->size = size;
            arr = new D[size];
            front = rear = -1;
        }

        bool isEmpty(){
            if((front = -1 && rear == -1) || front > rear){
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

        void enqueue(D data){
           if(!isFull()){
               if(front == -1 && rear == -1){
                   front++;
                   rear++;
                   arr[rear] = data;
               }else{
                   int i;
                   for(i = rear;i>=front;i--){
                       if(data.getPriority()>arr[i].getPriority()){
                           arr[i+1]=arr[i];
                       }else{
                           break;
                       }
                   }
                   rear++;
                   arr[i+1] = data;
               }
               cout<<data.getData()<<" enqueued successfully!!!"<<endl;
           }else{
               cout<<"Queue is full!!!"<<endl;
           }
        }

        void dequeue(){
            if(!isEmpty()){
                cout<<"Dequeued element is "<<arr[front].getData()<<endl;
                front++;
            }else{
                cout<<"Queue is empty!!!"<<endl;
            }
        }

        void display(){
            if(!isEmpty()){
                cout<<"Elements in queue are ";
                for(int i=front;i<=rear;i++){
                    cout<<arr[i].getData()<<" ";
                }
                cout<<endl;
            }else{
                cout<<"Queue is empty!!!"<<endl;
            }
        }
};
int main(){
    int size,data,priority,choice;
    cout<<"Enter the size of queue: ";
    cin>>size;
    Data d;
    Queue q(size);
    while(1){
        cout<<"1. Enqueue\n2. Dequeue\n3. Display\n4. Exit"<<endl;
        cout<<"Enter your choice:";
        cin>>choice;
        switch (choice)
        {
            case 1:
                cout<<"Enter the data: ";
                cin>>data;
                cout<<"Enter the priority: ";
                cin>>priority;
                d.setData(data);
                d.setPriority(priority);
                q.enqueue(d);
                break;
            case 2:
                q.dequeue();
                break;
            case 3:
                q.display();
                break;
            case 4:
                exit(0);
                break;
            default:
                cout<<"Enter the correct choice!!!"<<endl;
                break;
        }
    }
}