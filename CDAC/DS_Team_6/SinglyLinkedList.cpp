#include<iostream>
#include<stdio.h>
using namespace std;
class Node{
    private:
        int data;
        Node* next;
    public:
        Node(int data){
            this->data = data;
            next = NULL;
        }

        void setData(int data){    //set the data
            this->data = data;
        }

        int getData(){      //get the data
            return data;
        }

        void setNext(Node* next){    //set next
            this->next = next;
        }

        Node* getNext(){      //get next
            return next;
        }
};
class LinkedList{
    private:
        Node* head;
    public:
        LinkedList(){
            head = NULL;
        }

        void addNodeAtLast(int data){
            Node* newNode = new Node(data);
            if(head == NULL){
                head = newNode;
            }else{
                Node* temp = head;
                while(temp->getNext() != NULL){
                    temp = temp->getNext();
                }
                temp->setNext(newNode);
            }
            cout<<data<<" added successfully!!!"<<endl;
        }

        void addNodeAtStart(int data){
            Node* newNode = new Node(data);
            if(head == NULL){
                head = newNode;
            }else{
                newNode->setNext(head);
                head = newNode;
            }
            cout<<data<<" added successfully!!!"<<endl;
        }

        void removeFromEnd(){
            if(head != NULL){
                Node* temp = head;
                if(head->getNext() == NULL){
                    cout<<temp->getData()<<" removed successfully!!!"<<endl;
                    head = NULL;
                    delete temp;
                }else{
                    while(temp->getNext() != NULL && temp->getNext()->getNext() != NULL){
                        temp=temp->getNext();
                    }
                    Node* temp1 = temp->getNext();
                    temp->setNext(NULL);
                    cout<<temp1->getData()<<" removed successfully!!!"<<endl;
                    delete temp1;
                }
            }else{
                cout<<"Linked List is empty!!!"<<endl;
            }
        }

        void removeFromStart(){
            if(head != NULL){
                Node* temp = head;
                if(head->getNext() == NULL){
                    cout<<temp->getData()<<" removed successfully!!!"<<endl;
                    head = NULL;
                    delete temp;
                }else{
                    head = head->getNext();
                    cout<<temp->getData()<<" removed successfully!!!"<<endl;
                    delete temp;
                }
            }else{
                cout<<"Linked List is empty!!!"<<endl;
            }
        }

        void display(){
            if(head != NULL){
                Node* temp = head;
                cout<<"Elements in the LinkedList are ";
                while(temp != NULL){
                    cout<<temp->getData()<<" ";
                    temp=temp->getNext();
                }
                cout<<endl;
            }else{
                cout<<"Linked List is empty!!!"<<endl;
            }
        }
};
void menu(){
    cout<<"1. Display"<<endl;
    cout<<"2. Add node at end"<<endl;
    cout<<"3. Add Node at start"<<endl;
    cout<<"4. Delete Node from end"<<endl;
    cout<<"5. Delete Node form start"<<endl;
    cout<<"Enter the choice: "; 
}
int main(){
    int choice, data;
    LinkedList l;
    while(1){
        menu();
        cin>>choice;
        switch(choice){
            case 1:
                l.display();
                break;
            case 2:
                cout<<"Enter the data: ";
                cin>>data;
                l.addNodeAtLast(data);
                break;
            case 3:
                cout<<"Enter the data: ";
                cin>>data;
                l.addNodeAtStart(data);
                break;
            case 4:
                l.removeFromEnd();
                break;
            case 5:
                l.removeFromStart();
                break;
            default:
                exit(0);
                break;
        }
    }
}