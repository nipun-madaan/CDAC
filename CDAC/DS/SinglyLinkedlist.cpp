#include<iostream>
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
};
class LinkedList{
    private:
        Node* head;
    public:
        LinkedList(){
            head = NULL;
        }


        void addAtEnd(int data){
            Node* newNode = new Node(data);
            if(head == NULL){
                head = newNode;
            }else{
                Node* temp = head;
                while(temp->getNext() != NULL){
                    temp=temp->getNext();
                }
                temp->setNext(newNode);
            }
            cout<<data<<" entered successfully!!!"<<endl;
        }

        void addAtBeg(int data){
            Node* newNode = new Node(data);
            if(head == NULL){
                head = newNode;
            }else{
                newNode->setNext(head);
                head = newNode;
            }
            cout<<data<<" entered successfully!!!"<<endl;
        }

        void addAfterData(int data,int givenData){
            Node* newNode = new Node(data);
            if(head == NULL){
                cout<<"Linklist is empty. "<<givenData<<" not found."<<endl;
            }else{
                Node* temp=head;
                while(temp != NULL){
                    if(temp->getData() == givenData){
                        break;
                    }
                    temp=temp->getNext();
                }
                if(temp != NULL){
                    newNode->setNext(temp->getNext());
                    temp->setNext(newNode);
                    cout<<data<<" entered successfully!!!"<<endl;
                }else{
                    cout<<givenData<<" not found!!!"<<endl;
                }
            }
        }

        void addBeforeData(int data,int givenData){
            Node* newNode = new Node(data);
            if(head == NULL){
                cout<<"Linklist is empty. "<<givenData<<" not found."<<endl;
            }else{
                Node* temp=head;
                while(temp != NULL){
                    if(temp->getData() == givenData || (temp->getNext() != NULL && temp->getNext()->getData()==givenData)){
                        break;
                    }
                    temp=temp->getNext();
                }
                if(temp != NULL){
                    newNode->setNext(temp->getNext());
                    temp->setNext(newNode);
                    cout<<data<<" entered successfully!!!"<<endl;
                }else{
                   cout<<givenData<<" not found!!!"<<endl;
                }
            }
        }

        void addAfterPosition(int data, int position){
            Node* newNode = new Node(data);
            if(position>0){
                Node* temp=head;
                int count=1;
                while(temp != NULL){
                    if(count == position)
                        break;
                    temp=temp->getNext();
                    count++;
                }
                if(temp != NULL){
                    newNode->setNext(temp->getNext());
                    temp->setNext(newNode);
                    cout<<data<<" entered successfully!!!"<<endl;
                }else{
                    cout<<"Wrong position entered"<<endl;
                }
            }else{
                cout<<"Invalid position"<<endl;
            }
        }

        void addBeforePosition(int data, int position){
            Node* newNode = new Node(data);
            if(position>0){
                Node* temp=head;
                int count=1;
                while(temp != NULL){
                    if(count == position-1)
                        break;
                    temp=temp->getNext();
                    count++;
                }
                if(temp != NULL){
                    newNode->setNext(temp->getNext());
                    temp->setNext(newNode);
                    cout<<data<<" entered successfully!!!"<<endl;
                }else{
                    cout<<"Wrong position entered"<<endl;
                }
            }else{
                cout<<"Invalid position"<<endl;
            }
        }

        void addAtPosition(int data,int position){
            Node* newNode = new Node(data);
            if(position>0){
                Node* temp=head;
                Node* temp1=NULL;
                int count = 1;
                if(position == 1){
                    newNode->setNext(head);
                    head = newNode;
                }else{
                    while(temp != NULL){
                        temp1=temp;
                        if(count == position-1)
                            break;
                        temp=temp->getNext();
                        count++;
                    }
                    if(temp != NULL){
                        newNode->setNext(temp->getNext());
                        temp->setNext(newNode);
                    }else{
                        //cout<<"Wrong position entered"<<endl;
                        temp1->setNext(newNode);
                    }
                }
                cout<<data<<" entered successfully!!!"<<endl; 
            }else{
                cout<<"Invalid position"<<endl;
            }
        }

        void deleteFromBeg(){
            if(head == NULL){
                cout<<"LinkedList is empty"<<endl;
            }else{
                Node* temp = head;
                cout<<head->getData()<<" deleted!!!"<<endl;
                head = head->getNext();
                delete temp;
            }
        }

        void deleteFromEnd(){
            if(head == NULL){
                cout<<"LinkedList is empty"<<endl;
            }else{
                Node* temp=head;
                Node* temp1=NULL;
                while(temp->getNext() != NULL){
                    temp1=temp;
                    temp=temp->getNext();
                }
                cout<<temp->getData()<<" deleted!!!"<<endl;
                if(temp1 != NULL)
                    temp1->setNext(NULL);
                else
                    head = NULL;
                delete temp;
            }
        }

        void deleteNode(int data){
            if(head == NULL){
                cout<<"LinkedList is empty"<<endl;
            }else{
                Node* temp=head;
                Node* temp1=NULL;
                if(head->getData() == data){
                    head = head->getNext();
                     cout<<head->getData()<<" deleted!!!"<<endl;
                    delete temp;
                }else
                {
                    while(temp != NULL && temp->getData() != data){
                        temp1=temp;
                        temp=temp->getNext();
                    }
                    cout<<temp->getData()<<" deleted!!!"<<endl;
                    if(temp1 != NULL)
                        temp1->setNext(NULL);
                    else
                        head = NULL;
                    delete temp;
                }
            }
        }

        void deleteAfterData(int givenData){
            if(head == NULL){
                cout<<"LinkList is empty"<<endl;
            }else{
                Node* temp = head;
                Node* temp1 = NULL;
                while(temp != NULL && temp->getData() != givenData)
                {
                    temp=temp->getNext();
                }
                if(temp != NULL && temp->getNext() != NULL){
                    temp1=temp->getNext();
                    cout<<temp1->getData()<<" deleted!!!"<<endl;
                    temp->setNext(temp1->getNext());
                    delete temp1;
                }else{
                    cout<<"Data can't be deleted"<<endl;
                }
            }
        }

        void deleteBeforeData(int givenData){
            if(head == NULL){
                cout<<"LinkList is empty"<<endl;
            }else{
                Node* temp = head;
                Node* temp1 = NULL;
                if(head->getNext() != NULL && head->getNext()->getData() == givenData){
                    head = head->getNext();
                    cout<<temp->getData()<<" deleted!!!"<<endl;
                    delete temp;
                }else{
                    while(temp != NULL && temp->getNext() != NULL && temp->getNext()->getData() != givenData)
                    {
                        temp1=temp;
                        temp=temp->getNext();
                    }
                    if(temp->getNext() != NULL){
                        cout<<temp->getData()<<" deleted!!!"<<endl;
                        temp1->setNext(temp->getNext());
                        delete temp;
                    }else{
                        cout<<"Data can't be deleted"<<endl;
                    }
                }
               
            }
        }

        void deleteAtPosition(int position){
            if(head == NULL){
                cout<<"LinkList is empty"<<endl;
            }else{
                int count=1;
                Node* temp=head;
                Node* temp1 = NULL;
                if(position == 1){
                    head=head->getNext();
                    cout<<temp->getData()<<" deleted!!!"<<endl;
                    delete temp;
                }else{
                    while(temp != NULL && count != position-1){
                        temp=temp->getNext();
                        count++;
                    }
                    if(temp != NULL && temp->getNext() != NULL){
                        temp1=temp->getNext();
                        temp->setNext(temp1->getNext());
                        cout<<temp1->getData()<<" deleted!!!"<<endl;
                        delete temp1;
                    }else{
                        cout<<"Wrong position entered"<<endl;
                    }
                }
            }
        }

        void deleteAfterPosition(int position){
            if(head == NULL){
                cout<<"LinkList is empty"<<endl;
            }else{
                int count=1;
                Node* temp=head;
                Node* temp1=NULL;
                while(temp != NULL && count != position){
                    temp=temp->getNext();
                    count++;
                }
                if(temp != NULL && temp->getNext() != NULL){
                    temp1=temp->getNext();
                    temp->setNext(temp1->getNext());
                    cout<<temp1->getData()<<" deleted!!!"<<endl;
                    delete temp1;
                }else{
                    cout<<"Wrong position entered!!!"<<endl;
                }
            }
        }

        void deleteBeforePosition(int position){
            if(head == NULL){
                cout<<"LinkList is empty"<<endl;
            }else{
                int count=1;
                Node* temp=head;
                Node* temp1 = NULL;
                if(position == 2){
                    head=head->getNext();
                    cout<<temp->getData()<<" deleted!!!"<<endl;
                    delete temp;
                }else{
                    while(temp != NULL && count != position-2){
                        temp=temp->getNext();
                        count++;
                    }
                    if(temp != NULL && temp->getNext() != NULL){
                        temp1=temp->getNext();
                        temp->setNext(temp1->getNext());
                        cout<<temp1->getData()<<" deleted!!!"<<endl;
                        delete temp1;
                    }else{
                        cout<<"Wrong position entered"<<endl;
                    }
                }
            }
        }

        void reverseLinklist(LinkedList *l){
            if(l->head == NULL){
                cout<<"LinkList is empty"<<endl;
            }else{
                LinkedList l1;
                Node* temp=l->head;
                while(temp != NULL){
                    Node* newNode = new Node(temp->getData());
                    if(l1.head == NULL){
                        l1.head = newNode;
                    }else{
                        newNode->setNext(l1.head);
                        l1.head = newNode;
                    }
                    temp = temp->getNext();
                }
                cout<<"LinkList: ";
                l->display();
                cout<<"ReverseLinkList: ";
                l1.display();
            }
        }

        void findMiddleNode(){
            if(head == NULL){
                cout<<"Linklist is empty"<<endl;
            }else{
                Node* temp = head;
                Node* temp1 = head;
                while(temp!=NULL && temp->getNext() != NULL && 
                    temp->getNext()->getNext() != NULL){
                        temp = temp->getNext()->getNext();
                        temp1 = temp1->getNext();
                    }
                    if(temp1 != NULL){
                        cout<<"Middle Element: "<<temp1->getData()<<endl;
                    }
            }
        }
        void display(){
            if(head == NULL){
                cout<<"Linklist is empty"<<endl;
            }else{
                Node* temp = head;
                while(temp != NULL){
                    cout<<temp->getData()<<" ";
                    temp = temp->getNext();
                }
                cout<<endl;
            }
        }
};
void menu(){
    cout<<"#################### Menu ##########################"<<endl;
    cout<<"1. Display"<<endl;
    cout<<"2. Add node at end"<<endl;
    cout<<"3. Add node at beg"<<endl;
    cout<<"4. Add node after data"<<endl;
    cout<<"5. Add node before data"<<endl;
    cout<<"6. Add node after position"<<endl;
    cout<<"7. Add node before position"<<endl;
    cout<<"8. Add node at position"<<endl;
    cout<<"9. Delete node from beg"<<endl;
    cout<<"10. Delete node from end"<<endl;
    cout<<"11. Delete given node"<<endl;
    cout<<"12. Delete node after data"<<endl;
    cout<<"13. Delete node before data"<<endl;
    cout<<"14. Delete node at position"<<endl;
    cout<<"15. Delete node after position"<<endl;
    cout<<"16. Delete node before position"<<endl;
    cout<<"17. Reverse Linklist"<<endl;
    cout<<"18. Find Middle Node"<<endl;
    cout<<"#################### Menu ##########################"<<endl;
}
int main(){
    LinkedList l;
    int choice,data,givenData,position;
    while(1){
        menu();
        cout<<"Enter the choice: ";
        cin>>choice;
        switch(choice){
            case 1:
                l.display();
                break;
            case 2:
                cout<<"Enter the data to be added: ";
                cin>>data;
                l.addAtEnd(data);
                break;
            case 3:
                cout<<"Enter the data to be added: ";
                cin>>data;
                l.addAtBeg(data);
                break;
            case 4:
                cout<<"Enter the data to be added: ";
                cin>>data;
                cout<<"Enter the data after which the node is to be inserted: ";
                cin>>givenData;
                l.addAfterData(data,givenData);
                break;
            case 5:
                cout<<"Enter the data to be added: ";
                cin>>data;
                cout<<"Enter the data before which the node is to be inserted: ";
                cin>>givenData;
                l.addBeforeData(data,givenData);
                break;
            case 6:
                cout<<"Enter the data to be added: ";
                cin>>data;
                cout<<"Enter the position after which the node is to be inserted: ";
                cin>>position;
                l.addAfterPosition(data,position);
                break;
            case 7:
                cout<<"Enter the data to be added: ";
                cin>>data;
                cout<<"Enter the position before which the node is to be inserted: ";
                cin>>position;
                l.addBeforePosition(data,position);
                break;
            case 8:
                cout<<"Enter the data to be added: ";
                cin>>data;
                cout<<"Enter the position at which the node is to be inserted: ";
                cin>>position;
                l.addAtPosition(data,position);
                break;
            case 9:
                l.deleteFromBeg();
                break;
            case 10:
                l.deleteFromEnd();
                break;
            case 11:
                cout<<"Enter data to be deleted: ";
                cin>>data;
                l.deleteNode(data);
                break;
            case 12:
                cout<<"Enter data after which node is to be deleted: ";
                cin>>data;
                l.deleteAfterData(data);  
                break; 
            case 13:
                cout<<"Enter data before which node is to be deleted: ";
                cin>>data;
                l.deleteBeforeData(data);  
                break;  
            case 14:
                cout<<"Enter the position of node to be deleted: ";
                cin>>position;
                l.deleteAtPosition(position);
                break;
            case 15:
                cout<<"Enter the position after which node is to be deleted: ";
                cin>>position;
                l.deleteAfterPosition(position);
                break;
            case 16:
                cout<<"Enter the position before which node is to be deleted: ";
                cin>>position;
                l.deleteBeforePosition(position);
                break;
            case 17:
                l.reverseLinklist(&l);
                break;
            case 18:
                l.findMiddleNode();
                break;
            default:
                cout<<"Enter the correct choice!!!"<<endl;
        }
    }
}