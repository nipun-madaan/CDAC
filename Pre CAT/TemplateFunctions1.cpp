#include<iostream>
using namespace std;
//template<typename T>
template<class T1, class T2>
T2 sum(T1 x,T2 y){
    return x+y;
}
/*double sum(double x, double y){
    return x+y;
}*/
int main(){
    cout<<"Sum="<<sum<int, double>(10,20.5) <<endl;
    cout<<"Sum="<<sum<double, double>(10.5,20.5) <<endl;
}