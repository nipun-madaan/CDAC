#include<iostream>
#include<fstream> //used for file handling
using namespace std;
int main(){
    //ofstream fout("Sample.txt");
    ofstream fout;
    fout.open("Sangram.txt");
    fout<<"Hello World"<<endl;
    fout.close();
    cout<<"Data entered successfully"<<endl;
}