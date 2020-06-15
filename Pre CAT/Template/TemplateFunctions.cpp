#include<iostream>
using namespace std;
//template<typename T>
template<class T>
T sum(T x,T y){
    return x+y;
}
/*double sum(double x, double y){
    return x+y;
}*/
int main(){
    cout<<"Sum="<<sum<int>(10,20) <<endl;
    cout<<"Sum="<<sum<double>(10.5,20.5) <<endl;
}