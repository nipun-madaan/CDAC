#include<iostream>
using namespace std;
class Queue{
    private:
        int *arr;
        int size;
        int front;
        int rear;
    public:
        Queue(int size){
            arr = new int[size];
            this->size = size;
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
            if(front == 0 && rear == size - 1){
                return true;
            }else{
                return false;
            }
        }

        void enqueueAtEnd(int data){
            if(!isFull()){
                if(rear >= size-1){
                    cout<<"Can't enqueue at the end!!!"<<endl;
                }else{
                    if(front == -1)
                        front++;
                    rear++;
                    arr[rear] = data;
                    cout<<data<<" enqueued successfully!!!"<<endl;
                }
                
            }else{
                cout<<"Queue is full!!!"<<endl;
            }
        }

        void dequeueFromStart(){
            if(!isEmpty()){
                cout<<"Dequeued element is "<<arr[front++]<<endl;
            }else{
                cout<<"Queue is empty!!!"<<endl;
            }
        }

        void enqueueAtStart(int data){
            if(!isFull()){
                if(front == -1){
                    front++;
                    rear++;
                    arr[front] = data;
                    cout<<data<<" enqueued successfully!!!"<<endl;
                }else if(front > 0){
                    front--;
                    arr[front] = data;
                    cout<<data<<" enqueued successfully!!!"<<endl;
                }else{
                    cout<<"Can't enqueue from start!!!"<<endl;
                }
            }else{
                cout<<"Queue is full!!!"<<endl;
            }
        }

        void dequeueFromEnd(){
            if(!isEmpty()){
                cout<<"Dequeued element is "<<arr[rear--]<<endl;
            }else{
                cout<<"Queue is empty!!!"<<endl;
            }
        }

        void display(){
            if(!isEmpty()){
                cout<<"Elements in queue are ";
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
        cout<<"1. Enqueue at start\n2. Dequeue from end\n3. Enqueue at end\n4. Dequeue from start\n5. Display\n6. Exit"<<endl;
        cout<<"Enter your choice: ";
        cin>>choice;
        switch(choice){
            case 1:
                cout<<"Enter the data: ";
                cin>>data;
                q.enqueueAtStart(data);
                break;
            case 2:
                q.dequeueFromEnd();
                break;
            case 3:
                cout<<"Enter the data: ";
                cin>>data;
                q.enqueueAtEnd(data);
                break;
            case 4:
                q.dequeueFromStart();
                break;
            case 5: 
                q.display();
                break;
            case 6:
                exit(0);
            default:
                cout<<"Enter the correct choice!!!"<<endl;
        }
    }
}