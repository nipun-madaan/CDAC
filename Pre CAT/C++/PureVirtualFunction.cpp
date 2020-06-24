#include<iostream>
using namespace std;

class A{
    private:
        int x;
    public:
        A(){
            x=0;
        }

        A(int x){
            cout<<"A(int)"<<endl;
            this->x=x;
        }

        virtual void fun()=0;  //A function having no body and is assigned value equal to zero then that function is called as pure virtual function.
};
int main(){
    A a(5);  //if there is any pure virtual function in class then we can not create the object of that class
    a.fun();
}