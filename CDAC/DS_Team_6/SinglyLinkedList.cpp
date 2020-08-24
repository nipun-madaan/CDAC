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

        void addNodeAfterData(int data,int after){
            Node* newNode = new Node(data);
            if(head != NULL){
                Node* temp = head;
                while(temp != NULL&& temp->getData() != after ){
                    temp = temp->getNext();
                }
                if(temp != NULL){
                    newNode->setNext(temp->getNext());
                    temp->setNext(newNode);
                    cout<<data<<" added sucessfully!!!"<<endl;
                }else{
                    cout<<data<<" not found!!!"<<endl;
                }
            }else{
                cout<<"LinkedList is empty. Can't find the data"<<endl;
            }
        }   

        void addNodeBeforeData(int data, int before){
            Node* newNode = new Node(data);
            if(head != NULL){
                if(head->getData() == before){
                    addNodeAtStart(data);
                }else{
                    Node* temp=head;
                    while(temp != NULL && temp->getNext() != NULL && temp->getNext()->getData() != before){
                        temp = temp->getNext();
                    }
                    if(temp != NULL){
                        newNode->setNext(temp->getNext());
                        temp->setNext(newNode);
                        cout<<data<<" added successfully!!!"<<endl;
                    }else{
                        cout<<data<<" not found!!!"<<endl;
                    }
                }
            }else{
                cout<<"LinkedList is empty. Can't find the data"<<endl;
            }
        }

        void removeAfterData(int after){
            if(head != NULL){
                Node* temp = head;
                while(temp != NULL && temp->getData() != after){
                    temp = temp->getNext();
                }
                if(temp != NULL && temp->getNext() != NULL){
                    Node* temp1 = temp->getNext();
                    temp->setNext(temp->getNext()->getNext());
                    cout<<temp1->getData()<<" removed successfully!!!"<<endl;
                    delete temp1;
                }else{
                    cout<<"Can't remove data!!!"<<endl;
                }
            }else{
                cout<<"LinkedList is empty!!!"<<endl;
            }
        }

        void removeBeforeData(int before){
            if(head != NULL){
                if(head->getData() != before){
                    Node* temp = head;
                    if(head->getNext() != NULL && head->getNext()->getData() == before){
                        removeFromStart();
                    }else{
                        while(temp->getNext()->getNext() != NULL && temp->getNext()->getNext()->getData() != before){
                            temp = temp->getNext();
                        }

                        if(temp->getNext()->getNext() != NULL){
                            Node* temp1 = temp->getNext();
                            temp->setNext(temp->getNext()->getNext());
                            cout<<temp1->getData()<<" removed suceesfully!!!"<<endl;
                            delete temp1;
                        }else{
                            cout<<"Can't remove data!!!"<<endl;
                        }
                    }
                    
                }else{  
                    cout<<"Can't remove data!!!"<<endl;
                }
            }else{
                cout<<"LinkedList is empty!!!"<<endl;
            }
        }

        void deleteNode(int data){
            if(head != NULL){
                Node* temp = head;
                if(head ->getData() == data){
                    removeFromStart();
                }else{
                    while(temp->getNext() != NULL && temp->getNext()->getData() != data){
                        temp = temp->getNext();
                    }
                    if(temp->getNext() != NULL){
                        Node* temp1 = temp->getNext();
                        temp->setNext(temp->getNext()->getNext());
                        cout<<temp1->getData()<<" removed sucessfully!!!"<<endl;
                    }else{
                       cout<<"Can't remove data!!!"<<endl;  
                    }
                }
            }else{
                cout<<"LinkedList is empty!!!"<<endl; 
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

        void addNodeAfterPosition(int data, int position){
            Node* newNode = new Node(data);
            if(head != NULL){
                if(position > 0){
                    Node* temp = head;
                    int count = 1;
                    while(temp != NULL && count != position){
                        temp = temp->getNext();
                        count++;
                    }
                    if(temp != NULL){
                        newNode->setNext(temp->getNext());
                        temp->setNext(newNode);
                        cout<<data<<" added successfully!!!"<<endl;
                    }else{
                        cout<<"Wrong position entered!!!"<<endl;
                    }
                }else{
                    cout<<"Invalid position!!!"<<endl;
                }
            }else{
                cout<<"Linked List is empty!!!"<<endl;
            }
        }

        void addNodeBeforePosition(int data, int position){
            Node* newNode = new Node(data);
            if(head != NULL){
                if(position > 0){
                    if(position == 1){
                        addNodeAtStart(data);
                    }else{
                        Node* temp = head;
                        int count = 1;
                        while(temp != NULL && count != position-1){
                            temp = temp->getNext();
                            count++;
                        }
                        if(temp != NULL){
                            newNode->setNext(temp->getNext());
                            temp->setNext(newNode);
                            cout<<data<<" added successfully!!!"<<endl;
                        }else{
                            cout<<"Wrong position entered!!!"<<endl;
                        }
                    }
                }else{
                    cout<<"Invalid position!!!"<<endl;
                }
            }else{
                cout<<"LinkedList is empty!!!"<<endl;
            }
        }

        void addNodeAtPosition(int data, int position){
            Node* newNode = new Node(data);
            if(head != NULL){
                if(position > 0){
                    if(position == 1){
                        addNodeAtStart(data);
                    }else{
                        Node* temp = head;
                        int count = 1;
                       // Node* temp1;
                        if(temp != NULL && count != (position - 1)){
                            //temp1 = temp;
                            temp = temp->getNext();
                            count++;
                        }
                        if(temp != NULL){
                            newNode->setNext(temp->getNext());
                            temp->setNext(newNode);
                        }else{
                            cout<<"Wrong position entered!!!"<<endl;
                            //temp1->setNext(newNode);
                        }
                        cout<<data<<" added successfully!!!"<<endl;
                    }
                }else{
                    cout<<"Invalid position!!!"<<endl;
                }
            }else{
                cout<<"LinkedList is Empty!!!"<<endl;
            }
        }
};
void menu(){
    cout<<"1. Display"<<endl;
    cout<<"2. Add node at end"<<endl;
    cout<<"3. Add Node at start"<<endl;
    cout<<"4. Delete Node from end"<<endl;
    cout<<"5. Delete Node form start"<<endl;
    cout<<"6. Add node after given node"<<endl;
    cout<<"7. Add node before given node"<<endl;
    cout<<"8. Remove node after given node"<<endl;
    cout<<"9. Remove node before given node"<<endl;
    cout<<"10. Remove a particular node"<<endl;
    cout<<"11. Add node after position"<<endl;
    cout<<"12. Add node before position"<<endl;
    cout<<"13. Add node at position"<<endl;
    cout<<"Enter the choice: "; 
}
int main(){
    int choice, data, givenData, position;
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
            case 6:
                cout<<"Enter the data to be added: ";
                cin>>data;
                cout<<"Enter the data after which node is to be added: ";
                cin>>givenData;
                l.addNodeAfterData(data, givenData);
                break;
            case 7:
                cout<<"Enter the data to be added: ";
                cin>>data;
                cout<<"Enter the data before which node is to be added: ";
                cin>>givenData;
                l.addNodeBeforeData(data, givenData);
                break;
            case 8:
                cout<<"Enter the data after which node to be removed: ";
                cin>>givenData;
                l.removeAfterData(givenData);
                break;
            case 9:
                cout<<"Enter the data before which node to be removed: ";
                cin>>givenData;
                l.removeBeforeData(givenData);
                break;
            case 10:
                cout<<"Enter the data to be removed: ";
                cin>>givenData;
                l.deleteNode(givenData);
                break;
            case 11:
                cout<<"Enter the data to be added: ";
                cin>>data;
                cout<<"Enter the position after which node is to be added:";
                cin>>position;
                l.addNodeAfterPosition(data,position);
                break;
            case 12:
                cout<<"Enter the data to be added: ";
                cin>>data;
                cout<<"Enter the position before which node is to be added:";
                cin>>position;
                l.addNodeBeforePosition(data,position);
                break;
            case 13:
                cout<<"Enter the data to be added: ";
                cin>>data;
                cout<<"Enter the position at which node is to be added:";
                cin>>position;
                l.addNodeAtPosition(data,position);
                break;
            default:
                exit(0);
                break;
        }
    }
}