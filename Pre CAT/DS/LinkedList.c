#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node* next;
};
typedef struct node Node;
Node *head = NULL;

Node* createNode(int data){
    Node* temp = (Node *)malloc( sizeof(Node));
    if(temp == NULL){
        printf("Node creation failed!!!\n");
        exit(1);
    }else{
        temp->data = data;
        temp->next = NULL;
        return temp;
    }
}
void insertAtEnd(int data){
    Node* newNode = createNode(data);
    if(head == NULL){
        head = newNode;
    }else{
        Node* temp = head;
        while(temp->next != NULL){
            temp = temp->next;
        }
        temp->next = newNode;
    }
    printf("%d added successfully!!!\n",data);
}

void insertAtStart(int data){
    Node* newNode = createNode(data);
    if(head == NULL){
        head = newNode;
    }else{
      newNode->next = head;
      head = newNode;
    }
    printf("%d added successfully!!!\n",data);
}

void display(){
    if(head != NULL){
        Node* temp = head;
        while(temp != NULL){
            printf("%d ",temp->data);
            temp = temp->next;
        }
        printf("\n");
    }else{
        printf("LinkList is empty!!!\n");
    }
}

int coutNodes(){
    int count = 0;
    Node* temp=head;
    if(head!=NULL){
        while(temp != NULL){
            count++;
            temp=temp->next;
        }
    }
    return count;
}

int main(){
    display();
    insertAtStart(50);
    insertAtEnd(10);
    insertAtEnd(20);
    insertAtEnd(30);
    insertAtEnd(40);
    display();
    insertAtStart(60);
    display();
    printf("%d",coutNodes());
}