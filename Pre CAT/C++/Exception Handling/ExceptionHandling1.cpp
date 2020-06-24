#include<iostream>
using namespace std;
int main(){
    int x=-1;
    try{
        if(x<0){
           // throw -1;
          // throw 'x';
          throw 2.5;
        }
    }catch(int x){
        cout<<"Exception "<<x<<endl;
    }catch(char x){
        cout<<"Exception "<<x<<endl;
    }
    catch(...){     //Derived class exception should always be handled before base class
        cout<<"Default Exception"<<endl;
    }
}