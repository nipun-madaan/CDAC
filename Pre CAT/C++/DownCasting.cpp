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
            this->x=x;
        }
        
        virtual void print(){
            cout<<"x: "<<x<<endl;
        }
};
class B: public A{
    private:
        int a;
    public:
        B(){
            a=0;
        }

        B(int x,int a): A(x){
            this->a=a;
        }

        void print(){
            cout<<"a: "<<a<<endl;
        }
};
int main(){
    B b(5,10);
    A *a = &b;    //upcasting
    B *b1 = (B*)a;   //downcasting   B *b = &b;
    b1->print();
}