#include<iostream>
using namespace std;

class A{
    private:
        int x;
        int y;
    public:
        A(){

        }
        A(int x,int y){
            this->x=x;
            this->y=y;
        }

        void sum(){
            cout<<"Sum: "<<x+y<<endl;
        }

        void print(){
            cout<<"x: "<<x<<" & y: "<<y<<endl;
        }
};
class B:public A{
    private:
        int a;
        int b;
    public:
        B(){

        }
        B(int a, int b, int x,int y):A(x,y){
            this->a=a;
            this->b=b;
        }

        void sum(){
            cout<<"a: "<<a<<" & b: "<<b<<endl;
        }

        void fun(){
            cout<<"fun()"<<endl;
        }
};
int main(){
    A a1(5,10);
    B b1(10,20,5,10);
    A *a;     //can store the address of itself or its child class
    B *b;
    //a=&a1;
    //a=&b1;
    //b=&a1;    //error because parent can't be stored in child
    b=&b1;
    //a->sum();
    //a->print();
    //a->fun();   //error because A don't have fun() function and it can't access child class
    b->sum();
    b->print();
    b->fun();
}
