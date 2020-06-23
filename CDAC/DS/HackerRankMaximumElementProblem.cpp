#include<iostream>
using namespace std;

class Stack{
  private:
    int arr[100000];
    int top;
  public:
    Stack(){
        top=-1;
    }
    bool isEmpty(){
        if(top==-1)
            return true;
        else
            return false;
    }
    void push(int no){
        arr[++top]=no;
    }
    void pop(){
        top--;
    }
    int getMax(){
        return arr[top];
    }
    
};
int main() {
    int N,x,type;
    cin>>N;
    Stack s,max;
    for(int i=0;i<N;i++){
        cin>>type;
        switch(type){
            case 1:
                cin>>x;
                s.push(x);
                if(max.isEmpty()){
                    max.push(x);
                }else{
                    x>max.getMax()?max.push(x):max.push(max.getMax());
                }
                break;
            case 2:
                s.pop();
                max.pop();
                break;
            case 3:
                cout<<max.getMax()<<endl;
                break;
        }
    }
    return 0;
}