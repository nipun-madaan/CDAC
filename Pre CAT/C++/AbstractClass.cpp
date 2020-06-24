#include<iostream>
using namespace std;

class A{   //Class having at least one pure virual function then that class is called as abstract class.
    private:
        int x;
        int y;
    public:
        A(){
            x=0;
            y=0;
        }
        
        A(int x, int y){
            this->x=x;
            this->y=y;
        }

        virtual void fun()=0;

};
class B: public A{
    private:
        int a;
        int b;
    public:
        B(){
            a=0;
            b=0;
        }

        B(int x, int y, int a, int b):A(x,y){
            this->a=a;
            this->b=b;
        }

        void fun(){
            cout<<"B::fun()"<<endl;
        }
        void print(){
            cout<<"a="<<a<<" & b="<<b<<endl;
        }
};
int main(){
    B b(5,10,15,20);
    A *a;  //We can take pointer of abstract class but can't make object of it.
    a=&b;
    a->fun();
}