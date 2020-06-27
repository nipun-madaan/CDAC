#include<iostream>
using namespace std;
class Queue{
    private:
        int *arr;
        int size;
        int front;
        int rear;
        int count;
    public:
        Queue(){
            size = 0;
            arr = new int[size];
            front = -1;
            rear = -1;
            count = 0;
        }
        Queue(int size){
            this->size = size;
            arr = new int[size];
            front = -1;
            rear = -1;
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

        void enqueueAtEnd(int data){
            if(!isFull()){
               if(front == -1)
                    front = 0;
                rear++;
                if(rear > size-1)
                    rear = 0;
                arr[rear]=data;
                count++;
            }else{
                cout<<"Queue is full"<<endl;
            }
        }

        void dequeueFromStart(){
            if(!isEmpty()){
                cout<<"Dequeued element : "<<arr[front]<<endl;
                front++;
                if(front > size -1){
                    front = 0;
                }
                count--;
            }else{
                cout<<"Queue is empty"<<endl;
            }
        }

        void enqueueAtStart(int data){
            if(!isFull()){
                if(front == -1){
                    front = 0;
                    rear++;
                    arr[rear] = data;
                }else{
                    front--;
                    if(front<0){
                        front = size-1;
                    }
                    arr[front]=data;
                }
                count++;
            }else{
                cout<<"Queue is full"<<endl;
            }
        }

        void dequeueFromEnd(){
            if(!isEmpty()){
                cout<<"Dequeued element : "<<arr[rear]<<endl;
                rear--;
                if(rear<0)
                    rear = size-1;
                count--;
            }else{
                cout<<"Queue is Empty"<<endl;
            }
        }

        void display(){
            if(!isEmpty()){
                int i=front;
                for(int j=0;j<count;j++){
                    if(i>size-1)
                        i=0;
                    cout<<arr[i]<<" ";
                    i++;
                }
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
        cout<<"1. Enqueue at start\n2. Dequeue from start\n3. Enqueue at end\n4. Dequeue from end\n5. Display\n6. Exit"<<endl;
        cout<<"Enter the choice: ";
        cin>>choice;
        switch(choice){
            case 1:
                cout<<"Enter the data: ";
                cin>>data;
                q.enqueueAtStart(data);
                break;
            case 2:
                q.dequeueFromStart();
                break;
            case 3:
                cout<<"Enter the data: ";
                cin>>data;
                q.enqueueAtEnd(data);
                break;
            case 4:
                q.dequeueFromEnd();
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