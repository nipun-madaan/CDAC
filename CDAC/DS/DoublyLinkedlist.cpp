#include<iostream>
#include<stdlib.h>
using namespace std;
class Node{
    private:
        int data;
        Node* next;
        Node* prev;
    public:
        Node(int data){
            this->data = data;
            next = NULL;
            prev = NULL;
        }

        void setData(int data){
            this->data = data;
        }

        int getData(){
            return data;
        }

        void setNext(Node* next){
            this->next = next;
        }

        Node* getNext(){
            return next;
        }

        void setPrev(Node* prev){
            this->prev = prev;
        }

        Node* getPrev(){
            return prev;
        }
};
class DoublyLinkedlist{
    private:
        Node* head;

    public:
        DoublyLinkedlist(){
            head = NULL;
        }

        void addAtEnd(int data){
            Node* newNode = new Node(data);
            if(head == NULL){
                head = newNode;
            }else{
               Node* temp = head;
               while(temp->getNext() != NULL){
                   temp = temp->getNext();
               }
                temp->setNext(newNode);
                newNode->setPrev(temp);
            }
            cout<<data<<" added successfully"<<endl;
        }

        void display(){
            if(head == NULL){
                cout<<"LinkedList is empty"<<endl;
            }else{
                Node* temp = head;
                while(temp != NULL){
                    cout<<temp->getData()<<" ";
                    temp=temp->getNext();
                }
                cout<<endl;
            }
        }

        void addAtStart(int data){
            Node* newNode = new Node(data);
            if(head == NULL){
                head = newNode;
            }else{
                newNode->setNext(head);
                head->setPrev(newNode);
                head = newNode;
            }
            cout<<data<<" added successfully"<<endl;
        }

        void deleteFromEnd(){
            if(head == NULL){
                cout<<"LinkedList is empty"<<endl;
            }else{
                Node* temp = head;
                while(temp != NULL && temp->getNext() != NULL){
                    temp = temp->getNext();
                }
                if(temp != NULL && temp->getPrev() != NULL)
                    temp->getPrev()->setNext(NULL);
                else
                {
                    head = NULL;
                }
                
                cout<<temp->getData()<<" deleted successfully"<<endl;
                delete temp;
            }
        }

        void deleteFromStart(){
            if(head == NULL){
                cout<<"LinkedList is empty"<<endl;
            }else{
                Node* temp=head;
                if(head->getNext() != NULL){
                    head = head->getNext();
                    head->setPrev(NULL);
                }else
                {
                    head = NULL;
                }
                cout<<temp->getData()<<" deleted successfully"<<endl;
                delete temp;
            }
        }

};
void menu(){
    cout<<"\n########################### Menu ##################################"<<endl;
    cout<<"1. Display"<<endl;
    cout<<"2. Add Node at end"<<endl;
    cout<<"3. Add Node at start"<<endl;
    cout<<"4. Delete from end"<<endl;
    cout<<"5. Delete from start"<<endl;
    cout<<"###################################################################\n"<<endl;
}
int main(){
    DoublyLinkedlist l;
    int data,choice;
    while(1){
        menu();
        cout<<"Enter your choice: ";
        cin>>choice;
        switch(choice){
            case 1:
                l.display();
                break;
            case 2:
                cout<<"Enter the element to be added at the end: ";
                cin>>data;
                l.addAtEnd(data);
                break;
            case 3:
                cout<<"Enter the element to be added at the start: ";
                cin>>data;
                l.addAtStart(data);
                break;
            case 4:
                l.deleteFromEnd();
                break;
            case 5:
                l.deleteFromStart();
                break;
            default:
                cout<<"Please enter valid choice!!!!!!!!"<<endl;
        }
    }
}