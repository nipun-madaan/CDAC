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

void insertAtMid(int pos, int data){
    Node* newNode = createNode(data);
    if(pos == 1){
        insertAtStart(data);
    }else if(pos >= coutNodes()+1){
        insertAtEnd(data);
    }else{
        int i=1;
        Node* temp=head;
        while(temp != NULL && i != pos-1){
            temp=temp->next;
            i++;
        }
        newNode->next = temp->next;
        temp->next = newNode;
    }
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

void menu(){
    printf("1. Exit\n");
    printf("2. Add at end\n");
    printf("3. Add at start\n");
    printf("4. Add at mid\n");
    /*printf("5. Delete from end\n");
    printf("6. Delete from start\n");
    printf("7. Delete from mid\n");*/
    printf("8. Display\n");
    printf("9. Count\n");
}

int main(){
    int choice,data,position;
    while(1){
        menu();
        printf("Enter your choice: ");
        scanf("%d",&choice);
        switch(choice){
            case 1:
                exit(0);
                break;
            case 2:
                printf("Enter the data to be inserted: ");
                scanf("%d",&data);
                insertAtEnd(data);
                break;
            case 3:
                printf("Enter the data to be inserted: ");
                scanf("%d",&data);
                insertAtStart(data);
                break;
            case 4:
                printf("Enter the position where data is to be inserted: ");
                scanf("%d",&position);
                printf("Enter the data to be inserted: ");
                scanf("%d",&data);
                insertAtMid(position,data);
                break;
            case 8:
                display();
                break;
            case 9:
                printf("%d\n",coutNodes());
                break;
            default:
                printf("Please enter valid input\n");

        }
    }
}