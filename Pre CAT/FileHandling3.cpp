#include<iostream>
#include<fstream>
using namespace std;

int main(){
    fstream fs;
    fs.open("SangramMohite.txt",ios::app | ios::in | ios::out);
    string line;
    while(fs){
        getline(cin,line);
        if(line=="-1")
            break;
        fs<<line<<endl;
    }
    cout<<"Data entered successfully"<<endl;
    fs.seekg(0,ios::beg);
    while(fs){
        getline(fs,line);
        cout<<line<<endl;
    }
    fs.close();
}