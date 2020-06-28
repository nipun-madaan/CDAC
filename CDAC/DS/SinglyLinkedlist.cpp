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

        /*void addBeforeData(int data,int givenData){
            Node* newNode = new Node(data);
            if(head == NULL){
                cout<<"Linklist is empty. "<<givenData<<" not found."<<endl;
            }else{
                Node* temp=head;
                Node* temp1=NULL;
                while(temp != NULL){
                    temp1=temp;
                    if(temp1->getData()==givenData){
                        break;
                    }
                    temp=temp->getNext();
                }
                if(temp != NULL){
                    newNode->setNext(temp1->getNext());
                    temp1->setNext(newNode);
                    cout<<data<<" entered successfully!!!"<<endl;
                }else{
                   cout<<givenData<<" not found!!!"<<endl;
                }
            }
        }*/
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
  //  cout<<"5. Add node before data"<<endl;
    cout<<"#################### Menu ##########################"<<endl;
}
int main(){
    LinkedList l;
    int choice,data,givenData;
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
           /* case 5:
                cout<<"Enter the data to be added: ";
                cin>>data;
                cout<<"Enter the data before which the node is to be inserted: ";
                cin>>givenData;
                l.addBeforeData(data,givenData);
                break;*/
            default:
                cout<<"Enter the correct choice!!!"<<endl;
        }
    }
}