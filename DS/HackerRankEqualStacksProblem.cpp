#include <iostream>

using namespace std;
class Stack{
    private:
        int *arr;
        int size;
        int top;
        int height;
    public:
        Stack(int size){
            this->size=size;
            arr=new int[size];
            top=-1;
            height=0;
        }
        void push(int no){
            arr[++top]=no;
            height=height+no;
        }
        void pop(){
            height=height-arr[top--];
        }
        int getHeight(){
            return height;
        }
        ~Stack(){
            delete[] arr;
        }
};
int main(){
    int n1,n2,n3;
    cin>>n1>>n2>>n3;
    Stack s1(n1),s2(n2),s3(n3);
    int arr1[n1],arr2[n2],arr3[n3];
    for(int i=1;i<=n1;i++){
        cin>>arr1[i];
    }
    for(int i=n1;i>0;i--){
        s1.push(arr1[i]);
    }
    for(int i=1;i<=n2;i++){
        cin>>arr2[i];
       
    }
    for(int i=n2;i>0;i--){
        s2.push(arr2[i]);
    }
    for(int i=1;i<=n3;i++){
        cin>>arr3[i];   
    }
    for(int i=n3;i>0;i--){
         s3.push(arr3[i]);
    }
    while(s1.getHeight() != s2.getHeight() || s2.getHeight() != s3.getHeight() || s3.getHeight() != s1.getHeight()){
        if(s1.getHeight()>=s2.getHeight() && s1.getHeight()>=s3.getHeight()){
            s1.pop();
        }else if(s2.getHeight()>=s1.getHeight() && s2.getHeight()>=s3.getHeight()){
            s2.pop();
        }else if(s3.getHeight()>=s1.getHeight() && s3.getHeight()>=s2.getHeight()){
            s3.pop();
        }
    }
    cout<<s1.getHeight()<<endl;
}