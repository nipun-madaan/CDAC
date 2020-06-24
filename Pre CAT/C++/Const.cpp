#include<iostream>
using namespace std;
class A{
    private:
        const int x=5;   //constant data member;
    public:
        A(){
        //    x=5;   //error because constant data member can only be initialize while declaring
        }

        A(int a):x(a){
            //this->x=x;
            cout<<"A(int) "<<x<<endl;
        }
};

class B{
    public:
        int y=15;
        void show() const{   //constant function
            //y++;   //we can not change the vlue of data members in const functions
        }
        
        void fun(){
            y++;
        }
};

void fun(const int *x){    //const function argument
   // (*x)++;   //error because *x is const
}

void show(const int a){    //const function argument
  //  a++;     //error because a is const
}

const int add(){   //const return type
    return 5; 
}
int main(){
    const int i=5;    //constant variable
    //i++;    //error because i is constant
    //i=7;    //error becuase we can't reintialize the constant variable
    cout<<i<<endl;
    A a(10);

    int j=10;
    const int *p;   //pointer will stores the address of constant integer
    //int const *p
    p=&i;
    //*p=15;   //pointer store the constant integer which can't be changed
    cout<<*p<<endl;

    int* const q=&j;  //pointer is const not the value means address is fixed
    //q=&j;    //error because we have to intialize where we declare
    //q=&i;    //error because pointer itself is constant

    fun(&j);
    j++;
    show(j);

    const B b;   //const objects
   // b.y=20;  //we can'y change the value of data member of const objets

    B c;
    c.show();
    
    b.show();
    //b.fun();    //error because constant object can only call const functions
}