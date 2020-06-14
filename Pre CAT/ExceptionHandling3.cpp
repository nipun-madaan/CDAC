#include<iostream>
using namespace std;
int main(){
   // int x=-1;
   int x=0;
    try{
        try{
            if(x<=0)
                throw x;
        }catch(int a){
            if(a==0){
                throw 0;
            }
            cout<<"Exception less than zero"<<endl;
        }
    }catch(int b){
        cout<<"Exception zero"<<endl;
    }
}