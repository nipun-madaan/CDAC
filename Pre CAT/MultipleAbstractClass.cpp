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
        void add(){
            cout<<"A::add()"<<endl;
        }
        virtual void print()=0;

        virtual void fun()=0;

        virtual void sum()=0;
};
class B: public A{
    private:
        int a;
    public:
        B(){
            a=0;
        }

        B(int x, int a):A(a){
            this->a=a;
        }
        //virtual void print()=0;
        void fun(){
            cout<<"B::fun()"<<endl;
        }
        //virtual void sum()=0;

};
class C : public B{
    private:
        int p;
    public:
        C(){
            p=0;
        }

        C(int x, int a, int p):B(x,a){
            this->p=p;
        }

        void print(){
            cout<<"p="<<p<<endl;
        }
        //virtual void sum()=0;
};
class D: public C{
    private:
        int q;
    public:
        D(){
            q=0;
        }

        D(int x, int a, int p, int q): C(x,a,p){
            this->q=q;
        }

        void sum(){
            cout<<"D::sum()"<<endl;
        }

};
int main(){
    D d(5,10,15,20);
    A *a;
    a=&d;
    a->add();
    a->fun();
    a->print();
    a->sum();
}