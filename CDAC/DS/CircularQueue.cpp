#include<iostream>
using namespace std;
class Queue{
    private:
        int size;
        int *arr;
        int front;
        int rear;
        int count;
    public:
        Queue(){
            size = 0;
            arr=new int[0];
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
            if(count == 0)
                return true;
            else
                return false;
        }

        bool isFull(){
            if(count == size)
                return true;
            else
                return false;
        }

        void enqueue(int data){
            if(!isFull()){
                if(front == -1)
                    front = 0;
                rear++;
                if(rear>size-1)
                    rear = 0;
                arr[rear]=data;
                count++;
            }else{
                cout<<"Queue is full"<<endl;
            }
        }        

        void dequeue(){
            if(!isEmpty()){
                cout<<"Dequeued element: "<<arr[front]<<endl;
                front++;
                if(front > size -1){
                    front = 0;
                }
                count--;
            }else{
            cout<<"Queue is empty"<<endl;
            }
        }

        void display(){
            if(!isEmpty()){
                int j=front;
                for(int i=0;i<count;i++){
                    if(j>size-1)
                        j=0;
                    cout<<arr[j]<<" ";
                    j++;
                }
                cout<<endl;
            }else{
                cout<<"Queue is empty"<<endl;
            }
        }    
};
int main(){
    int size,data,choice;
    cout<<"Enter the size of queue: ";
    cin>>size;
    Queue q(size);
    while(1){
        cout<<"1. Enqueue\n2. Dequeue\n3. Display\n4. Exit"<<endl;
        cout<<"Enter the choice: ";
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
                cout<<"Please enter correct choice"<<endl;
                break;                      

        }
    }
}