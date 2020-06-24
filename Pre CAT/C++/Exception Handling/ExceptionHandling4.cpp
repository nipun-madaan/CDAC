#include<iostream>
using namespace std;
class A{
    private:
        int x;
    public:
        A(){
            cout<<"Constructor called"<<endl;
            x=5;
        }
        ~A(){
            cout<<"Destructor called"<<endl;
        }

};
int main(){
    try{
        A a;
        throw 10;
        cout<<"main()"<<endl;
    }catch(int x){
        cout<<"Exception Handled"<<endl;
    }
    cout<<"Program End"<<endl;
}