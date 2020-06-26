#include<iostream>
using namespace std;
class Data{
    private:
        int data;
        int priority;
    public:
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
typedef class Data D;
class Queue{
    private:
        int size;
        D *arr;
        int front;
        int rear;
    public:
        Queue(){
            size=0;
            arr = new D[size];
            front=-1;
            rear=-1;
        }

        Queue(int size){
            this->size=size;
            arr = new D[size];
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

        void enqueue(D data){
            if(!isFull()){
                if(front == -1){
                    front = 0;
                    rear++;
                    arr[rear]=data;
                }
                else{
                    int i;
                    for(i=rear;i>=front;i--){
                        if(data.getPriority()>arr[i].getPriority()){
                            arr[i+1]=arr[i];
                        }else{
                            break;
                        }
                    }
                    rear++;
                    arr[i+1]=data;
                }
            }else{
                cout<<"Queue is full"<<endl;
            }
        }

        void dequeue(){
            if(!isEmpty()){
                cout<<"Dequeued element: "<<arr[front].getData()<<endl;
                front++;
            }else{
                cout<<"Queue is empty"<<endl;
            }
        }

        void display(){
            if(!isEmpty()){
                for(int i=front;i<=rear;i++){
                    cout<<arr[i].getData()<<" ";
                }
                cout<<endl;
            }else{
                cout<<"Queue is empty"<<endl;
            }
        }
};
int main(){
    int size, choice,data,a,priority;
    cout<<"Enter the size of array: ";
    cin>>size;
    Data d;
    Queue q(size);
    while(1){
        cout<<"1. Enqueue\n2. Dequeue\n3. Display\n4. Exit"<<endl;
        cout<<"Enter your choice: ";
        cin>>choice;
        switch(choice){
            case 1:
                cout<<"Enter the data to be enqueued: ";
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
            default:
                cout<<"Please enter correct choice"<<endl;
                break;
        }
    }
}