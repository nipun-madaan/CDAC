#include<iostream>
using namespace std;
void fun(int *ptr, int x) throw (int*, int){ //ideal approach
    if(ptr == NULL){
        throw ptr;
    }
    if(x==0){
        throw x;
    }
}
int main(){
    try{
        //fun(NULL,5);   //throw ptr
        //fun(NULL,0);    //throw ptr
        int x=5;
        int *a=&x;
        fun(a,0);       //throw x
    }catch(...){
        cout<<"Exception from fun()"<<endl;
    }
}