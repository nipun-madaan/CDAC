#include<iostream>
using namespace std;

class A{  //Interface is a class that have all the functions as pure virtual functions.
    private:
        int x;
        int y;
    public:
        A(){
            x=0;
            y=0;
        }

        A(int x,int y){
            this->x=x;
            this->y=y;
        }

        virtual void print()=0;
        virtual void sum()=0;
        virtual void sub()=0;
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

        B(int a, int b){
            this->a=a;
            this->b=b;
        }
        void print(){
            cout<<"a="<<a<<" & b="<<b<<endl;
        }
        
        void sum(){
            cout<<"Sum="<<a+b<<endl;
        }

        void sub(){
            cout<<"Sub="<<a-b<<endl;
        }
};
int main(){
    B b(20,10);
    A *a;   //We can take pointer of interface but can't make object of it.
    a=&b;
    a->print();
    a->sum();
    a->sub();
}