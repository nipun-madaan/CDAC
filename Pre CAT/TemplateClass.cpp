#include<iostream>
using namespace std;
template<class T1, class T2>
class A{
    private:
        T1 x;
        T1 y;
        T2 z;
    public:
        A(){
            x=5;
            y=10;
            z=15;
        }

        A(T1 x, T1 y, T2 z){
            this->x=x;
            this->y=y;
            this->z=z;
        }

        void sum(){
            cout<<"Sum="<<x+y<<endl;
        }

        void print(){
            cout<<"x="<<x<<" & y="<<y<<" & z="<<z<<endl;
        }
};
int main(){
    A<int, int> a1(10,20,30);
    A<double, double> a2(10.5,20.5,30.5);
    A<int,double> a3(20,40,55.5);
    a1.sum();
    a2.sum();
    a3.sum();
    a1.print();
    a2.print();
    a3.print();
}