//Exception is handled by using two ways:
// 1. try catch block
// 2. throwing exception
#include<iostream>
using namespace std;
int main(){
    int a,b;
    cin>>a>>b;
    cout<<"Before try"<<endl;
    try{
       if(b==0){
           throw 0;
       }else{
           cout<<a/b<<endl;
       }
       cout<<"Inside try"<<endl;
    }catch(int x){
        cout<<"Can't devide by "<<x<<endl;
    }
    catch(...){   //It can handle any type of exception
        cout<<"Default Exception"<<endl;
    }  
    cout<<"After try"<<endl;
}