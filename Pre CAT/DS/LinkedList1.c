#include<stdio.h>
#include<stdlib.h>
struct node{
	int data;
	struct node* next;
};
typedef struct node Node;
Node* head = NULL;
Node* createNode(int data){
	Node* newNode = (Node*)malloc(sizeof(Node));
	newNode->data = data;
	newNode->next = NULL;
	if(newNode != NULL){
		return newNode;
	}else{
		exit(1);
	}
}
void addNodeAtLast(int data){
	Node* newNode = createNode(data);
	if(head == NULL){
		head = newNode;
	}else{
		Node* temp=head;
		while(temp->next != NULL){
			temp = temp->next;
		}
		temp->next = newNode;
	}
}

void addNodeAtStart(int data){
	Node* newNode = createNode(data);
	if(head == NULL){
		head = newNode;
	}else{
		newNode->next = head;
		head = newNode;
	}
}

void deleteNodeFromEnd(){
	if(head == NULL){
		printf("LinkedList is empty\n");
	}else if(head->next == NULL){
		Node* temp = head;
		head = NULL;
		free(temp);
	}else{
		Node* temp = head;
		while(temp->next->next != NULL){
			temp=temp->next;
		}
		free(temp->next);
		temp->next = NULL;
	}
}

void display(){
	if(head != NULL){
		Node* temp = head;
		while(temp != NULL){
			printf("%d ",temp->data);
			temp=temp->next;
		}
		printf("\n");
	}else{
		printf("LinkedList is empty\n");
	}
}

void deleteNodeFromStart(){
	if(head == NULL){
		printf("LinkedList is empty\n");
	}else{
		Node* temp = head;
		head = head->next;
		free(temp);
	}
}

int count(){
	int count = 0;
	Node* temp = head;
	while(temp != NULL){
		temp=temp->next;
		count++;
	}
	return count;
}
int main(){
	int data;
	printf("%d\n",count());
	display();
	printf("Enter the data to be added: ");
	scanf("%d",&data);
	addNodeAtLast(data);
	display();
	printf("Enter the data to be added: ");
	scanf("%d",&data);
	addNodeAtLast(data);
	display();
	printf("Enter the data to be added: ");
	scanf("%d",&data);
	addNodeAtLast(data);
	display();
	printf("Enter the data to be added: ");
	scanf("%d",&data);
	addNodeAtStart(data);
	display();
	printf("Enter the data to be added: ");
	scanf("%d",&data);
	addNodeAtStart(data);
	printf("%d\n",count());
	display();
	deleteNodeFromEnd();
	printf("%d\n",count());
	display();
	deleteNodeFromStart();
	printf("%d\n",count());
	display();
}
