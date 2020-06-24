#include<iostream>
using namespace std;
class A{
    private:
        int x;
        int y;
    public:
        A(){

        }
        A(int x, int y){
            this->x=x;
            this->y=y;
        }

        virtual void fun(){
            cout<<"A::fun()"<<endl;
        }

        void print(){
            cout<<"x: "<<x<<" & y: "<<y<<endl;
        }

        virtual void sum(){
            cout<<"Sum: "<<x+y<<endl;
        }
};
class B : public A{
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

        void fun(){
            cout<<"B::fun()"<<endl;
        }

        void print(){
            cout<<"a: "<<a<<" & b: "<<b<<endl;
        }

        /*void sum(){
            cout<<"Sum: "<<a+b<<endl;
        }*/
};
int main(){
    A a1(5,10);
    B b(5,10,15,20);
    A *a;
    a=&b;  //upcasting
   // a=&a1;
    a->fun();
    a->print();
    a->sum();
}