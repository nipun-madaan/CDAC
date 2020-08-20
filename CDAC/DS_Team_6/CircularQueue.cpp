#include<iostream>
#include<stdlib.h>
using namespace std;
class Queue{
    private:
        int *arr;
        int size;
        int front;
        int rear;
        int count;

    public:
        Queue(int size){
            this->size = size;
            arr = new int[size];
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

        void enqueue(int data){
            if(!isFull()){
                if(front == -1 && rear == -1){
                    front++;
                    rear++;
                    arr[rear] = data;
                }else if(rear == size - 1){
                    rear = 0;
                    arr[rear] = data;
                }else{
                    rear++;
                    arr[rear]=data;
                }
                count++;
                cout<<data<<" enqueue sucessfully!!!"<<endl;
            }else{
            cout<<"Queue is full!!!"<<endl;
            }
        }

        void dequeue(){
            if(!isEmpty()){
                cout<<"Dequeued element is "<<arr[front]<<endl;
                if(front == size-1)
                    front = 0;
                else
                    front++;
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
                    if(j>size-1)
                        j=0;
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