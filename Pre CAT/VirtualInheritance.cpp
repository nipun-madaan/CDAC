#include<iostream>
using namespace std;

class A{
    private:
        int x;
    public:
        A(){
            x=10;
        }
        void print(){
            cout<<"x="<<x<<endl;
        }
};
class B:virtual public A{
    /*void print(){
       cout<<"x="<<x<<endl;
    }*/
};
class C:virtual public A{
    /*void print(){
        cout<<"x="<<x<<endl;
    }*/
};
class D:public B, C{
    /*void print(){     //Through B
        cout<<"x="<<x<<endl;
    }
    void print(){     //Through C
        cout<<"x="<<x<<endl;
    }*/

    //Since there are two print functions derived from B and C respectively. So , it gets
    // ambiquity error. This problem is called Diamond problem. To solve this we need to 
    // make base class as virtual. 
};
int main(){
    D d;
    d.print();
}