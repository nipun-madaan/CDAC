#include<iostream>
#include<fstream>
using namespace std;

int main(){
    ofstream fout;
    fout.open("Sample1.txt",ios::app); //by default mode is out  && app - append
        // ate - at the end
        //trunc - truncate
    fout<<"He is genius in CPP."<<endl;
    fout.close();
    cout<<"Data entered successfully"<<endl;
}